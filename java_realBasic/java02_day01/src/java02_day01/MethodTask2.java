package java02_day01;

import java.util.Scanner;

public class MethodTask2 {
	// 로그인
	// 사용자 id 입력
	// pw 입력
	// showAr() 배열 보여주는 메서드 구현
	public static void showAr(String[][] a)
	{
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			System.out.print("{");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+ " ");		
			}
			System.out.print("}");
		}
		System.out.print("}");
	}
	//로그인 메서드 구현
//	public static void login(String id, String pw,String[][] database)
//	{
//		boolean check = false;
//		String res = "";
//		for (int i = 0; i < database.length; i++) {
//			if(database[i][0].equals(id))
//			{
//				check = true;
//				if(database[i][1].equals(pw))
//				{
//					System.out.println("로그인 성공");
//				}else
//				{
//					System.out.println("비밀번호가 틀렸어요");
//				}
//			}
//		}
//		if(!check)
//		{
//			System.out.println("존재하지 않는 ID 입니다");
//		}
//	}
	
	public static boolean login(String id, String pw,String[][] database)
	
	{
		//일괄처리를 위한 변수 check를 선언하고,false
		boolean check = false;
		for (int i = 0; i < database.length; i++)
		{   //만약 사용자가 입력한 id 가 데이터베이스 id와 일치한다면
			if(database[i][0].equals(id))				
			{	//사용자가 입력한 pw가 데이터베이스 pw와 일치한다면
				if(database[i][1].equals(pw))
				{	//로그인 성공
					check = true;
				}
			}
		}
		//마지막에 check 리턴
		return check;
	}
	
	public static void main(String[] args) {
		String[][] user = {{"abc","1234"},{"qwe","abc123"},{"hello","java"}};
//		System.out.print("{");
//		for (int i = 0; i < user.length; i++) {
//			System.out.print("{");
//			for (int j = 0; j < user[i].length; j++) {
//				System.out.print(user[i][j]+ " ");
//				
//			}
//			System.out.print("}");
//		}
//		System.out.print("}");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Id 입력: ");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력: ");
		String pw = sc.nextLine();
		//login(id,pw,user) true 라면
		if(login(id,pw,user))
		{
			//로그인 성공
			System.out.println("축하합니다 마음껏 이용하세요");
		}// 아니라면
		else
		{
			//로그인 실패
			System.out.println("로그인 실패");
		}
//		showAr(user);
	}
}
