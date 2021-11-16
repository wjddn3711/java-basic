package java_day03_my;

import java.util.Scanner;

public class OperatorTest3 {
	public static void main(String[] args) {
		// 삼항 연산자
		// (조건식)? 참일때 수행할 문장 :거짓일 때 수행할 문장
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		String res = (a>5)? "입력한 값은 5보다 큽니다":"입력한 값은 5보다 작습니다";
		System.out.println(res);
		
	}
}
