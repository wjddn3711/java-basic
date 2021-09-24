package java2_day04;

public class B extends A{
	//java에서는 다중 상속을 지원하지 않는다
	//모호성: 같은 이름의 메서드나 멤버 변수가 부모타입에 존재할 경우
	//어떤 클래스의 필드를 의미하는지 모호하기 때문에 다중상속을 지원하지 않습니다
	

	//추상 클래스 A에서 구현되지 않은 추상 메서드 test()를 재정의 하지 않으면
	// 오류가 발생한다
	// 반드시 부모타입에 있는 추상 메서드를 재정의 하여 사용해야한다
	@Override
	public void test() {
		System.out.println("B클래스에서 재정의된 메서드");
		// TODO Auto-generated method stub
		
	}
	
}
