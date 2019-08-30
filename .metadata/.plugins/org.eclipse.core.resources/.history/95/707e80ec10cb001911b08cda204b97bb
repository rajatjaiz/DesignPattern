package com.nit.MultithreadedSyncBlockSingletonTest;

import com.nit.MultithreadedSyncBlockSingleton.Printer;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+":  Myrunnable.run()");
		Printer p1 = Printer.getInstance();
		System.out.println(p1);
	}

}
