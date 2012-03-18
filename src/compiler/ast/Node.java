package compiler.ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import compiler.Visitor;

public abstract class Node extends CommonTree {

	public Node(Token payload) {
		super(payload);
	}

	public abstract Object accept(Visitor visitor, Object o);
}
