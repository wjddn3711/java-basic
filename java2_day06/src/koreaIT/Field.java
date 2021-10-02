package koreaIT;

import java.util.ArrayList;
import java.util.Scanner;

public class Field {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<User> users = new ArrayList<>();
		
		String menu = "1. 회원가입\n" + 
				"2. 로그인하기\n" + 
				"3. 회원정보보기\n" + 
				"4. 나가기";
		String outMenu = "1. 회원가입\n" + 
				"2. 로그아웃하기\n" + 
				"3. 회원정보보기\n" + 
				"4. 나가기";
		String errMsg = "다시 입력해주세요!";
		
		boolean checkLogin = false;
		
		while(true)
		{
			if(!checkLogin)
			{
				System.out.println(menu);
			}else
			{
				System.out.println(outMenu);
			}
//			System.out.println(menu);
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 4)
			{
				break;
			}
			else if(choice ==1)
			{
				while (true) {
					//회원가입하기
					System.out.println("----------회원가입하기----------\n");
					System.out.print("ID 입력: ");
					String id = sc.nextLine();
					System.out.print("PW 입력: ");
					String pw = sc.nextLine();
					System.out.print("주소 입력: ");
					String address = sc.nextLine();
					if (users.isEmpty()) {
						User u = new User();
						u.id = id;
						u.pw = pw;
						u.address = address;
						users.add(u);
						System.out.println("회원 가입이 완료됬습니다!");
						break;
					} 
					else 
					{
						//id 중복검사
						//size();
						boolean check = false;
						for (int i = 0; i < users.size(); i++) {
							if(users.get(i).id.equals(id))
							{
								check = true;
								break;
							}
//							else {
//								User u = new User();
//								u.id = id;
//								u.pw = pw;
//								u.address = address;
//								users.add(u);
//								System.out.println("회원 가입이 완료됬습니다!");
//							}
						}
						if(check)
						{
							System.out.println("아이디가 중복되었습니다");
						}
						else
						{
							User u = new User();
							u.id = id;
							u.pw = pw;
							u.address = address;
							users.add(u);
							System.out.println("회원 가입이 완료됬습니다!");
							break;
						}
						
					}
				}
				
			}
			else if(choice ==2&&!checkLogin)
			{
				boolean check = false;
				//로그인하기
				System.out.println("----------로그인하기----------\n");
				System.out.print("ID 입력: ");
				String id = sc.nextLine();
				System.out.print("PW 입력: ");
				String pw = sc.nextLine();
				
				
				
				for (int i = 0; i < users.size(); i++) {
					if(users.get(i).id.equals(id)&&users.get(i).pw.equals(pw))
					{
						check = true;
						break;
					}
				}
				
				if(check)
				{
					System.out.println("로그인 성공!");
					checkLogin=true;
				}
				else
				{
					System.out.println("로그인 실패!");
				}
			}
			else if(choice==2&&checkLogin)
			{
				System.out.println("로그 아웃이 되었습니다");
				checkLogin= false;
			}
			else if(choice ==3)
			{
				System.out.println("----------회원정보보기----------\n");
				System.out.print("ID 입력: ");
				String id = sc.nextLine();
				int index =0;
				boolean check = false;
				//회원정보보기
				//id 를 입력하면 해당 id 회원 정보 보여주기
				for (int i = 0; i < users.size(); i++) {
					if(users.get(i).id.equals(id))
					{
						check = true;
						index = i;
						break;
					}
				}
				if(check)
				{
					System.out.println(users.get(index));					
				}
				else
				{
					System.out.println("해당 ID 없음");
				}
			}
			else
			{
				System.out.println(errMsg);
			}
		}
		
		
		
		
		
		
//		User u1 = new User();
//		u1.id = "abc";
//		u1.pw = "1234";
//		u1.address = "서울시";
//		
//		System.out.println(u1);
	}
}
