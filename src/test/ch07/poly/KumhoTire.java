package test.ch07.poly;

public class KumhoTire extends Tire {

	@Override
	public void roll() {
		System.out.println("금호타이어가 빠르게 회전합니다.");
		super.roll();
	}

}
