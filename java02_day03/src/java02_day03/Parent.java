package java02_day03;

public class Parent {
	
	
	int a;
	String b;
	
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	
	public Parent(int a, String b) {
		//Java 에서는 Object라는 최상위 클래스를 모두 공통적으로 상속 받는다
		super();  
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		String res = "이 객체에 담겨있는 a 값은: "+a+" 이 객체에 담겨있는 b값: "+b;
		return res;
	}
	
	
	public void f()
	{
		System.out.println("부모 클래스의 메서드 호출됨");
	}
	public void common()
	{
		System.out.println("부모와 자식 클래스에 공통적으로 사용하는 메서드");
	}
}
