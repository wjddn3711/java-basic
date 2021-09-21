package java02_day02;

import java.util.Scanner;

public class Field {
	public static void main(String[] args) {
		//객체화 
//		Student s1 = new Student("홍길동",90,80,100);
//		Student s2 = new Student("김영희",80,100,70);
//		Student s3 = new Student("박철수",10,20,30);
//		Student s4 = new Student("김영희",80,100,70);
		
		Student[] students = {new Student("홍길동",90,80,100),new Student("김영희",80,100,70),
				new Student("박철수",10,20,30),new Student("김영희",80,100,70)};
		//학생의 정보를 출력하는 프로그램
		// 몇번 학생의 정보를 보시겠습니가? 1
		// 홍길동의 정보만 나오도록
		
		System.out.print("몇번 학생의 정보를 보시겠습니까? ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
//		students[n-1].show();
//		for (int i = 0; i < students.length; i++) {
//			if(students[i].st_num == n)
//			{
//				students[i].show();
//			}
//		}
		for (Student student : students) {
			if(student.st_num==n)
			{
				student.show();
			}
		}
		
//		s1.f();
//		Student.f();
//		String.format("%d입니다",10);
//		"안녕".equals("안녕");
		
		
//		s1.cnt = 100;
//		s2.cnt = 1000;
//		s3.cnt = 0;
//		System.out.println(s1.cnt);
		
//		s1.name="홍길동";
//		s1.kor= 90;
//		s1.eng=80;
//		s1.math=100;
//		
//		s2.name="김영희";
//		s2.kor=80;
//		s2.eng=100;
//		s2.math=70;

//		s1.show();
//		s2.show();
//		s3.show();
//		s4.show();
//		s5.show();
	}
	
}
