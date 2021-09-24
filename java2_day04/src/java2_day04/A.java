package java2_day04;

public abstract class A { //A는 추상 클래스, 추상 메서드를 갖고 있기 때문에
	// 멤버 변수 선언 가능
	static final int a = 10;
	//final 변수를 상수화 해준는 키워드이다

	String str;
	
	
	//추상 메서드
	//따로 기능을 구현해놓지 않고, 자식 타입에서 반드시 overriding 하여 사용할 수 있도록
	//강제성을 부여한
	public abstract void test();
	//일반 메서드 선언 가능
	public void f()
	{
		//a = 100; final 변수에는 값변경 X
		System.out.println("일반 메서드");
	}
}
