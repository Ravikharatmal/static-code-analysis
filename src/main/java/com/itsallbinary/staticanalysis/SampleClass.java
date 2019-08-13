package com.itsallbinary.staticanalysis;

public class SampleClass {

	public static void main(String[] args) {
		System.out.println("This is a sample class.");

		int a = 1;
		double b = 2;

		double c = a + b;

		print(c);

		// Empty synchronized block
		synchronized (SampleClass.class) {
			// System.out.println();
		}

		try {
		} catch (Exception e) {
		}
	}

	public static void print(Object obj) {
		System.out.println("OBJ = " + obj);
	}

}
