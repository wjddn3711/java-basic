package java_day07_my;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		String[] ar1 = {"안녕","안녕하세요","반가워"};
		for (String string : ar1) {
			System.out.println(string);
		}
		int [] ar = {10,20,30};
		for (int i : ar) {
			i =100;
			System.out.println(i);
		}
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		
		
//		for (int i = 0; i < ar.length; i++) {
//			System.out.println(ar[i]);
//		}
		//foreach 빠른 for문 향상된 for문
//		for(자료형 변수명 : 배열명) { }
		
		
		
	}
}
