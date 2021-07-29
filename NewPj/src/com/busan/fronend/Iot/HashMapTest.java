package com.busan.fronend.Iot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	
	
	HashMap<String,Iot> it;

	public void test() {
		it= new HashMap<>();
		it.put("1st",new Cell());
		it.put("2st",new Mov());

		Iot cl=it.get("2st");
		cl.volumeUp();
		cl.volumeDown();
		
		System.out.println("----------------------");
		
		
		//Key���� ����
		Set<String> keys=it.keySet();
		for(String key : keys) {
			System.out.println(key);
		}

		//value���� ����
		Collection<Iot> values=it.values();
		for(Iot value : values) {
			System.out.println(value);
		}
		//key�� value�� ���� ����
		Set<Entry<String, Iot>> entry=it.entrySet();
			for(Entry<String, Iot> aa: entry) {
				System.out.println(aa.getKey());
				System.out.println(aa.getValue());
			}

	}
}
