package java_day04_my;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) 
	{
		// 사용자에게 a를 입력받고 나이가 8~20세면 청소년 입니다
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이입력: ");
//		int age = sc.nextInt();
//		
//		if(age>7&&age<20) 
//		{
//			System.out.println("청소년 입니다");
//		}
//		System.out.println("if 문 바깥의 문장");
		
		//사용자에게 나이를 입력받고 나이가 8~20 청소년입니다, 청소년이 아닙니다
//		Scanner sc = new Scanner(System.in);
//		System.out.print("사용자의 나이를 입력해주세요: ");
//		int age = sc.nextInt();
//		String res5 = (age >= 8 && age <=19) ? "청소년 입니다!!" : "청소년이 아닙니다!!";
//		System.out.println(res5);
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		if (age >7 && age <20)
		{
			System.out.println("청소년입니다");
		}
		else
		{
			System.out.println("청소년이 아닙니다");
		}
		System.out.println("if 문 바깥의 문장입니다");
	}
}
