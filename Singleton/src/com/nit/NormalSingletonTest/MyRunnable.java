package com.nit.NormalSingletonTest;

import com.nit.NormalSingleton.Printer;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+":  Myrunnable.run()");
		Printer p1 = Printer.getInstance();
		System.out.println(p1);
	}

}
