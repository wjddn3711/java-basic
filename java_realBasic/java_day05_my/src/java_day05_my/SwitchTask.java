package java_day05_my;

import java.util.Scanner;

public class SwitchTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 아까 ATM 을 if 문을 사용하여 만드시오
		int choice = 0;
		int inMon =0;
		int outMon = 0;
		int money= 100000;
		System.out.println("메뉴를 선택해주세요: \n1.입금하기\n2.송금하기");
		choice = sc.nextInt();
		if (choice == 1)
		{
			System.out.print("입금할 금액을 입력하세요: ");
			inMon = sc.nextInt();
			money += inMon;
		}
		else if (choice == 2)
		{
			System.out.print("송금할 금액을 입력하세요: ");
			outMon = sc.nextInt();
			if (outMon > money)
				{
				System.out.println("잔액이 부족합니다");
				}
			else
			{
				money -= outMon;
			}
		}
		else
		{
			System.out.println("1번 또는 2번을 선택해주세요");
		}
		System.out.printf("잔액: %d", money);
		
		
		
		
		
	}
}
