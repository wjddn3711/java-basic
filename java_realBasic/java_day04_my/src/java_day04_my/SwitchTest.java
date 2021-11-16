package java_day04_my;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		String msg = "1. 입금하기\n2. 송금하기\n";
		int money = 10000;
		int choice = 0;
		int inMoney = 0;
		int outMoney = 0;
		String str1 = "\n입금이 완료되었습니다.	\n현재 작액은: ";
		String str2 = "\n송금이 완료되었습니다. \n현재 잔액은: ";
		String strE = "입력하신 금액이 보유하신 금액보다 큽니다 송금 불가능합니다!";
		String str1_1= "얼마를 입금하겠습니까:  ";
		String str2_1= "얼마를 송금하겠습니까:  ";
		String ex = "1번 혹은 2번을 입력해주세요.";
//		int num = 1;
//		switch(num)
//		{
//		case 1:
//				System.out.println("1입니다");
//				break;
//		case 2:
//				System.out.println("2입니다");
//				break;
//		default:
//				System.out.println("그외의 숫자 입니다");
//		}
		
		// ATM 1.입금하기
		//		2.송금하기
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.print(str1_1);
			inMoney = sc.nextInt();
			money = money + inMoney;
			System.out.printf(str1+money);
			break;
		case 2:
			System.out.print(str2_1);
			//	내돈이 얼만지 판단 후 송금 금액보다 적으면 송금 불가능 합니다. 크면 송금 완료휴 잔액 보여주기
			outMoney = sc.nextInt();
			
			if(outMoney>money)
			{
				System.out.println(strE);
			}
			else {
				money = money - outMoney;
				System.out.printf(str2+money);
			}
			break;
		default:
			System.out.println(ex);
		}
	}
}
