package java_day06_my;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("3번은 나가기입니다");
			int input = sc.nextInt();
			if(input ==3) {
				break;
			}
			System.out.println("while문 안의 문장");
		}
		
		
//		int a = 0;
//		while(a<2)
//		{
//			System.out.println("while문 안의 문장");
//			a++;
//		}
//		System.out.println("while문 바깥의 문장");
//		
//		for(int i =0; i<2; i++)
//		{
//			System.out.println("for문 안의 문장");
//		}
//		System.out.println("for문 바깥의 문장");
	}
}
