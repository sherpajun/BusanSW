package com.busan.fronend.Iot;

import java.util.ArrayList;

public class ArrayListTest {

	ArrayList<Iot> ar;
	long time;
	
	public void test() {
		time=System.currentTimeMillis();
		System.out.println(time);
		//ar= new Array<Iot>();
		//JDK 1.7부터 사용 가능
		ar= new ArrayList<>();
		ar.add(new Cell());
		ar.add(new Mov());
		System.out.println(ar.size());
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
			for(Iot aa : ar) {
				aa.volumeUp();
				aa.volumeDown();
			}
	System.out.println(System.currentTimeMillis()-time);
	
	}
	
	
	
}
