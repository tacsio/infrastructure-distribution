package compiler;

import compiler.ast.Interface;
import compiler.ast.ListParams;
import compiler.ast.Metodo;
import compiler.ast.Param;

public interface Visitor {

	public Object visit(Interface root, Object o);

	public Object visit(Metodo metodo, Object o);

	public Object visit(ListParams params, Object o);

	public Object visit(Param param, Object o);

}
