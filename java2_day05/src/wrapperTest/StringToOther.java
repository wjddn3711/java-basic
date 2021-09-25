package wrapperTest;

import java.util.Scanner;

public class StringToOther {
	public static void main(String[] args) {
		//문자열을 다른 자료형으로 바꾸기
		//메서드를 활용해야한다
		//그 메서드는 wrapper 클래스에 정의되어있다
		//"1000"이라는 문자열을 1000이라는 int 로 바꿀 것이다
		int num;
		num=Integer.parseInt("1000");//Integer.parseInt("안녕"); 오류, int 형식의 문자열만 넣을수 있다
		
		//"3.14" double 타입으로 바꾸기
		//parseDouble()     Double
		double d;
		String n = "3.14";
		d=Double.parseDouble(n);
		
		//사용자가 입력한 값을 nextLine()으로 받아와서 
		// 그 값이 1번이면 안녕하세요
		//2번이면 반갑습니다 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 안녕하세요\n2. 반갑습니다");
		String choice = sc.nextLine();
		int input = Integer.parseInt(choice);
		if(input==1)
		{
			System.out.println("안녕하세요");
		}
		else if(input==2)
		{
			System.out.println("반갑습니다");
		}
		
		
		
	}
}
