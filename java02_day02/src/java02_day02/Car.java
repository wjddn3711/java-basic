package java02_day02;

public class Car {
	String name;
	String color;
	int price;
	
	public void engineOn()
	{
		System.out.println("엔진이 켜졌습니다");
	}
	public void go()
	{
		System.out.println("앞으로 갑니다");
	}
	public void show()
	{
		System.out.printf("이름: %s\n",name);
		System.out.printf("색깔: %s\n",color);
		System.out.printf("가격: %s\n",price);
	}
	
}
