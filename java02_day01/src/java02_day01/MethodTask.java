package java02_day01;

import java.util.Scanner;

public class MethodTask {
	//빼기 메서드()
	//곱하기 메서드()
	//나누기 메서드()
	
	//내이름을 입력 받고 , n번 출력해주는 메서드
//	public static void printName()
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력해주세요: ");
//		String name = sc.nextLine();
//		System.out.println("몇번 출력 하시겠습니까? ");
//		int cnt = sc.nextInt();
//		for (int i = 0; i < cnt; i++) {
//			System.out.println(name);
//		}
//	}
	public static void f(int a)
	{
		a++;
	}
	
	
	public static void printName(String name, int cnt)
	{
		for (int i = 0; i < cnt; i++) {
			System.out.println(name);
		}
	}
	
	public static int minus(int a, int b)
	{
		return a-b;
	}
	public static int multp(int a, int b)
	{
		return a*b;
	}
	public static double div(int a, int b)
	{
		return (double)a/b;
	}
	
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println(f(a));
//		int a= minus(10, 20);
//		int b= multp(20, 50);
//		double c= div(30, 10);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input name: ");
//		String name = sc.nextLine();
//		System.out.println("How many ? ");
//		int cnt = sc.nextInt();
//		printName(name,cnt);
		
		
	}
}
