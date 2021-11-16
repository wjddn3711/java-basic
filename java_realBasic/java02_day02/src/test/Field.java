package test;

import java02_day02.User;

public class Field {
	public static void main(String[] args) {
		User kim = new User();
//		kim.a = 100; default는 다른 패키지에서는 접근 불가
		kim.b = 100; //public은 다른 패키지에서 접근 가능
//		kim.c = 100; private는 다른 패키지에서 접근 불가
	}
}
