package java_day03_my;

import java.util.Scanner;

public class ScannerReview {
	public static void main(String[] args) {
		// 사용자가 입력한 이름을 name에 저장한 후	
		// 당신의 이름은 OOO 입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.printf("당신의 이름을 입력해주세요 : ");
		//String name = sc.next(); 	이 정우를 입력하면 이 만 가져온다. (공백을 구분하기 때문)
		String name = sc.nextLine();
		System.out.printf("당신의 이름은 %s 입니다!",name);

		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력해주세요: ");
//		int input = sc.nextInt();
//		System.out.printf("입력된 정수는 : %d 입니다",input);
		
		
	}
}
