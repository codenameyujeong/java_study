package test.ch07;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SurpersonicAirplane sa = new SurpersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SurpersonicAirplane.SUPERSONIC;
		sa.fly();
	}

}
