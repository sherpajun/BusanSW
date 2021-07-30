package com.busan.fronend.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	BufferedReader br;
	PrintWriter pw;
	Socket client;
	public Client() {
		connect();
	}
	public void connect() {
		try {
			System.out.println("서버와의 연결을 시도합니다.");
			//client=new Socket("ip주소",서버번호);
			client=new Socket("192.168.0.16",24244);
			System.out.println("연결되었습니다.");

			br=new BufferedReader(new InputStreamReader(client.getInputStream()));   //들어오는 Stream
			pw=new PrintWriter(client.getOutputStream(),true); //나가는 Stream
			pw.println("이것은 워드인가 자바인가");
		}catch(Exception e) {
			System.out.println("Connection Fail");
		}finally {
			try {
				if(client!=null) client.close();
			}catch(IOException ie) {}
		}
	}

	public static void main(String[] args) {
		Client ci = new Client();
	}

}


































