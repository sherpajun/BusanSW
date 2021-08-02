package com.busan.fronend.thread;

public class Consumer extends Thread {

	@Override
	public void run() {
		while(true) {
			try {
				HamTestMain.sp.buy();
				this.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}



}
