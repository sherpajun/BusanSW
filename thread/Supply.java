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
		System.out.println(j+" ��° �ܹ��� ����");
		notify();
		j++;
	}

	public synchronized void buy() {
		Thread t = Thread.currentThread();
		while(ham==0) {
			System.out.println("�ܹ��� ���ȸ�");
			System.out.println("wait�� ������"+t.getName());
			try {
				wait();
				System.out.println("wait���� ��� ������"+t.getName());
				System.out.println("������ ����"+ t.getState());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		ham= ham-1;
		System.out.println(t.getName()+" " +i+ " ��°�ܹ��� �ȸ�");
		i++;
	}





}
