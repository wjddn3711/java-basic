package java02_day03;

public class Field {
	public static void main(String[] args) {
		Car myCar = new Car("이정우","blue",200);
//		Car myCar = new Car();
	
		SuperCar momCar = new SuperCar("mom","red",2000);
		
//		myCar.name="이정우";
//		myCar.color="blue";
//		myCar.price=200;
//		momCar.engineOn();
//		momCar.go();
//		momCar.open();
		
//		myCar.open();  부모클래스는 자식클래스에서 새롭게 정의된 메서드를 사용할수 없다
//		myCar.go();
		
		myCar.engineOn();
		momCar.engineOn();
		
		
		
	}
}
