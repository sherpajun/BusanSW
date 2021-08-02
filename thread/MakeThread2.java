package com.busan.fronend.thread;

public class MakeThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
			int result = 0;
			for(int i=1;i<100;i++) {
				result = result+i;
			}
			System.out.println(result);
			
		
	}
	

}
