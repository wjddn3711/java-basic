package java_day05_my;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		//변수의 선언부
		// 사용자가 입력한 값을 받아온다
		//출력할 메시지를 변수에 담아서 저장해둔다 (유지보수)
		int choice = 0;
		String msg = "1. 입금하기\n2. 송금하기\n";
		int money = 10000;
		//사용자가 입금할 금액을 받아올 저장공간 생성
		int inMoney = 0;
		//사용자가 송금할 금액을 받아올 저장공간 생성
		int outMoney = 0;
		String str1 = "\n입금이 완료되었습니다.	\n현재 작액은: ";
		String str2 = "\n송금이 완료되었습니다. \n현재 잔액은: ";
		String strE = "잔액이 부족합니다!";
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
		//메뉴 메시지 출력
		System.out.print(msg);
		choice = sc.nextInt();
		//choice 변수의 값을 비교하여 다른 동작을 실행시키기
		switch(choice) {
		//만약 choice == 1 이라면
		case 1:
			// 얼마 입금하겠냐고 출력
			System.out.print(str1_1);
			// 사용자가 입금할 금액을 변수에 저장
			inMoney = sc.nextInt();
			// 기존에 갖고 있던 금액에 입금한 금액을 더해주고, 이 값을 다시 money에 저장한다
			money += inMoney;
			// 현재 잔액 출력해주기
			System.out.printf(str1+money);
			// 아래로 내려가는 것을 막기위해 사용하는 break;
			break;
		// 만약 choice == 2 라면
		case 2:
			// 송금할 금액 입력하라고 출력
			System.out.print(str2_1);
			//	내돈이 얼만지 판단 후 송금 금액보다 적으면 송금 불가능 합니다. 크면 송금 완료휴 잔액 보여주기
			//사용자가 입력한 값을 담아준다
			outMoney = sc.nextInt();
			// 사용자가 송금하려는 금액이 갖고있는 금액보다 크다면
			if(outMoney>money)
				//잔액 부족
			{
				System.out.println(strE);
			}//그게 아니라면
			else {
				// 사용자가 갖고 있는 금액에서 송금한 금액을 빼고, 그 값을 money에 담아준다
				money -= outMoney;
				System.out.printf(str2+money);
			}
			break;
		// choice !=1 && !=2 
		default:
			// 다시 입력해달라는 메시지 출력
			System.out.println(ex);
		}
	}
}
