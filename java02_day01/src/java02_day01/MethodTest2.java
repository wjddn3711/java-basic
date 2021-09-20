package java02_day01;

public class MethodTest2 {
	
	public static int add(int a, int b)
	{
		return a+b;
	}
	//return타입과는 무관
//	public static double add(int a, int b)
//	{
//		return (double)a+b;
//	}
	// 자료형은 같지만 매개변수 이름이 다른 경우 오버로딩 되지 않는다
//	public static int add(int num1, int num2)
//	{
//		return num1+num2;
//	}
	//오버로딩
	//메서드의 이름은 같지만 매개변수의 타입 혹은 개수가 다른 경우
	public static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public static double add(double a, int b)
	{
		return a+b;
	}
//	public static int add2(int a, int b, int c)
//	{
//		return a+b+c;
//	}
	
	
	public static void main(String[] args) {
		System.out.println(add(10.12,20));
	}
}
