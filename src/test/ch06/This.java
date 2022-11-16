package test.ch06;

public class This {
	String model;
	int speed;
	//매개변수명이 필드에 있는 데이터명과 같으면 필드데이터에는 This를 붙인다.
	This(String model) {
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run( ) {
		this.setSpeed(100); //같은 클래스 간의 메소드 호출 시
		System.out.println(this.model + "," + this.speed);
	}
}
