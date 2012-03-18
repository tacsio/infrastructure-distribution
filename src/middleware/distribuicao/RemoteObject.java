package middleware.distribuicao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import middleware.proxies.IDL;

//Remote Object
public class RemoteObject implements IDL {

	@Override
	public int convertCelsiusToKelvin(int temperatura) {
		return temperatura + 273;
	}

	@Override
	public int convertKelvinToCelsius(int temperatura) {

		return temperatura - 273;
	}

	@Override
	public int[] ord(int[] list) {

		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < list.length; i++) {
			temp.add(list[i]);
		}

		Collections.sort(temp);
		int ret[] = new int[temp.size()];
		for (int i = 0; i < temp.size(); i++) {
			ret[i] = temp.get(i);
		}

		return ret;
	}

	public int getMachineRank() {

		Runtime runtime = Runtime.getRuntime();
		int numProcessadores = runtime.availableProcessors();
		long freeMem = runtime.freeMemory();
		long totalMem = runtime.totalMemory();
		int numProcess = 0;
		Process proc;
		try {
			proc = runtime.exec("tasklist");
			InputStream in = proc.getInputStream();
			InputStreamReader inr = new InputStreamReader(in);
			BufferedReader bfr = new BufferedReader(inr);

			while (bfr.readLine() != null) {
				numProcess += 1;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		/**
		 * Machine Rank
		 * 
		 * Rank da maquina, para multiplexar a quantidade de carga a ser
		 * carregado
		 * 
		 * @NAME @PESO numumero de processadores 5 memoria livre (em GB) 1
		 *       memoria total (em GB) 1 numero de processos rodando 4
		 * 
		 */

		int retorno = 0;

		retorno = (int) (numProcess * 4 + numProcessadores * 5 + freeMem + totalMem);

		return retorno;
	}
}
