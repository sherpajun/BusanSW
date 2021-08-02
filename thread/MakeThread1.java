package com.busan.fronend.thread;

public class MakeThread1 extends Thread{

	@Override
	public void run() {
		int result = 0;
		for(int i=1;i<100;i++) {
			result = result+i;
		}
		System.out.println(result);
		
	}
	
	

}
