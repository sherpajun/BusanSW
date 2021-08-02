package com.busan.fronend.dbconn;

import java.sql.DriverManager;

public class DBConnTest {
	public void test() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
String dbUrl = "jdbc:oracle;thin;@127.0.0.1:1521:ke";
DriverManager.getConnection(dbUrl,"hr","1234");//(����Ŭ�ּ�, ����, �н�����);
		}catch(Exception e) {
			e.printStackTrace();

		}
	}

	//����Ŭ ���� ���
	// 1. ����Ŭ ����̹� �ε� (Class.forName()���)
	// 2. DriverManager�� getConnection() �̿� �Ͽ� DB���� Connection ���� ����
	// 3. Connection�� preparesStatement()�� �̿��Ͽ�
	// �������� �ɰ� PreparedStatement ���� ����
	// 4. PreparedStatement�� �̿��Ͽ� ��������
	// 5.������ ������ �ΰ����� ����
	// a. select�� : executeQuery()
	// b. insert, delete, update �� : executeUpdate()
	// 6. 5���� ��쿡�� a�� ResultSet�� ���� ����,
	// b�� ������ ���Ϲ���
	// 7. select���� ������ ���������� ResultSet�� �̿��Ͽ�
	// ���� ���� ���� �о����

	public static void main(String[] args) {
		DBConnTest dt = new DBConnTest();
		dt.test();
	}

}
