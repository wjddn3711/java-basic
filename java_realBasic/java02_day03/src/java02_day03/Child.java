package java02_day03;

public class Child extends Parent{
	@Override
	public void f() {
		
//		super.f(); super는 부모 클래스를 나타내준다. 부모클래스의 코드를 그대로 사용할때
		System.out.println("자식 클래스에 있는 메서드 호출됨");
	}
	
	public void hello()
	{
		System.out.println("자식 클래스에만 있는 메서드입니다");
	}
}
