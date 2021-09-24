package java2_day04;

class Outer{
	int a =10;
	public void outerShow()
	{
		Inner i = new Inner();
		i.innerShow();
		System.out.println(a);
	}
	
	//내부 클래스
	class Inner{
		int a = 20;
		public void innerShow()
		{	
			int a =30;
			System.out.println(a);// 30
			System.out.println(this.a);// 20
			System.out.println(Outer.this.a);// 10
		}
	}
}



public class InnerTest {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
//		i.innerShow();
		o.outerShow();
	}
}
