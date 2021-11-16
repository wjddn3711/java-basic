package java2_day04;

public interface InterTest {
	int a =0;// static final 키워드 생략됨
	// interface에서는 변수로 static final 변수밖에 선언을 못한다
	static final int b =0;
	// interface에서는 추상메서드만 만들 수 있다
	public abstract void show();
	// abstract 키워드 생략 가능
	public void show2();
	
}
