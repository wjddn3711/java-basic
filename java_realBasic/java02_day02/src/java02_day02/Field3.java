package java02_day02;

public class Field3 {
	public static void main(String[] args) {
		Car myCar= new Car();
		myCar.name="이정우";
		myCar.color="blue";
		myCar.price=200;
//		myCar.go();
//		myCar.show();
		
		SuperCar momcar = new SuperCar();
		momcar.name="엄마";
		momcar.color="red";
		momcar.price=2000;
//		momcar.show();
//		momcar.go();
//		momcar.engineOn();
		momcar.open();
//		mycar.open(); 부모클래스는 자식클래스에서 정의된 내용을 알지 못한다
	}
}
