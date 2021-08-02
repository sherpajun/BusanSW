package com.busan.fronend.dbconn;

import java.sql.DriverManager;

public class DBConnTest {
	public void test() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
String dbUrl = "jdbc:oracle;thin;@127.0.0.1:1521:ke";
DriverManager.getConnection(dbUrl,"hr","1234");//(오라클주소, 계정, 패스워드);
		}catch(Exception e) {
			e.printStackTrace();

		}
	}

	//오라클 접속 방법
	// 1. 오라클 드라이버 로드 (Class.forName()사용)
	// 2. DriverManager의 getConnection() 이용 하여 DB접속 Connection 리턴 받음
	// 3. Connection의 preparesStatement()를 이용하여
	// 쿼리문을 심고 PreparedStatement 리턴 받음
	// 4. PreparedStatement를 이용하여 쿼리실행
	// 5.쿼리문 실행은 두가지가 있음
	// a. select문 : executeQuery()
	// b. insert, delete, update 문 : executeUpdate()
	// 6. 5번의 경우에서 a는 ResultSet을 리턴 받음,
	// b는 정수를 리턴받음
	// 7. select문을 쿼리로 실행했으면 ResultSet을 이용하여
	// 리턴 받음 값을 읽어내야함

	public static void main(String[] args) {
		DBConnTest dt = new DBConnTest();
		dt.test();
	}

}
