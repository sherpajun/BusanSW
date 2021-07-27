package com.busan.fronend.inheritance;

public class Truck extends Car {
	
	String name;
	public Truck() {
	 //이 명령어가 생성자 명령어이다. 생략이 가능하며 JVM이 자동으로 인성가능하다.
	super();
	}//부모클래스의 생성자를 호출 상속관계에서 super는 부모를 this는 자기자신을 의미함 생성자의 첫번째 라인에 만들어야함 무조건
	
	
	public Truck(String name) {            
		super(name);
		this.name=name;}
	
	public void cargo() {
		System.out.println(name+"짐 옮기기 싫다.");
	
	
	
	
	
	}
}
