package com.busan.fronend.Iot;

public class IotMain {
	
	public static void main(String[] args) {
		Mov rr = new Mov();
		rr.volumeUp();
		rr.volumeDown();
		
		Mp3 aa = new Mp3();
		aa.volumeUp();
		aa.volumeDown();
	
	Iot m2 = new Mov(); //Upcasting....�θ��ڸ��� �ڽ��� �� �� ����
	
	Tv dd = new Tv();
	dd.volumeUp();
	dd.volumeDown();
	
	Pc pp = new Pc();
	pp.shutUp();
	pp.shutDown();
	
	
	
	
	}

}