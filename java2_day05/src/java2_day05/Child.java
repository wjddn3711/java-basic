package java2_day05;

public class Child extends Parent{
	@Override
	public void f2() {
		System.out.println("Child 클래스에서 재정의된 메서드");
	}
	
	public void onlyChild()
	{
		System.out.println("Child 클래스에만 있는 메서드");
	}
}
