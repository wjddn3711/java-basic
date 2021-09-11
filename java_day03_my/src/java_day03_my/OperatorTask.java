package java_day03_my;

import java.util.Scanner;

public class OperatorTask {
	public static void main(String[] args) {
		//사용자에게 a와 b를 입력받고
		//a를 b로 나눴을때 몫과 나머지 출력하기
		//입력예시 : 10  3
		//출력예시 : 10을 3으로 나눴을 때 몫은 3이고, 나머지는 1 입니다
		
		//입력 메소드가 정의되어있는 Scanner 파일을 알려주기
		Scanner sc = new Scanner(System.in);
		//사용자에게 a와 b를 입력하라고 출력해주기
		System.out.printf("숫자 두개를 입력 해주세요: ");
		//사용자가 입력한 값을 받아와서 a와 b 라는 저장공간에 담아주기
		int a = sc.nextInt();
		int b = sc.nextInt();
		//사용자에게 받은 a,b를 통해 a/b변수 만들기
		int div = a/b;
		//사용자에게 받은 a,b를 통해	a%b변수 만들기
		int el = a%b;
		//a,b를 활용하여 원하는 문구 출력하기
//		System.out.println(a+"을 "+b+" 로 나눴을 때 몫은 "+a/b+"이고, 나머지는 "+a%b+"입니다.");
		
		System.out.printf("%d을 %d로 나눴을 때 몫은 %d 이고, 나머지는 %d입니다\n",a,b,div,el);
	}
}
