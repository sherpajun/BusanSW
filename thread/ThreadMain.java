package com.busan.fronend.thread;

public class ThreadMain {
	static long total = 0;
	public static void main(String[] args) {
//		MakeThread1 m1 = new MakeThread1();
//		MakeThread1 m2 = new MakeThread1();
//		MakeThread1 m3 = new MakeThread1();
//		m1.start();
//		m2.start();
//		m3.start();
//
//		MakeThread2 m4 = new MakeThread2();
//		MakeThread2 m5 = new MakeThread2();
//		MakeThread2 m6 = new MakeThread2();
//
//		new Thread(m4).start();
//		new Thread(m5).start();
//		new Thread(m6).start();
	
//	SumTest st = new SumTest();
//	st.test();
	
		SumTestThread stt = new SumTestThread(3_000_000_000L);
		SumTestThread stt1 = new SumTestThread(6_000_000_000L);
		SumTestThread stt2 = new SumTestThread(9_000_000_000L);
	
		stt.start();
		stt1.start();
		stt2.start();
	}
}
