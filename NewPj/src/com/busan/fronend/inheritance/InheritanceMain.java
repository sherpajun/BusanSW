package com.busan.fronend.inheritance;

public class InheritanceMain {

	public static void main(String[] args) {
		Suv baka = new Suv("Newsuv");
		baka.charge();
		baka.front(100);
		baka.rear(0);
	
		Truck truck = new Truck("MAN Ʈ��");
		Truck truck1 = new Truck("��޺��");
	
	truck.cargo();
	truck1.cargo();
	
	truck.front(800);
	truck.rear(1000);
	
	truck1.front(800);
	truck1.rear(1000);
	}
}