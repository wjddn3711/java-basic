package java_day04_my;

import java.util.Scanner;

public class OperatorTask2 {
	public static void main(String[] args) {
		//1. 사용자에게 정수 a, b를 입력받고 둘 중 더 큰 수를 출력하라
		// 입력 예시: 10 20
		// 출력 예시: 입력한 값 중 더 큰 값은 20 입니다
		//2. 사용자에게 정수 a를 입력받고 홀수인지 짝수인지 판별하기
		//입력 예시 : 10
		//출력 예시 : 10은 짝수 입니다
		//3. 사용자에게 오늘의 온도를 입력받고 40도 이상이면 폭염주의보 출력, 아니면 활동하세요 출력
		//4. 사용자에게 성씨를 입력 받고 성씨가 김씨면 출입하세요 출력, 아니면 다시오세요 출력
		//5. 사용자에게 나이를 입력받고 0~19세면 미성년자입니다 출력, 아니면 성인입니다 출력
		//6. 사용자에게 나이를 입력받고 8~19세면 청소년 입니다. 아니면 청소년이 아닙니다.
		
		//1.
//		System.out.print("숫자 두개를 입력 하세요: ");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int res = (a > b) ? a : b;
//		System.out.printf("둘 중 더 큰수는 %d 입니다", res);
		
		//2.
		// 짝수: 2로 나눴을 때 나머지가 0인 친구
		// 홀수: 2로 나눴을 때 나머지가 1인 친구
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력해 주세요: ");
//		int a1 = sc.nextInt();
//		String res1 = (a1%2 == 0) ? "당신이 입력한 값은 짝수 입니다" : "당신이 입력한 값은 홀수 입니다";
//		System.out.printf("결과는 : %s", res1);
			
		//3.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("현재 온도를 입력해주세요 : ");
//		int tem = sc.nextInt();
//		String res2 = (tem>=40) ? "폭염주의보 !!!" : "활동하세요!!!";
//		System.out.printf("오늘은 %s", res2);
		
		//4.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("당신의 성을 입력하세요: ");
//		String xing = sc.nextLine();
		// 주의 문자열 비교는 .equals() 를 사용한다!!!
//		String res3 = (xing.equals("김") ) ? "출입하세요!" : "다시오세요";
//		System.out.println(res3);
		
		
		//문자열을 equals()로 비교하는 이유
//		String name = "안녕";
//		String name2 = "안녕";
//		String name3 = new String ("안녕");
//		
		//주소값 비교
//		System.out.println(name == name2); //name 의 주소값과 name2의 주소값이 일    ---->true
//		System.out.println(name == name3); //name, name2 와 name3의 주소값이 일치하지 않음 ---->false
		// 내용 비교
//		System.out.println(name.equals(name3)); //name에 있는 내용을 비교할때
		
		//5.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("당신의 나이를 입력하세요: ");
//		int age = sc.nextInt();
//		String res4 = (age>=0 && age<=19) ? "미성년자 입니다!!" : "성인 입니다!!!";
//		System.out.println(res4);
		
		//6.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("사용자의 나이를 입력해주세요: ");
//		int age = sc.nextInt();
//		String res5 = (age >= 8 && age <=19) ? "청소년 입니다!!" : "청소년이 아닙니다!!";
//		System.out.println(res5);
		
		//7. 7세 이하면 아동입니다
		// 8~19 청소년입니다
		//20 이상은 성인입니다
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("당신의 나이를 입력하세요: ");
//		int age = sc.nextInt();
//		int bull;
//		boolean res = age>7 ;
//		String res1 = (res == true) ? "아동입니다." : "청소년 이상입니다";
//		String res2 = 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이를 입력하세요: ");
		int age = sc.nextInt();
		// 가독성이 떨어진다
		String res = (age <= 7) ? "아동입니다" : (age < 20) ? "청소년 입니다" : "성인입니다";
		System.out.println(res);
		
		
		
		
		
		
	}
}
