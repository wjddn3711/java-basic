package java02_day03;

public class Car {
	String name;
	String color;
	int price;
	
	public Car(String name , String color, int price)
	{
		this.name = name;
		this.color=color;
		this.price = price;
	}
//	public Car() {
//		System.out.println("CAr 기본생성자 형성됨");
//	}
//	public Car() {
//		// TODO Auto-generated constructor stub
//	}
	
	public void engineOn()
	{
		System.out.println("열쇠로 시동을 켰습니다");
	}
	public void go()
	{
		System.out.println("앞으로 갑니다");
	}
	
	
}
