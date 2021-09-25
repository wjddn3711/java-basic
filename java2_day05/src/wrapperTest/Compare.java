package wrapperTest;

public class Compare {
	public static void main(String[] args) {
		int  i = 10;
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		System.out.println("랩퍼클래스 == 기본타입: "+(i1==i) ) ;//autounboxing으로 기본자료형하고 비교됨
		System.out.println("랩퍼클래스.equals(기본타입): "+i1.equals(i));//autoboxing
		System.out.println("랩퍼클래스==랩퍼클래스:"+(i1.intValue()==i2.intValue()));
		System.out.println("랩퍼클래스.equals(랩퍼클래스):"+i1.equals(i2));
//		System.out.println(i1);
//		System.out.println(i2);
//		System.out.println(i);
		
				
		
	}
}
