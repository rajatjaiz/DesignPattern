package com.nit.EagerInstantiationSingleton;

public class Printer {
	private static  Printer instance = new Printer();
	
	private Printer() {}
	
	public static Printer getInstance() {
		return instance;
	}
}
