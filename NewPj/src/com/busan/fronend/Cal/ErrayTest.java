package com.busan.fronend.Cal;

public class ErrayTest {

	
	int[] full = {1,3,5,7,9};
	//int[] full = new int [5];
	//int[] full = new int []{1,3,5,7,9,};

int[][] mist = new int [10][10];


public void test() {
	for(int i=0;i<full.length;i++) {
		System.out.println(full[i]);
	}


//���� for �� ���
for(int i: full) {
System.out.println(i);
		}
}


public void test4() {
	int value=1;
	for(int i=0;i<mist.length;i++){
		for(int j=0;j<mist[i].length;j++) {
			mist[i][j]=value;
			value++;
		}
	}	
			for(int i=0;i<mist.length;i++){
				for(int j=0;j<mist[i].length;j++){
			System.out.print(mist[i][j]+" ");
			
		}
		System.out.println();
	}

//���� for �� 
			for(int[] i:mist) {
	for(int result : i) {
		System.out.print(result + " ");
	}
	System.out.println();
}



}

}



















