package anonymousTest;

import java.util.Scanner;

public class Nike {
	public void regist(Store s)
	{
		Scanner sc = new Scanner(System.in);
		//메뉴 출력해주기
		
		System.out.println("어서오세요 NIKE 입니다");
		for (int i = 0; i < s.getMenu().length; i++) {
			System.out.println((i+1)+"."+s.getMenu()[i]);
		}
		//사용자가 입력한 문자열 값에 따라서 판매인지 알려주기
		System.out.print("원하는 물품을 입력하세요: ");
		String item = sc.nextLine();
		s.sell(item);
		if(s instanceof StoreAdapter)
		{
			System.out.println("무료나눔");
		}
		else
		{
			
		}
		//잠실점이면 사용자가 입력한 문자열이 같다면 무료나눔
		
	}
}
