package java02_day03;

public class Field2 {
	public static void main(String[] args) {
		
		//업캐스팅
		Child b = new Child();
		// b는 Child 타입이다 -->O
		// b는 Parent 타입이다 -->O
		// b는 Object타입이다 -->O
		Parent d = new Parent();
		// d는 Child 타입이다 -->X
		// d는 Parent타입이다 -->O
		// d는 Object타입이다 -->O
		//a instanceof A
		//a 가 A타입이니? true / false
		
		Object[] ar= {1,"sda",b,d};
		System.out.println(d);
//		System.out.println(b instanceof Child);
//		System.out.println(b instanceof Parent);
//		System.out.println(d instanceof Child);
//		System.out.println(d instanceof Parent);
		
		
		
		Parent c = new Child(); //upcasting 
//		System.out.println(c instanceof Child);
		
		
//		c.common();
//		c.hello(); 오류, 자식에서 새롭게 정의된 메서드는 부모타입으로 들어갈때 짤림
//		c.f(); // 자식에서 재정의된 메서드가 실행된다
		
		//다운캐스팅
		// 부모를 자식으로...
		// 부모 타입을 자식 타입으로 넣는 것은 안된다
		// 부모타입으로 바꾼 자식을 다시 자식 타입으로 바꿔줄때 사용
//		Child a = (Child)c;
//		a.hello();
	}
}
