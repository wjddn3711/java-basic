package java2_day04;

public class AbstractTest {
	public static void main(String[] args) {
//		A a = new A(); 오류, 추상 클래스는 아직 구현이 안된 추상메서드가 존재하기 때문에 오류가 난다
		// 추상 클래스는 반드시 부모타입으로서 상속을 하는데 사용되어야한다
		B b = new B();
		b.test();
		
	}
}
