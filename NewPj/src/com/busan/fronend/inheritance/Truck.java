package com.busan.fronend.inheritance;

public class Truck extends Car {
	
	String name;
	public Truck() {
	 //�� ��ɾ ������ ��ɾ��̴�. ������ �����ϸ� JVM�� �ڵ����� �μ������ϴ�.
	super();
	}//�θ�Ŭ������ �����ڸ� ȣ�� ��Ӱ��迡�� super�� �θ� this�� �ڱ��ڽ��� �ǹ��� �������� ù��° ���ο� �������� ������
	
	
	public Truck(String name) {            
		super(name);
		this.name=name;}
	
	public void cargo() {
		System.out.println(name+"�� �ű�� �ȴ�.");
	
	
	
	
	
	}
}
