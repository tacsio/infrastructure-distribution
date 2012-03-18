package compiler.ast;

import org.antlr.runtime.Token;

import compiler.Visitor;

public class Metodo extends Node {

	public Metodo(Token payload) {
		super(payload);
	}

	@Override
	public Object accept(Visitor visitor, Object o) {
		return visitor.visit(this, o);
	}

}
