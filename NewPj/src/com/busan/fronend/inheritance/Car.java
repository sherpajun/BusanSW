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
		System.out.println(name + "���� �Դϴ�");
	}
	public void rear (int speed) {
		System.out.println(name + "���� �Դϴ�");
	}
} 