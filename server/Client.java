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
			System.out.println("�������� ������ �õ��մϴ�.");
			//client=new Socket("ip�ּ�",������ȣ);
			client=new Socket("192.168.0.16",24244);
			System.out.println("����Ǿ����ϴ�.");

			br=new BufferedReader(new InputStreamReader(client.getInputStream()));   //������ Stream
			pw=new PrintWriter(client.getOutputStream(),true); //������ Stream
			pw.println("�̰��� �����ΰ� �ڹ��ΰ�");
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


































