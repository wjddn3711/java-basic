package java2_day06;

import java.util.Scanner;

public class ThrowsTest {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, BadWordException {
		Scanner sc = new Scanner(System.in);
		NickName n = new  NickName();
		System.out.println("닉네임을 입력해주세요: ");
		String nick = sc.nextLine();
	
		n.checkNickName(nick);
		System.out.println("당신의 닉네임은 "+nick+"입니다");
		
//		try {
//			n.checkNickName(nick);
//			System.out.println("당신의 닉네임은 "+nick+"입니다");
//		} catch (BadWordException e) {
//			System.out.println("나쁜 말은 안됩니다");
//		}
//		System.out.println("메인 메서드 종료");
	}
}
