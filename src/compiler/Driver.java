package compiler;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import compiler.ast.Interface;
import compiler.parser.IDLLexer;
import compiler.parser.IDLParser;

public class Driver {
	public static void main(String[] args) {
		try {
			ANTLRFileStream file = new ANTLRFileStream("IDL");

			IDLLexer lexer = new IDLLexer(file);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			IDLParser parser = new IDLParser(tokens);
			parser.setTreeAdaptor(new TreeAdaptor());

			Interface root = (Interface) parser.interface_().getTree();
			Encoder encoder = new Encoder();
			encoder.visit(root, null);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
	}
}
