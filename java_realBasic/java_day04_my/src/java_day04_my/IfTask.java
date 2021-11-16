package java_day04_my;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//두개의 정수를 입력받아 큰수에서 작은 수를 뺀 차이를 출력하는 프로그램
		// 20 35 --> 35
		// 30 20 --> 10
		
//		System.out.print("두개의 정수를 입력해주세요: ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if (a>b) 
//		{
//			System.out.println(a-b);
//		}
//		else 
//		{
//			System.out.println(b-a);
//		}
		
				
		// 3의 배수인지 4의 배수인지 출력해주는 프로그램 만들기
		// 12
		// 3의 배수입니다
		// 4의 배수입니다
		// 11
		// 3의 배수도 아니고 4의 배수도 아닙니다
//		
		System.out.print("정수를 입력 해주세요: ");
		int a = sc.nextInt();
		if(a%3==0 && a%4==0)
		{
			System.out.println("3의 배수입니다\n4의 배수입니다");
		}
		else if(a%3==0)
		{
			System.out.println("3의 배수입니다");
		}
		else if(a%4==0)
		{
			System.out.println("4의 배수입니다");
		}
		else
		{
			System.out.println("3의 배수도 아니고 4의 배수도 아닙니다");
		}
		
//		boolean check = false;
//		if(a%3==0)
//		{
//			System.out.println("3의 배수입니다");
//			check = true;
//		}
//		if(a%4==0)
//		{
//			System.out.println("4의 배수입니다");
//			check = true;
//		}
//		if(!check)
//		{
//			System.out.println("3의 배수도 아니고 4의 배수도 아닙니다");
//		}
	}
}
