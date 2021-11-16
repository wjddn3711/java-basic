package java02_day02;

public class Student {
	static int cnt;
	
	int st_num;
	String name;
	int kor;
	int eng;
	int math;
	
	//기본생성자	(기본적으로 쓰이지만 생략됨)
//	public Student() {}
	
	//alt+command+s  --> Generate Constructor using field (생성된 class에서만 가능)
	//초기화 생성자
	public Student(String name, int kor, int eng, int math) 
	{
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		cnt++;
		st_num = cnt;
	}
	
//	public Student(String name, int kor, int eng, int math) 
//	{
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
		
//		return사용 불가능
//	} //오버로딩 , 다양성 추구
	
	public Student(String name)
	{
		this.name= name;
		cnt++;
		st_num = cnt;
	}
	// 실무에서는 기본 생성자는 명시적으로 쓰고 시작한다
	public Student() {
		cnt++;
		st_num = cnt;
//		name = "아직 등록이 안되었습니다"; 생성자 안에서 초기값을 입력하는 경우도 있다
	};
	// show()
	// ----학생정보----
	// 이름: 홍길동
	// 국어점수 : 00
	// 영어점수 : 00
	// 수학점수 : 00
	public void show()
	{
		System.out.printf("----%d번 학생정보----\n",st_num);
		System.out.printf("이름 : %s\n",this.name);
		System.out.printf("국어 점수 : %d\n",this.kor);
		System.out.printf("영어 점수 : %d\n",this.eng);
		System.out.printf("수학 점수 : %d\n",this.math);
		
	}
	public static void f()
	{
		System.out.println("static 으로 만든 메서드!");
//		System.out.println("나의 이름은 "+name+"입니다"); 객체에 따라 달라지기 때문에 사용할수없다
		// 오류, static 메서드는 객체가  중요하지 않아서 객체에 따라 달라지는 변수 사용 불가능
		System.out.println("총 학생 수는: "+cnt+"입니다");
	}
	
	
}
