package com.busan.fronend.Iot;

public class Pc implements Iot2 {

	@Override
	public void shutUp() {
		System.out.println("피씨를 로딩합니다.");
		
	}

	@Override
	public void shutDown() {
		System.out.println("피씨를 수면상태로둡니다");
		
	}

	
	
	
}
