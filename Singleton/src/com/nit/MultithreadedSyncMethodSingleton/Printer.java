package com.nit.MultithreadedSyncMethodSingleton;

public class Printer {
	private static  Printer instance;
	
	private Printer() {}
	
	public static synchronized Printer getInstance() {
		if(instance == null)
			instance  = new Printer();
		return instance;
	}
}
