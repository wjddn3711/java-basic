package java02_day02;

public class User {
	
	private String name;
	private String id;
	private String pw;
	
	
	
//	public void setName(String name)
//	{
//		this.name=name;
//	}
//	public String getName()
//	{
//		return name;
//	}
	
	
//	int a =10;
//	public int b = 20;
//	private int c = 30;
	
	
//	public void show() {
//		// 같은 클래스 안에서는 default, public, private 모두 사용 가능하다
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//	}
	
	//alt+command+s --> Generate getter and setter 자동 게터 세터 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	public void sayHello()
	{
		subMsg(); //남들에게 코드를 보이고 싶지 않을때 사용
		System.out.println("안녕하세요");
	}
	private void subMsg()
	{
		System.out.println("반갑습니다");
	}
}
