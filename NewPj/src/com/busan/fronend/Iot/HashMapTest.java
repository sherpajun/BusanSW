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
		
		
		//Key값만 리턴
		Set<String> keys=it.keySet();
		for(String key : keys) {
			System.out.println(key);
		}

		//value값만 리턴
		Collection<Iot> values=it.values();
		for(Iot value : values) {
			System.out.println(value);
		}
		//key와 value를 같이 리턴
		Set<Entry<String, Iot>> entry=it.entrySet();
			for(Entry<String, Iot> aa: entry) {
				System.out.println(aa.getKey());
				System.out.println(aa.getValue());
			}

	}
}
