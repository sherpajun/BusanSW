package com.busan.fronend.Cal;

public class Mabang {

	public Mabang(int num) {
		start(num);
	}

	int[][] mabang;


	public void start(int num) {
		mabang = new int [num][num];
		int x = 0;// x의 위치를 정하는것
		int y = num/2;// y의 위치를 정하는것

		mabang[x][y]=1;// x,y의 시작점을 1로 설정하는것

		for(int pos=2;pos<=num*num;pos++) {
			// 왼쪽 대각선위로 먼저 이동시킴
			x= x-1;
			y= y-1;


			// 위치(x,y) 이동후 위로 벗어나는 경우 ; x<0
			// 위치(x,y) 이동후 왼쪽으로 벗어나는 경우 ; y<0
			// 위치(x,y) 이동후 위로, 왼쪽으로벗어나는 경우 ; x<0 and y<0
			// 위치(x,y) 이동후배열을 벗어나지 않지만 이동한 위치에 이미 다른값이 있는경우; mabang[x][y] !=0



			if(x<0) {
				if(y<0) {// 이동한 위치가 왼쪽대각선 위로 벗어나는 한가지경우
					x=x+2;
					y=y+1;

				}else{//이동한 위치가 위로 벗어난 경우
					x=x+num;
				}
			}else{
				if(y<0) {//이동한 위치가 왼쪽으로 벗어난 경우
					y=y+num;
				}else {//이동한 위치가 배열안에 들어왔지만 값이 있는 경우
					if(mabang[x][y]!=0){
						x=x+2;
						y=y+1;

					}					
				}				
			}
			mabang [x][y] = pos;
		}
		
		for(int[] first : mabang) {
			for(int value : first) {
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}
}




















