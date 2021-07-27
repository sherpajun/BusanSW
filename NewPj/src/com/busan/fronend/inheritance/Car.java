package com.busan.fronend.inheritance;

public class Car {
	String name;
	String color;
	
public Car() {

}

	public Car(String name) {

		this.name = name;
	}

	public void front (int speed) {
		System.out.println(name + "직진 입니다");
	}
	public void rear (int speed) {
		System.out.println(name + "후진 입니다");
	}
} 