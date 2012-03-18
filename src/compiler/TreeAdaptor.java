package compiler;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;

import compiler.ast.Interface;
import compiler.ast.ListParams;
import compiler.ast.Metodo;
import compiler.ast.Param;
import compiler.parser.IDLParser;

public class TreeAdaptor extends CommonTreeAdaptor {

	@Override
	public Object create(Token payload) {

		if (payload != null) {
			switch (payload.getType()) {

			case IDLParser.INTERFACE:
				return new Interface(payload);
			case IDLParser.METODO:
				return new Metodo(payload);
			case IDLParser.LIST_PARAM:
				return new ListParams(payload);
			case IDLParser.PARAM:
				return new Param(payload);
			}
		}
		return super.create(payload);
	}
}
