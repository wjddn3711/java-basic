package java_day03_my;

public class OperatorTest {
	public static void main(String[] args) {
		//덧셈
		System.out.println(3+3); //int + int ---> int
		System.out.println(3+3.2); //int + double ---> double
		System.out.println("안녕"+3+3.2); //String + int + double ---> String
		System.out.println();
		
		//뺌셈
		System.out.println(3-2); //int - int ---> int
		System.out.println(3-3.4); //int - double ---> double
		System.out.println();
		
		//나눗셈
		System.out.println(5/2); // int / int ---->int (몫)
		System.out.println(5/3.4); // int / double ---->double		
//		System.out.println(5/0);  0으로 나눌 수는 없다		
		System.out.println();
		
		//곱셈
		System.out.println(3*2); // int * int ----->int
		System.out.println(3*2.7); // int * double ----->double
		System.out.println();
		
		//모듈러스
		System.out.println(10%5); // 나머지를 가져와준다
		
	}
}
