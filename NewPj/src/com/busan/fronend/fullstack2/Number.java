package com.busan.fullstack2;

public class Number  implements Student{
	String name;
	
	public Number() {
		
	}
	
	
	public Number(String name) {
		
		this.name=name;}
	
	
	@Override
	public void studentId() {
		System.out.println(name+"학생ID");
		
	}

	@Override
	public void studentClass() {
		System.out.println(name+"학생교실번호");
		
	}

}
