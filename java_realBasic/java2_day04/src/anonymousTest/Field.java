package anonymousTest;

public class Field {
	public static void main(String[] args) {
		A a = new A() {
			
			@Override
			public void f() {
				System.out.println("재정의된 f() 메서드!");
			}
			public void show()
			{
				System.out.println("익명 클래스에서 새롭게 정의한 메서드");
			}
		};
		a.f();
//		a.show(); 익명 클래스에서 새롭게 정의된 메서드는 사용할 수 없다
		//마치 업캐스팅된 객체에서 자식타입에서 새롭게 정의된 메서드를 사용하지 못했던 것처럼
		
	}
}
