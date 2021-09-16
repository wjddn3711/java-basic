package java_day06_my;

public class ArrayTest {
	public static void main(String[] args) {
		// int 타입의 배열 선언해보기
		
		int[] ar = {10,20,30};
		System.out.println(ar); //배열은 시작주소만 갖고 있다.
		int i =0;
		for(i=0; i<3;i++)
		{
			System.out.println(ar[i]);
		}
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
	}
}
