package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.안녕 2.반가워");
//		int choice = sc.nextInt();
		
		
		try {
			int choice = sc.nextInt();
			if(choice==1)
			{
				System.out.println("안녕하세요");
			}
			else if(choice==2)
			{
				System.out.println("반갑습니다");
			}
			else
			{
				System.out.println("잘못 입력했습니다");
			}
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace(); 어떤 오류인지 알려준다
			System.out.println("정수만 입력할 수 있습니다");
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("내가 예측하지 못한 예외 발생시 수행해줘");
			System.out.println("강제 종료");
		}
		
		System.out.println("메인 메서드 종료");
	}
}
