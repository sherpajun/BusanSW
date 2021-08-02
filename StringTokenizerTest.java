package com.busan.fronend;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public void test() {
		String test1="qoui fjlkjqruin qwlkjlkjf lkjdflkjqlkj aaa";
		StringTokenizer st1 = new StringTokenizer(test1);
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		String test = "a*qwjllkj*jlzljlkjvlkj*qqq";
		StringTokenizer st = new StringTokenizer(test,"*");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}



	}
	public static void main(String[] args) {
		StringTokenizerTest stt = new StringTokenizerTest();
		stt.test();
	}
}
