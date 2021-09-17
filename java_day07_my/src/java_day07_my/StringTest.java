package java_day07_my;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
//		String a= "apple";
//		for (int i = 0; i < a.length(); i++) {
//			System.out.print((char)(a.charAt(i)-32));
//		}
//		System.out.println(a.length()); //5
//		System.out.println(a.charAt(0)); //a
//		System.out.println(a.indexOf('p')); //1
//		System.out.println(a.indexOf('p',2)); //2
		
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀 번호를 입력해주세요");
		String pw = sc.nextLine();
		String pw1 ="";
		String en_pw="";
		for (int i = 0; i < pw.length(); i++) {
			en_pw+=(char)(pw.charAt(i)*3);
		}
		System.out.println("암호화된 패스워드: "+en_pw);
		
		//복호화
		for (int i = 0; i < en_pw.length(); i++) {
			pw1+=(char)(en_pw.charAt(i)/3);
		}
		System.out.println("복호화된 패스워드: "+pw1);
	}
}
