package com.busan.fronend.thread;

public class Supply extends Thread{
	int ham = 10;
	int j = 1;
	int i = 1;
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
				make();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void make() {
		ham=ham+1;
		System.out.println(j+" 번째 햄버거 공급");
		notify();
		j++;
	}

	public synchronized void buy() {
		Thread t = Thread.currentThread();
		while(ham==0) {
			System.out.println("햄버거 다팔림");
			System.out.println("wait된 쓰레드"+t.getName());
			try {
				wait();
				System.out.println("wait에서 깨어난 쓰레드"+t.getName());
				System.out.println("쓰레드 상태"+ t.getState());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		ham= ham-1;
		System.out.println(t.getName()+" " +i+ " 번째햄버거 팔림");
		i++;
	}





}
