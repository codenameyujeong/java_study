package test.ch09.noname;

public class Car {
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("한국타이어가굴러갑니다.");
		}
	};
	
	//메소드
	public void run01() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run02() {
		//로컬 변수에 익명 자식 객체 사용
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("금호타이어가굴러갑니다.");
			}
		};
	}
		
}
