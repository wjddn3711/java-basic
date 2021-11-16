package java02_day03;

public class SuperCar extends Car{
	public SuperCar(String name, String color, int price) {
		super(name, color, price); // 부모 클래스의 생성자
		// TODO Auto-generated constructor stub		
	}
//	public SuperCar() {
//		// TODO Auto-generated constructor stub
//	}
	
	public SuperCar()
	{
		super("기본값","기본값",0);
	}
	
//	public SuperCar() {
//		// TODO Auto-generated constructor stub
//		System.out.println("슈퍼카 타입 생성자 호출됨");
//	}
	
	public void open()
	{
		System.out.println("지붕이 열렸습니다");
	}
	
//	public void engineOn2()
//	{
//		System.out.println("버튼으로 시동켬");
//	}  오버라이딩을 통해 같은이름의 개선형과 혼동 없도록
	
	@Override  //재정의
	public void engineOn() {
		System.out.println("버튼으로 시동켬");
	}
	
	
}
