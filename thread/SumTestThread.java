package com.busan.fronend.thread;

public class SumTestThread extends Thread{
	long amount;
	
	public SumTestThread(long amount) {
		this.amount=amount;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long before = System.currentTimeMillis();
		for(long i=amount-3_000_000_000L;i<=amount;i++) {
			ThreadMain.total=ThreadMain.total+i;
		}
	System.out.println(System.currentTimeMillis()-before);
	System.out.println(ThreadMain.total);
	}
	

}
