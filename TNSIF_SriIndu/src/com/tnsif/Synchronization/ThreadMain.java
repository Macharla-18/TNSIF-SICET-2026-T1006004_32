package com.tnsif.Synchronization;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		Thread t1=new Thread(new Thread1(td));
		Thread t2=new Thread(new Thread2(td));
		t1.start();
		t2.start();
	}

}