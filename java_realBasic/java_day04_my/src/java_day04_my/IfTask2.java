package java_day04_my;

import java.util.Scanner;

public class IfTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//버스 요금제
		int b_fee_c = 730;
		int b_fee_t = 1010;
		int b_fee_a = 1400;
		//지하철 요금제
		int s_fee_c = 450;
		int s_fee_t = 1350;
		int s_fee_a = 1350;
		
		int mon = 0; //결산 금액
		String t = ""; //이동수단
		int age = 0; //나이
//변수 선언 공간
		
		
		System.out.print("이동 수단을 선택하세요: ");
		t = sc.next();
		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt();
		if(t.equals("지하철") ) 
		{
			if(age<12)
			{
				mon = +s_fee_c;
			}
			else if (age > 19)
			{
				mon = +s_fee_a;
			}
			else 
			{
				mon = +s_fee_t;
			}
		}
		if(t.equals("버스"))
		{
			if(age<12)
			{
				mon = +b_fee_c;
			}
			else if( age> 19)
			{
				mon = +b_fee_a;
			}
			else
			{
				mon = +b_fee_t;
			}
		}
		System.out.printf("요금: %d",mon);
	}
}
