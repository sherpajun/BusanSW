package com.busan.fronend.Cal;

public class ObjectTest {
public static void main (String[]args) {
	Lotto lotto = new Lotto();
Lotto lotto1 = new Lotto();
Lotto lotto2 = lotto;
	

	System.out.println(lotto.equals(lotto1)); //이것은 주소값을 비교하는것이다.
	System.out.println(lotto1.equals(lotto2));//이것은 주소값을 비교하는것이다.
	System.out.println(lotto.equals(lotto2));//이것은 주소값을 비교하는것이다.

	String a = "가나";
	String b = new String("가나"); //String 클래스의 equals 는 문자열을 비교하는것이다.
	String c = new String("가나"); //String 클래스의 equals 는 문자열을 비교하는것이다.

	System.out.println(a.equals(b));
	System.out.println(b.equals(c));










}
}