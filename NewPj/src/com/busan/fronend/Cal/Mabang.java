package com.busan.fronend.Cal;

public class Mabang {

	public Mabang(int num) {
		start(num);
	}

	int[][] mabang;


	public void start(int num) {
		mabang = new int [num][num];
		int x = 0;// x�� ��ġ�� ���ϴ°�
		int y = num/2;// y�� ��ġ�� ���ϴ°�

		mabang[x][y]=1;// x,y�� �������� 1�� �����ϴ°�

		for(int pos=2;pos<=num*num;pos++) {
			// ���� �밢������ ���� �̵���Ŵ
			x= x-1;
			y= y-1;


			// ��ġ(x,y) �̵��� ���� ����� ��� ; x<0
			// ��ġ(x,y) �̵��� �������� ����� ��� ; y<0
			// ��ġ(x,y) �̵��� ����, �������ι���� ��� ; x<0 and y<0
			// ��ġ(x,y) �̵��Ĺ迭�� ����� ������ �̵��� ��ġ�� �̹� �ٸ����� �ִ°��; mabang[x][y] !=0



			if(x<0) {
				if(y<0) {// �̵��� ��ġ�� ���ʴ밢�� ���� ����� �Ѱ������
					x=x+2;
					y=y+1;

				}else{//�̵��� ��ġ�� ���� ��� ���
					x=x+num;
				}
			}else{
				if(y<0) {//�̵��� ��ġ�� �������� ��� ���
					y=y+num;
				}else {//�̵��� ��ġ�� �迭�ȿ� �������� ���� �ִ� ���
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




















