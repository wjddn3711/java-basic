package java_day06_my;

import java.util.Scanner;

public class WhileTask {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int money = 0;
		while(true)
		{
			System.out.println("1. 입금하기\n2. 송금하기\n3. 나가기");
			input = sc.nextInt();
			if(input==1)
			{
				System.out.println("얼마를 입금하겠습니까?: ");
				input = sc.nextInt();
				money += input;
				System.out.println("입금완료, 현재 잔액: "+money);
			}
			else if(input ==2)
			{
				System.out.println("얼마를 송금하겠습니까?: ");
				input = sc.nextInt();
				if(input>money)
				{
					System.out.println("잔액이 부족합니다");
				}else {
					money -= input;
					System.out.println("송금완료, 현재 잔액: "+money);
				}
			}
			else if(input==3)
			{
				break;
			}
		}
	}
}
