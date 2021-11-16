package java_day05_my;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 1. 10 9 8 7 6 5 4 3 2 1 출력하기
//		int a = 10;
//		for (int i = 0; i<10; i++)
//		{
//			System.out.print(a +" ");
//			a--;	
//		}
		
		// 디버깅 표
		// i 	 0 1 2 3 4 5 6 7 8 9 
		// 목적 	10 9 8 7 6 5 4 3 2 1 
		// 10-i 10 9 8 7 6 5 4 3 2 1 		 
//		for (int i = 0; i<10; i++)
//		{
//			System.out.print(10-i +" ");	
//		}
		
		
		// 2.
		// *****
		// *****
		// *****
		// *****
		// *****		출력하기
		
//		for (int i = 0; i<5; i++)
//		{
//			System.out.println("*****");
//		}
		
		// 3. 1~100까지의 숫자중 짝수만 출력하기
		
//		for (int i=0; i<100; i++)
//		{
//			if(i%2==0)
//			{
//				System.out.print(i+1 + " ");
//			}
//		}
		
//		for (int i=0; i<50; i++)
//		{
//			System.out.println(2*(i+1));
//		}
		
//		for (int i = 0; i<100; i++)
//		{
//			if(i%2==0)
//			{
//				// 이후 코드를 수행하지 않고 바로 증감식으로 이동하게 만든다
//				continue;
//			}
//			System.out.println(i+1);
//		}
		
		// 4. 1~사용자가 입력한 수 까지 홀수의 총합 출력
//		int n = 0;
//		int total =0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter digit: ");
//		n = sc.nextInt();
//		for (int i=0; i<n; i++)
//		{
//			if((i+1)%2==1)
//			{
//				total += (i+1);
//				//total = total + i+1
//			}
////			System.out.println(i+" 번쨰 total 값: "+total); //반복이 끝날 때 total이 어떻게 변하는지 확인
//		}
//		System.out.println("홀수의 총합은 " +total+" 입니다");
		
		// 5. 구구단 2단 출력하기
		// -----2단------
		// 2 * 1 = 2
		// 2 * 2 = 4
		// .........
		// 2 * 9 = 18 출력하기
		
		System.out.println("구구단 2단 출력\n-------2단-------");
		for(int i=0; i<9; i++)
		{
			int a = i + 1;
			int sum = a * 2;
			System.out.printf("2 * %d = %d\n",a,sum);
		}
	}
}
