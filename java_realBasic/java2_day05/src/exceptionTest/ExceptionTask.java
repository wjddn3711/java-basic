package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ar = {10,20,30,40,50};
		//사용자한테 숫자를 입력받아서 해당하는 배열의 값 보여주기
		//1 	10
		//10	배열의 크기를 벗어났습니다
		//dasfa	정수만 입력해주세요
		
		System.out.println("몇번째 값을 보고 싶습니까?");
		try {
			int choice = sc.nextInt();
			System.out.println(ar[choice-1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다");
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력해주세요");
		} catch (Exception e) {
			System.out.println("내가 놓친 예외");
			e.printStackTrace(); //예외의 정보를 알고 싶을때 사용한다
		}
		
		
		
		
//		System.out.println("몇번째 값을 보고 싶습니까? 종료하기는 0을 누르세요");
//		int choice;
//		
//		try {
//			choice =sc.nextInt();
//
//			try {
//				System.out.println("값은: "+ar[choice-1]);
//			} catch (ArrayIndexOutOfBoundsException e) {
//				// TODO Auto-generated catch block
//				System.out.println("보고싶은 배열의 크기를 벗어났습니다");
//			}
//		} catch (InputMismatchException e) {
//			// TODO Auto-generated catch block
//			System.out.println("정수만 입력해주세요");
//		}
		
		
		
		
		
//		try {
//			int n = sc.nextInt();
//			
//			System.out.println(ar[n-1]);
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			System.out.println("배열의 크기를 벗어났습니다");
//		}catch (InputMismatchException e)
//		{
//			System.out.println("정수만 입력해주세요");
//		}
		
		
	}
}
