package java_day02;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		// 입력을 받으려면 Scanner를 알려줘야한다
		//Scanner 입력 후 ctrl+space import자동으로 해주기
		Scanner sc = new Scanner(System.in);
		//국어 성적 입력해주세요라는 문구 출력(줄바꿈 없이)
		System.out.print("국어성적 입력해주세요 : ");
		// nextInt()를 써서 int 타입으로 입력받기 kor라는 변수에 담아주기
		int kor = sc.nextInt();
		//수학 성적 입력해주세요라는 문구 출력(줄바꿈 없이)
		System.out.print("수학성적 입력해주세요 :");
		// nextInt()를 써서 int 타입으로 입력받고 math라는 변수에 담아주기
		int math = sc.nextInt();
		
		//합계를 담아줄 total 저장공간 
		int total = math+kor;
		//평균을 담아줄 avg 저장공간 2.0으로 한 이유
		double avg = (math + kor)/2.0;
		
		
		System.out.println("\n국어성적은 "+kor+"입니다");
		System.out.println("수학성적은 "+math+"입니다");
		System.out.println("총점은 "+total+"입니다");
		//평균은 60.00입니다 출력하기
		System.out.printf("평균은 %.2f입니다", avg);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
