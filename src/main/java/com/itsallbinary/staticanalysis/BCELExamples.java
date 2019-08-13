package com.itsallbinary.staticanalysis;

import java.io.IOException;

import org.apache.bcel.Const;
import org.apache.bcel.Repository;
import org.apache.bcel.classfile.ClassFormatException;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.util.ByteSequence;

public class BCELExamples {

	public static void main(String[] args) throws ClassFormatException, IOException, ClassNotFoundException {

		// Classes to analyze.
		Class<?>[] classesToAnalyze = new Class[] { AnalyzeMeGoodCode.class, AnalyzeMeBadCode.class };

		for (Class<?> classToAnalyze : classesToAnalyze) {

			// Lookup class which needs to be statically analyzed.
			JavaClass javaClass = Repository.lookupClass(classToAnalyze);

			boolean hasEmptySyncBlock = false;
			int lineNumberOfEmptySyncBlock = -1;

			// Iterate through all the methods of this class.
			for (Method method : javaClass.getMethods()) {

				// Get byte code of source code for this method
				byte[] code = method.getCode().getCode();

				try (ByteSequence stream = new ByteSequence(code)) {

					short previousOpCode = -1;

					// Iterate through bytes stream till bytes are available.
					for (int i = 0; stream.available() > 0; i++) {

						// Get line number
						int lineNumber = stream.getIndex();

						// Find out JVM instruction opcode for this line of code.
						short opCode = (short) stream.readUnsignedByte();

						// Uncomment below line to see all op codes.
						// System.out.println(lineNumber + " = " + Const.getOpcodeName(opCode));

						/*
						 * If previous line of code was start of synchronized block & this line of code
						 * is end of synchronized block, that means there is an empty synchronized
						 * block. Mark this as problem.
						 */
						if (previousOpCode != -1 && Const.MONITORENTER == previousOpCode
								&& Const.MONITOREXIT == opCode) {

							hasEmptySyncBlock = true;
							lineNumberOfEmptySyncBlock = lineNumber;
						}

						previousOpCode = opCode;

					}
				} catch (final IOException e) {
					e.printStackTrace();
				}

			}

			// Output the result of analysis.
			if (hasEmptySyncBlock) {
				System.out.println("##### PROBLEM: \n\tClass = " + classToAnalyze.getName() + " | Line Number = "
						+ lineNumberOfEmptySyncBlock
						+ "\n\tError = Empty synchronized block found. Please verify & remove if not needed.");

			} else {
				System.out.println("##### ALL GOOD. Class = " + classToAnalyze.getName());

			}

		}

	}

}
