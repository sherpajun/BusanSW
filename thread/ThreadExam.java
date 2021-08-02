package com.busan.fronend.thread;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ThreadExam extends JFrame implements Runnable {
private JTextField jt;
	
	public ThreadExam(){		//디자인 부분 시작(익명클래스)
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		design();
	}
	
	public void design(){
		Container ca = this.getContentPane();
		jt= new JTextField(20);
		ca.add(jt, BorderLayout.CENTER);
	}// 디자인 부분끝

	@Override
	public void run() {
		for( int i=0; i<10; i++){
	   		jt.setText(String.valueOf(i));
	   		try{
	   		 Thread.sleep(1000);
	   		}catch(Exception e){
	   			e.printStackTrace();
	   		}
		}		
	}
	
	 public static void main(String[] args) {
		 ThreadExam te=new ThreadExam();
		 ThreadExam te1=new ThreadExam();
		 ThreadExam te2=new ThreadExam();

		 te.setBounds(100, 100, 300, 100);
		 te1.setBounds(200, 200, 300, 100);
		 te2.setBounds(300, 300, 300, 100);

		 te.setVisible(true);
		 te1.setVisible(true);
		 te2.setVisible(true);


		 new Thread(te).start();
		 new Thread(te1).start();
		 new Thread(te2).start();
	}
}
