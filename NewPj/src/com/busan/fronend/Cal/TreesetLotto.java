package com.busan.fronend.Cal;

import java.util.Random;
import java.util.TreeSet;

public class TreesetLotto {

	public void test() {
		Random om = new Random();
		TreeSet<Integer> it = new TreeSet<>();
	
		while(it.size()<6) {
			it.add(om.nextInt(45)+1);
		}
		
		System.out.println(it);
	}
	
	public static void main(String[]args) {
		TreesetLotto tst = new TreesetLotto();
		tst.test();
	}
}
