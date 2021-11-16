package java02_day02;

public class Field2 {
	public static void main(String[] args) {
		User kim = new User();
		//kim.name = "이정우";
//		kim.setName("이정우");
//		System.out.println(kim.getName());
		
		//name ="김철수"
		//id = "abc1234"
		//pw = "1234"
		// 출력
		kim.setName("김철수");
		kim.setId("abc1234");
		kim.setPw("1234");
		System.out.println("Name: "+kim.getName());
		System.out.println("ID: "+kim.getId());
		System.out.println("PW: "+kim.getPw());
		
		
		
//		kim.c =100; private 은 같은 클래스 내부에서만 사용할 수 있다
//		kim.a = 100;
//		kim.b = 100;
//		kim.sayHello();
		
	}
}
