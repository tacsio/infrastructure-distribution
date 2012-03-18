package middleware.distribuicao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

import middleware.services.nameservice.Naming;
import middleware.util.Configuracao;

public class Requestor {

	private ClientRequestHandler clientRequestHandler;

	public int invoke(String method, Object... params) {

		String providers = Naming.skyNet(method);

		int indexName = 0;
		int indexPorta = 0;
		String endereco = "";
		String porta = "";
		Vector<Configuracao> hosts = new Vector<Configuracao>();
		for (int i = 0; i < providers.length(); i++) {

			if (providers.charAt(i) == ':') {
				indexPorta = i;
				endereco = providers.substring(indexName + 1, indexPorta);

			} else if (providers.charAt(i) == '/' && i > 2) {
				porta = providers.substring(indexPorta + 1, i);
				indexName = i;
				hosts.add(new Configuracao(endereco, Integer.parseInt(porta)));
			}
		}

		Configuracao lider = hosts.get(0);
		clientRequestHandler = ClientRequestHandler.getInstance(
				lider.getHost(), lider.getPort());

		Message msg = new Message(method, params);
		clientRequestHandler.send(msg.getBytes());

		Integer retorno = null;
		retorno = (Integer) clientRequestHandler.receive();

		return retorno;

	}

	public int[] invoke(String method, int[] list) {

		// Descobre os provedores de servicos
		String providers = Naming.skyNet(method);
		int indexName = 0;
		int indexPorta = 0;
		String endereco = "";
		String porta = "";
		Vector<Configuracao> hosts = new Vector<Configuracao>();
		for (int i = 0; i < providers.length(); i++) {

			if (providers.charAt(i) == ':') {
				indexPorta = i;
				endereco = providers.substring(indexName + 1, indexPorta);

			} else if (providers.charAt(i) == '/' && i > 2) {
				porta = providers.substring(indexPorta + 1, i);
				indexName = i;
				hosts.add(new Configuracao(endereco, Integer.parseInt(porta)));
			}
		}
		// recuperacao do rank
		HashMap<Integer, Configuracao> rank = new HashMap<Integer, Configuracao>();

		int[] scores = new int[hosts.size()];
		Message requestScore = new Message("getMachineRank", 1);
		for (int i = 0; i < hosts.size(); i++) {
			Configuracao temp = hosts.get(i);
			clientRequestHandler = ClientRequestHandler.getInstance(
					temp.getHost(), temp.getPort());
			clientRequestHandler.send(requestScore.getBytes());
			int score = (Integer) clientRequestHandler.receive();
			scores[i] = score;

			rank.put(i, hosts.get(i));
		}

		int[] retorno = null;

		// FIXME: distribuicao de carga
		if (list.length < rank.size() || rank.size() == 1) {
			Configuracao lider = rank.get(0);
			clientRequestHandler = ClientRequestHandler.getInstance(
					lider.getHost(), lider.getPort());

			Message msg = new Message(method, list);
			clientRequestHandler.send(msg.getBytes(list));

			retorno = (int[]) clientRequestHandler.receive();

		} else {
			// FIXME: organizar divisao
			int[] div1 = new int[list.length / 2];
			int[] div2 = new int[(list.length - div1.length)];

			for (int i = 0; i < div1.length; i++) {
				div1[i] = list[i];
			}
			for (int i = 0; i < div2.length; i++) {
				div2[i] = list[i + div1.length];
			}

			Message m1 = new Message(method, div1);
			clientRequestHandler = ClientRequestHandler.getInstance(hosts
					.get(0).getHost(), hosts.get(0).getPort());
			clientRequestHandler.msg = m1.getBytes();
			new Thread(clientRequestHandler).run();

			int ret1[] = (int[]) clientRequestHandler.receive();

			Message m2 = new Message(method, div2);
			clientRequestHandler = ClientRequestHandler.getInstance(hosts
					.get(1).getHost(), hosts.get(1).getPort());
			clientRequestHandler.msg = m2.getBytes();
			new Thread(clientRequestHandler).run();
			int ret2[] = (int[]) clientRequestHandler.receive();

			// FIXME: agrupamento de resultados
			ArrayList<Integer> l = new ArrayList<Integer>(list.length);
			retorno = new int[list.length];
			for (int i = 0; i < ret1.length; i++) {
				l.add(ret1[i]);
			}
			for (int i = 0; i < ret2.length; i++) {
				l.add(ret2[i]);
			}
			
			Collections.sort(l);
			retorno = new int[list.length];
			
			//FIXME: intercala
			for(int i = 0; i < list.length; i++){
				retorno[i] = l.get(i);
			}
		}

		return retorno;
	}
}
