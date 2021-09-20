package java02_day01;

public class MethodTest {
	//함수 선언 영역
	public static int add(int a, int b)
	{
//		System.out.println(a+b);
		return a+b;  //return	타입이 없을때는 return타입에 void
	}
	
	public static void sayHello() //매개 변수가 필요없는 경우
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) {
		System.out.println(add(50,60)/2); //메서드 사용(호출)  매개변수의 수와 타입을 맞춰줘야한다
		int num = add(30,90);
		System.out.println(num);
		sayHello();
	}
	
	
//		int a = 10;
//		int b = 20;
//		System.out.println(a+b);
//	}
	//함수 선언 영역
}
