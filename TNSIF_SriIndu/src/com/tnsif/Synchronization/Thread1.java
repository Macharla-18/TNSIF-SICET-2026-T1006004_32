package com.tnsif.Synchronization;

public class Thread1 implements Runnable{
	
	private ThreadDemo td;
	public Thread1(ThreadDemo td) {
		this.td=td;
	}
	@Override
	public void run() {
		td.withdraw(4000);
	}
	public ThreadDemo getTd() {
		return td;
	}
	public void setTd(ThreadDemo td) {
		this.td = td;
	}
}