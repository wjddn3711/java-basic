package java_day07_my;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		//사용자에게 국어 수학 영어 점수를 입력 받아서 차례대로 배열에 담아주기
		
		Scanner sc = new Scanner(System.in);
		int n = 0; //과목수
		int a = 0; //점수들
		int sum = 0; //점수 합계
		double avg = 0; //점수 평균
		String[] msg = {"국어 점수 입력: ","수학 점수 입력: ","영어 점수 입력: "};
		System.out.print("과목수: ");
		n = sc.nextInt(); //과목수를 입력받는다
		int [] ar = new int [n]; //과목수 만큼의 배열을 생성한다
		System.out.print("점수들을 입력해주세요: \n");
		for(int i=0; i<ar.length; i++) //배열의 크기(n)만큼 점수를 입력받는다
		{
			System.out.println(msg[i]);
			ar[i] = sc.nextInt(); //배열의 처음부터 점수 입력
			sum += ar[i]; //점수 총합 집
		}
		avg = (double)sum/n; //평균값 계산
		System.out.printf("평균은: %.2f",avg);
	}
}

