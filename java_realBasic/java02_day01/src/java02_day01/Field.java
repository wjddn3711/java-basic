package java02_day01;

public class Field {
	public static void main(String[] args) {
		Student hong = new Student();
		Student kim = new Student();
		kim.name= "김영희";
		kim.kor=70;
		kim.math=100;
		kim.show();
//		System.out.println(kim.name);
//		System.out.println(kim.kor);
//		System.out.println(kim.math);
//		System.out.println(hong.name);
//		System.out.println(hong.kor);
//		System.out.println(hong.math);
		hong.name="홍길동";
		hong.kor=90;
		hong.math=70;
		hong.show();
		// alt+shift+a --> 그리드 모드
//		System.out.println(hong.name);
//		System.out.println(hong.kor);
//		System.out.println(hong.math);
		
	}
}
