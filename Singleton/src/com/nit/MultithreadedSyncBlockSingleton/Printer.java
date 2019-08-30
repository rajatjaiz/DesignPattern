package com.nit.MultithreadedSyncBlockSingleton;

public class Printer {
	private static  Printer instance;
	
	private Printer() {}
	
	public static Printer getInstance() {
		synchronized (Printer.class) {
			if(instance == null)
				instance  = new Printer();
		}
		return instance;
	}
}
