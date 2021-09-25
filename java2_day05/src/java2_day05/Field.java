package java2_day05;

public class Field {
	public static void main(String[] args) {
		Parent a = new Parent();
		a.f();
		a.f2();
//		a.onlyChild(); 사용불가, 자식클래스에서 새롭게 정의된 메서드이기 때문에
		//Child 객체 b 만들기
		Child b = new Child();
		b.f();
		b.f2();
		b.onlyChild();
		//upcasting c만들기
		Parent c = new Child();
		c.f();
		c.f2();
//		c.onlyChild(); 부모타입으로 업캐스팅 했기 때문에 새롭게 정의된 메서드는 사용불가
		System.out.println();
		
		Parent d = new Parent() {
			@Override
			public void f2() {
				System.out.println("익명클래스에서 재정의된 메서드");
			}
			public void onlyAnony()
			{
				System.out.println("익명클래스에서 새롭게 만든 메서드");
			}
		};
		d.f();
		d.f2();
//		d.onlyAnony(); 새롭게 정의된 메서드임으로 사용불가
	}
}
