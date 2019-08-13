package com.itsallbinary.staticanalysis;

public class AnalyzeMeGoodCode {

	public static void main(String[] args) {
		System.out.println("This is a sample class to analyze. This code has no issues.");

		// NON Empty synchronized block. Should NOT be marked as problem in static
		// analysis.
		synchronized (AnalyzeMeGoodCode.class) {
			System.out.println("Test synchronized block");
		}
	}
}
