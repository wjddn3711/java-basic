package java_day06_my;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		do {
			System.out.println("1. 입금하기\n2. 송금하기\n3. 나가기");
			input = sc.nextInt();
		}while(input!=3);
//		while(input!=3)
//		{
//			System.out.println("1. 입금하기\n2. 송금하기\n3. 나가기");
//			input = sc.nextInt();
//		}
		
		
	}
}
