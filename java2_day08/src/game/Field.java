package game;

import java.util.ArrayList;
import java.util.Scanner;

public class Field {
	public static void main(String[] args) throws Exception {
		// 퀴즈 게임. 게임을 시작하면 사용자한테 id를 받는다
		// 정답을 맞추면 1점이 증가한다
		// 종료하고 다시 시작하더라도 데이터가 사라지지 않고 계속 사용한다
		Scanner sc = new Scanner(System.in);
		Method m = new Method();
		ArrayList<String[]>quiz = new ArrayList<>();
		ArrayList<String[]>user = new ArrayList<>();
		String [] ar = new String [2];
		int point =0;
		boolean check = false;
		int idx =0;
		while(true)
		{
			System.out.println("1. 문제풀기\n2. 나가기");
			String input = sc.nextLine();
			if(input.equals("2"))
			{
				break;
			}
			else if(input.equals("1"))
			{
				System.out.print("ID를 입력해주세요: ");
				String id = sc.nextLine();
				
				user = m.getUser();
				for (int j = 0; j < user.size(); j++) {
					for (int j2 = 0; j2 < user.get(j).length; j2++) {
						if(user.get(j)[0].equals(id))
						{
							check=true;
							idx = j;
						}
					}
				}
				
				//퀴즈 설계
				quiz = m.getQuiz();
				for (int i = 0; i < quiz.size(); i++) {
					for (int j = 0; j < quiz.get(i).length-1; j++) {
						System.out.println(quiz.get(i)[j]);
					}
					String answer = sc.nextLine();
					if(answer.equals(quiz.get(i)[5]) && check)
					{
						System.out.println("정답입니다!");
						point = Integer.parseInt(quiz.get(idx)[1])+1;
					}
				}
				
				ar[0]=id;
				ar[1]=point+"";
				user.add(ar);
				m.updateUser(user);
			}
			else
			{
				System.out.println("다시 입력");
			}
		}
	}
}
