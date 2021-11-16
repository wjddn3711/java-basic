package exceptionTest;

public class ExceptionTest2 {
	public static void main(String[] args) {
		int[] ar = {1,2,3};
		try {
			System.out.println(ar[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			int a= 10;
			int b= 0;
			System.out.println(a/b);
			System.out.println("예외가 발생함!");
		}
		finally {
			System.out.println("반드시 수행해야 한다");
		}
//		System.out.println("반드시 수행해야 한다");
		//데이터 베이스 연결     close()
	}
}
