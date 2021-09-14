package java_day05_my;

public class OperatorTest {
	public static void main(String[] args) {
		int a = 10;
		// 후위형은 연산자의 우선순위가 낮아서 a가 출력되고 더해진다.
		System.out.println(a++);
		System.out.println(a);
	}
}
