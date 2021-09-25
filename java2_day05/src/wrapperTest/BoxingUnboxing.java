package wrapperTest;

public class BoxingUnboxing {
	public static void main(String[] args) {
		
		int i = 10;
		Integer wi = new Integer(i); //기본 int 형을 Integer 타입으로 Boxing
		// 랩퍼클래스 내부에 있는 메서드를 사용하고 싶을때 박싱을 해주면 된다
		
		Integer wI = new Integer(10);
		int ip = wI.intValue();  // Integer 타입이 int 형으로 Unboxing
		
		double d = 3.14;
		Double wd = new Double(d); //기본 double 형을 Double 타입으로 Boxing
		
		Double wD = new Double(3.14);
		double dp = wD.doubleValue(); // Double 타입이 double 형으로 Unboxing
		
		boolean b = true;
		Boolean wb = new Boolean(b); //기본 boolean 형을 Boolean 타입으로 Boxing
		
		Boolean wB = new Boolean(true);
		boolean bp = wB.booleanValue(); // Boolean 타입이 boolean 형으로 Unboxing
		
	}
}
