package com.tnsif.Synchronization;

public class Thread2 implements Runnable{
	
	private ThreadDemo td;
	public Thread2(ThreadDemo td) {
		this.td=td;
	}
	@Override
	public void run() {
		td.deposit(70000);
	}
	public ThreadDemo getTd() {
		return td;
	}
	public void setTd(ThreadDemo td) {
		this.td = td;
	}

}