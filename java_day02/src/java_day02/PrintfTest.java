package java_day02;

public class PrintfTest {
	public static void main(String[] args) {
		// 문자 형식 지정자 %c
		System.out.printf("%c\n", 'a');
		// 실수 형식 지정자 %f
		System.out.printf("%f\n", 3.14);
		// 문자열 형식지정자 %s
		System.out.printf("%s\n", "안녕");
		//정수 형식지정자 %d
		System.out.printf("안녕하세요 오늘은 %d월 입니다\n", 6);
		
		System.out.println("안녕하세요\n반갑습니다\n제이름은");
		//줄바꿈 제어문자
		//   \n
		// println()에서도 사용 가능하다
		
		//10진법이 영어로 decimal
		//f float
		
//		float d = 3.14F;
//		System.out.println(d);
		
	}
}
