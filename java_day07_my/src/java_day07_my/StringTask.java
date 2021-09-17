package java_day07_my;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// aBcDeFgH....Z   -->   AbCdEfG....z 로 바꿔서 출력하기
	      //"aBcDeFgHiJkLmNoPqRsTuVwXyZ"
//		String re = "";
//		System.out.println("Input string: ");
//		String in = sc.nextLine();
//		for (int i = 0; i < in.length(); i++) {
//			if(in.charAt(i)>=65&&in.charAt(i)<=90)
//			{
//				re += (char)(in.charAt(i)+32);
//				System.out.print(re); 
//			}
//			else if(in.charAt(i)>=97&&in.charAt(i)<=122)
//			{
//				re += (char)(in.charAt(i)-32);
//				System.out.print(re);
//			}
//		}
		
		// 일공이사 ---> 1024 출력되
		// 공 == 0 일 == 1
		// "공일이삼사오육칠팔구"
		// "0123456789"
		
		
		
		char[] car = {'공','일','이','삼','사','오','육','칠','팔','구'};
		int[] res = {0,1,2,3,4,5,6,7,8,9};
		int re=0;
		String in = "";
		System.out.println("Input number in Korean: ");
		in = sc.next();
		for (int i = 0; i < in.length(); i++) 
		{
			for (int j = 0; j < car.length; j++) {
				if(in.charAt(i)==car[j])
				{
					re = res[j];
					System.out.print(re);
				}
			}
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String in = ""; //입력받은 문자열
//		String te = ""; //
//		char[] men = {'공','일','이','삼','사','오','육','칠','팔','구'};
//		int[] re = {0,1,2,3,4,5,6,7,8,9};
//		int res =0;
//		System.out.println("한글 숫자 입력: ");
//		in = sc.nextLine();
//		for (int i = 0; i < in.length(); i++) {
////		 te = in.charAt(i) + ""; 문자열로 변환했을때
//			for (int j = 0; j < men.length; j++) {
//				if(in.charAt(i)==(men[j]))
//				{
//					res = re[j];
//					System.out.print(res);
//				}
//			}
//		}
		

