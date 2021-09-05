package java_day02;

public class PrintfTask {
	public static void main(String[] args) {
		// 실수형 printf() 출력하기
		double d = 20.659;
		System.out.printf("내가 저장한 값은 %.3f입니다\n\n", d);
		
		// double 변수 pi에다가 3.14를 저장하고 
		double pi = 3.14;
		// 원주율은 3.14입니다 출력하기
		System.out.printf("원주율은 %10.2f입니다", pi);
		// 단 printf()사용하기
		
	}
}
