package com.itsallbinary.staticanalysis;

public class AnalyzeMeBadCode {

	public static void main(String[] args) {
		System.out
				.println("This is a sample class to analyze. This code has an issue due to empty synchronized block.");

		// Empty synchronized block. Should be marked as problem in static analysis.
		synchronized (AnalyzeMeBadCode.class) {

		}
		System.out.println();
	}
}
