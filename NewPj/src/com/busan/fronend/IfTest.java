package com.busan.fronend;

public class IfTest {

//	public void test (int score) {
//	if(score>90) {
//		System.out.println("A");
//	} else if (score>80) {
//		System.out.println("B");
//	} else if (score>70) {
//		System.out.println("C");
//	} else{
//		System.out.println("F");
//	}
//	
//	
//	
//	
//	}
	
	



	public String test (int score){
		if(score>90) {
		return "A";
		} else if (score>80) {
		return "B";
		} else if (score>70) {
		return "C";
		} else{
		return "F";
		}
	}
		
		public void switchTest(int score){
			switch(score) {
			case 90:
			System.out.println("A");
			break;
			 
			case 80:
			System.out.println("b");
			break;
			 
			case 70:
			System.out.println("c");
			break;
			 
			default:
			System.out.println("f");
			break;
		
		
		
		
		
		
			}
		}
}