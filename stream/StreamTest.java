package com.busan.fronend.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class StreamTest {

	int temp;
	public void test() {
		FileReader pi = null;
		try {
			//FileInputStream pi = new FileInputStream("c://JavaSource/a.txt");
			pi = new FileReader("c://JavaSource/a.txt");
			while((temp=pi.read())!=-1) {
				System.out.print((char)temp);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pi.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	//
	public void test2() {
		String tempStr;
		try {
			BufferedReader br = new BufferedReader(new FileReader("c;/JavaSource/a.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("c;/JavaSource/a.txt"));
			while((tempStr=br.readLine())!=null){
				System.out.println(tempStr);
				bw.write(tempStr+"\r\n");
			}
			br.close();
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

public void test3() throws Exception {
	String tempStr;
	BufferedReader br=new BufferedReader(new FileReader("c:/JavaSource/a.txt"));
	BufferedWriter bw = new BufferedWriter(new FileWriter("c:/JavaSource/abc.txt"));
	
	try(br;bw){
		while((tempStr=br.readLine()) != null) {
			System.out.println(tempStr);
			bw.write(tempStr+"\r\n");
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}

//public void test3() {
//	String tempStr;
//	
//	try(BufferedReader br=new BufferedReader(new FileReader("c:/JavaSource/a.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("c:/JavaSource/a.txt"))){
//		while((tempStr=br.readLine()) != null) {
//			System.out.println(tempStr);
//			bw.write(tempStr+"\r\n");
//		}
//		
//	}catch(Exception e) {
//		e.printStackTrace();
//	}
//}












	public static void main(String[] args) throws Exception {
		StreamTest st= new StreamTest();
		st.test3();

	}

}
