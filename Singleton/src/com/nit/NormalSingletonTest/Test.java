package com.nit.NormalSingletonTest;

import com.nit.NormalSingleton.Printer;

public class Test {

	public static void main(String[] args) {
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		Printer p3 = Printer.getInstance();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
//		MyRunnable mr = new MyRunnable();
//		Thread t1 = new Thread(mr);
//		Thread t2 = new Thread(mr);
//		Thread t3 = new Thread(mr);
//		
//		t1.start();
//		t2.start();
//		t3.start();
	}

}
