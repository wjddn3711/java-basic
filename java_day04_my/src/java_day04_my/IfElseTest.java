package java_day04_my;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		//사용자에게 정수를 입력받고 해당 정수가 3의 배수인지 4의 배수인지 판단하여 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수입력: ");
//		int a = sc.nextInt();
//		if(a%3==0&&a%4==0 )
//		{
//			System.out.println("3과 4의 배수입니다");
//		}
//		else if ( a% 4 == 0)
//		{
//			System.out.println("4의 배수입니다");
//		}
//		else if (a%3==0)
//		{
//			System.out.println("3의 배수입니다");
//		}
//		else
//		{
//			System.out.println("3의 배수, 4의 배수가 아닙니다");
//		}
		
		
//		if (a%3 ==0)
//		{
//			System.out.println("3의 배수입니다");
//		}
//		if (a%4 ==0)
//		{
//			System.out.println("4의 배수입니다");
//		}
		
		System.out.println("다음 중 도덕적으로 올바른 답을 고르시오\n 1.쓰레기를 잘 치운다\n 2.욕설한다\n 3.싸운다");
		int input = sc.nextInt();
		if(input==1)
		{
			System.out.println("정답");
		}
		else if(input==2)
		{
			System.out.println("오답");
		}
		else if(input==3)
		{
			System.out.println("오답");
		}
		else {
			System.out.println("1~3을 입력해주세요");
		}
	}
}
