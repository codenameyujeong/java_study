package test.ch06;

public class CarEx {

	public static void main(String[] args) {
		//1. 객체 생성
		Car myCar = new Car();
		System.out.println(myCar.model);
		System.out.println(myCar.company);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 값:" + myCar.speed);
	}

}
