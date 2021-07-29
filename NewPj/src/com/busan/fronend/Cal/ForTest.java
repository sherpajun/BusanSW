package com.busan.fronend.Cal;

public class ForTest {

	
	public void test() {
	
	for(int i=1;i<9; i++) {
		for(int j=1;j<=9; j++) {
			System.out.print(i+"*"+j+"="+i*j+" ");
		}
			System.out.println();
	}
	
	System.out.println();
	System.out.println();
	
	int i=1;
	int j=1;
	while(i<9) {
		while(j<=9) {
			System.out.print(i+"*"+j+"="+i*j+"");
			j++;
			
		}
	System.out.println();
	j=1;
	i++;
  }
 }
}