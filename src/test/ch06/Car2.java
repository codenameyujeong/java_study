package test.ch06;

public class Car2 {
		//인스턴스 필드
		int speed;
		//인스턴스 메소드
		void run() {
			System.out.println(this.speed + "으로 달립니다.");
		}
		
		void run2() {
			System.out.println(this.speed + "으로 달립니다.");
		}
			
		//정적(static)메소드
		
		static void simulate() {
//			this.speed = 200; 못씀
			Car2 myCar = new Car2();
			
			myCar.speed = 200;
			myCar.run();
		}
		
		
public static void main(String[] args) {
	simulate();
	
	Car2 myCar = new Car2();
	
	myCar.speed = 60;
	myCar.run();
}
}
