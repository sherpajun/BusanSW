package com.busan.fronend.Cal;

public class ObjectTest {
public static void main (String[]args) {
	Lotto lotto = new Lotto();
Lotto lotto1 = new Lotto();
Lotto lotto2 = lotto;
	

	System.out.println(lotto.equals(lotto1)); //�̰��� �ּҰ��� ���ϴ°��̴�.
	System.out.println(lotto1.equals(lotto2));//�̰��� �ּҰ��� ���ϴ°��̴�.
	System.out.println(lotto.equals(lotto2));//�̰��� �ּҰ��� ���ϴ°��̴�.

	String a = "����";
	String b = new String("����"); //String Ŭ������ equals �� ���ڿ��� ���ϴ°��̴�.
	String c = new String("����"); //String Ŭ������ equals �� ���ڿ��� ���ϴ°��̴�.

	System.out.println(a.equals(b));
	System.out.println(b.equals(c));










}
}