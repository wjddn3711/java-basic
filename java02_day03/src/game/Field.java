package game;

import java.util.Scanner;

public class Field {
	public static void main(String[] args) {
		String menu = "캐릭터를 선택해 주세요\n"+
				"1. 고양이	2.강아지	3.호랑이";
		String subMenu = "1. 먹기\n"
				+ "2. 산책\n"
				+ "3. 잠자기\n"
				+ "4. 정보보기\n"
				+ "5. 나가기";
		Animal avatar = new Animal("기본",0,0);
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String name ="";
		int feed=0;
		int hp=0;
		
		
		System.out.println(menu);
		choice = sc.nextInt();
		// 사용자가 입력한 번호에 따라 알맞은 메서드를 사용하기 위해서
		// 일단 공통으이 타입인 Animal타입으로 업캐스팅해서 담아준다
		if(choice==1)
		{	// upcasting
			avatar = new Cat("고양이",100,10);
		}
		else if(choice==2)
		{
			avatar = new Dog("강아지",50,20);
		}
		else if(choice==3)
		{
			avatar = new Tiger("호랑이",20,20);
		}
		else
		{
			System.out.println("잘못 입력 하셨습니다.");
		}
		while(true)
		{
			System.out.println(subMenu);
			choice = sc.nextInt();
			if(choice==5)
			{
				break;
			}
			else if(choice==1)
				//사용자가 선택한 캐릭터에 알맞은 메서드가 실행되도록 업캐스팅된 객체를 사용한다
			{
				if(avatar.eat())
				{
					System.out.println("먹기 성공!");
					System.out.printf("현재 체력: "+avatar.hp+" / "+avatar.max_hp);
					System.out.println("현재 먹이 갯수: "+avatar.feed);
					System.out.println("-----------------------------");
				}
				else
				{
					System.out.println("먹이가 부족합니다!!");
					System.out.println("현재 먹이 갯수: "+avatar.feed);
					System.out.println("-----------------------------");
				}
			}
			else if(choice==2)
			{
				//산책하기
				if(avatar.walk())
				{
					System.out.println("산책 성공!");
					System.out.println("현재 체력: "+avatar.hp+" / "+avatar.max_hp);
					System.out.println("-----------------------------");
				}
				else {
					System.out.println("체력이 부족합니다!!");
					System.out.println("현재 체력: "+avatar.hp);
					System.out.println("-----------------------------");
				}
			}
			else if(choice==3)
			{
				avatar.rest();
				System.out.println();
				System.out.println("현재 먹이 갯수: "+avatar.feed);
				System.out.println("현재 체력: "+avatar.hp);
				System.out.println("-----------------------------");
				//잠자기
			}
			else if(choice==4)
			{
				avatar.show();
				//현재 상태 
			}
			else
			{
				System.out.println("다시 입력해주세요!!");
			}
		}
		System.out.println("게임을 종료합니다");
		// instanceof
		// 업캐스팅된 객체를 다시 자식 타입으로 다운캐스팅하여 자식에서 새롭게 정의된 메스드를 사용할 수 있다
		// 이때 어떤 자식으로부터 업캐스팅되었는지를 알아내기 위해서 instanceof라는 연산자를 사용한다
		if (avatar instanceof Cat)
		{
			Cat c = (Cat)avatar;
			c.cat();
		}
		else if(avatar instanceof Dog)
		{
			Dog d = (Dog)avatar;
			d.dog();
		}
		else
		{
			Tiger t = (Tiger)avatar;
			t.tiger();
		}
	}
}
