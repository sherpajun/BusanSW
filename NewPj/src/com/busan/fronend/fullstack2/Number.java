package com.busan.fullstack2;

public class Number  implements Student{
	String name;
	
	public Number() {
		
	}
	
	
	public Number(String name) {
		
		this.name=name;}
	
	
	@Override
	public void studentId() {
		System.out.println(name+"�л�ID");
		
	}

	@Override
	public void studentClass() {
		System.out.println(name+"�л����ǹ�ȣ");
		
	}

}
