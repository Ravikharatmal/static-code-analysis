package com.itsallbinary.staticanalysis;

import java.util.regex.Pattern;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.itsallbinary.grammer.java9.Java9BaseListener;
import com.itsallbinary.grammer.java9.Java9Lexer;
import com.itsallbinary.grammer.java9.Java9Parser;
import com.itsallbinary.grammer.java9.Java9Parser.ClassDeclarationContext;

public class AntlrExamples {

	public static void main(String[] args) {

		// Class code to perform static code analysis on. You may read it from ".java"
		// files.
		String[] classes = new String[] { "public abstract class AbstractPerson { void work(){} }",

				"public class AbstractPerson { void work(){} }",

				"public abstract class JustPerson { void work(){} }" };

		// Iterate on class codes.
		for (String classCode : classes) {

			// Prepare lexer & parser from code.
			CodePointCharStream inputStream = CharStreams.fromString(classCode);
			Java9Lexer Java9Lexer = new Java9Lexer(inputStream);
			CommonTokenStream commonTokenStream = new CommonTokenStream(Java9Lexer);
			Java9Parser java8Parser = new Java9Parser(commonTokenStream);

			// Prepare parse tree or AST (Abstract Syntax Tree)
			ParseTree tree = java8Parser.compilationUnit();

			// Register listener class which will perform checks.
			ClassNameOfAbstractClassListener listener = new ClassNameOfAbstractClassListener();
			ParseTreeWalker walker = new ParseTreeWalker();

			// Walk method will walk through all tokens & call appropriate listener methods
			// where we will perform checks.
			walker.walk(listener, tree);
		}

	}

}

/**
 * Listener class which verifies that abstract class must have name starting
 * with Abstract. Errors will be printed to console.
 *
 */
class ClassNameOfAbstractClassListener extends Java9BaseListener {

	// Walk method will call this method when it comes across a token which is a
	// class declaration.
	@Override
	public void enterClassDeclaration(ClassDeclarationContext ctx) {
		// Fetch class name from the token.
		String className = ctx.normalClassDeclaration().identifier().getText();

		// Check if the class from this token is abstract.
		boolean isAbstract = ctx.normalClassDeclaration().classModifier().stream().anyMatch(m -> m.ABSTRACT() != null);

		// Regex pattern to verify name starts with word Abstract
		Pattern format = Pattern.compile("^Abstract.+$");
		boolean matching = format.matcher(className).find();
		System.out.println("\nClass Name = " + className + " | Is Abstract? = " + isAbstract);

		// Perform checks & print result in console.
		if (isAbstract && !matching) {
			System.out.println("Problem: Abstract class but name does not start with 'Abstract'");
		} else if (!isAbstract && matching) {
			System.out.println("Problem: Not an Abstract class but name starts with 'Abstract'");
		} else {
			System.out.println("Class declaration is all good.");
		}

	}

}
