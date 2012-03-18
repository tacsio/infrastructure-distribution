package compiler;

import java.util.Vector;

import compiler.ast.Interface;
import compiler.ast.ListParams;
import compiler.ast.Metodo;
import compiler.ast.Param;

public class Encoder implements Visitor {

	private StringBuffer clientProxy;
	private StringBuffer invoker;
	private StringBuffer requestor;

	public static final int NOME_METODO = 0;
	public static final int TIPO_RETORNO = 1;
	public static final int PARAMETROS = 2;
	public static final int TIPO_PARAMETRO = 0;
	public static final int NOME_PARAMETRO = 1;

	@Override
	public Object visit(Interface root, Object o) {

		clientProxy = new StringBuffer();
		invoker = new StringBuffer();
		requestor = new StringBuffer();

		clientProxy.append("public class ClientProxy {\n\n");
		clientProxy.append("	private Requestor requestor;\n\n");
		clientProxy.append("	public ClientProxy() {\n");
		clientProxy.append("		requestor = new Requestor();\n	}\n\n");

		invoker.append("public class Invoker {\n\n");
		invoker.append("	private Exercicio1 serverRequestHandler;\n");
		invoker.append("	private Aplicacao_2 remoteObject;\n\n");
		invoker.append("	public Invoker() {\n");
		invoker.append("		serverRequestHandler = new Exercicio1();\n");
		invoker.append("		invoke();\n	}\n\n");
		invoker.append("	public void invoke() {\n\n");
		invoker.append("		byte[] msg = (byte[]) serverRequestHandler.receive();\n");
		invoker.append("		Message m = Message.getMessage(msg);\n\n");
		invoker.append("		String method = m.getMessage(msg);\n\n");
		invoker.append("		Object[] parametro = m.getParams();\n");
		invoker.append("		remoteObject = new Aplicacao_2;\n\n");
		invoker.append("		Object retorno = null;\n");

		requestor.append("public class Requestor {\n\n");
		requestor.append("	private Exercicio1 clienteRequestHandler;\n\n");
		requestor.append("	public Requestor() {\n");
		requestor.append("		clientRequestHandler = new Exercicio1();\n	}\n\n");

		int i = 0;
		while (root.getChild(i) != null) {
			Metodo metodo = (Metodo) root.getChild(i);
			metodo.accept(this, null);
			i++;
		}
		requestor.append("}");
		clientProxy.append("}");
		
		invoker.append("		try {\n		Thread.sleep(200);\n");
		invoker.append("		} catch (InterruptedException e) {\n");
		invoker.append("			e.getMessage();\n		}\n\n");
		invoker.append("		serverRequestHandler.send(retorno);\n	}\n\n");
		
		invoker.append("	public static void main(String[] args) {\n");
		invoker.append("		new Invoker();\n	}\n}");

		//System.out.println(clientProxy);
		//System.out.println(requestor);
		//System.out.println(invoker);
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object visit(Metodo metodo, Object o) {

		clientProxy.append("	public ");
		clientProxy.append(metodo.getChild(TIPO_RETORNO) + " ");
		clientProxy.append(metodo.getChild(NOME_METODO) + "(");

		requestor.append("	public " + metodo.getChild(TIPO_RETORNO)
				+ " inkove(");

		ListParams params = (ListParams) metodo.getChild(PARAMETROS);
		Vector<String> names = (Vector<String>) params.accept(this, null);

		invoker.append("		if(method.equalsIgnoreCase(\""
				+ metodo.getChild(NOME_METODO)
				+ "\")) {\n			retorno = remoteObject."
				+ metodo.getChild(NOME_METODO) + "(");

		requestor.append(") {\n\n");
		requestor.append("		Message msg = new Message(method, params);\n");
		requestor.append("		clientRequestHandler.send(msg.getBytes());\n\n");
		requestor.append("		try {\n			Thread.sleep(200);\n");
		requestor.append("		} catch (InterruptedException e) {\n");
		requestor.append("			e.getMessage();\n		}\n");
		requestor.append("		" + metodo.getChild(TIPO_RETORNO)
				+ " retorno = null;\n");
		requestor.append("		retorno = clientRequestHandler.receive();\n\n");
		requestor.append("		return retorno;\n	}\n\n");
		

		for (int i = 0; i < names.size(); i++) {
			if (i + 1 == names.size()) {
				invoker.append("parametro[" + i + "]");
			} else {
				invoker.append("parametro[" + i + "], ");
			}
		}
		invoker.append(");\n		}\n");

		clientProxy.append(") {\n	");
		clientProxy.append("	" + metodo.getChild(TIPO_RETORNO) + " retorno");
		clientProxy.append(" = requestor.invoke(" + "\""
				+ metodo.getChild(NOME_METODO) + "\", ");

		java.util.Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			clientProxy.append(iterator.next());
			if (iterator.hasNext()) {
				clientProxy.append(", ");
			} else {
				clientProxy.append(");\n");
			}
		}

		clientProxy.append("		");
		clientProxy.append("return retorno;\n	}\n\n");

		return null;
	}

	@Override
	public Object visit(ListParams params, Object o) {

		Vector<String> names = new Vector<String>();
		int i = 0;
		int count = params.getChildCount();
		while (params.getChild(i) != null) {
			Param param = (Param) params.getChild(i);
			String temp = (String) param.accept(this, null);
			names.add(temp);
			i++;
			if (count != i) {
				clientProxy.append(", ");
				requestor.append(", ");
			}
		}

		return names;
	}

	@Override
	public Object visit(Param param, Object o) {

		String name = param.getChild(NOME_PARAMETRO).toString();
		clientProxy.append(param.getChild(TIPO_PARAMETRO) + " "
				+ param.getChild(NOME_PARAMETRO));

		requestor.append(param.getChild(TIPO_PARAMETRO) + " "
				+ param.getChild(NOME_PARAMETRO));

		return name;
	}

}
