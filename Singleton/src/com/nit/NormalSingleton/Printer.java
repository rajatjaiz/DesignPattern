package com.nit.NormalSingleton;

public class Printer {
	private static  Printer instance;
	
	private Printer() {}
	
	public static Printer getInstance() {
		if(instance == null)
			instance  = new Printer();
		return instance;
	}
}
