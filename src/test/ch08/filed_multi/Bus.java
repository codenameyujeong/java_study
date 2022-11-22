package test.ch08.filed_multi;

public class Bus implements Vechicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
	}

	@Override
	public void run(int x) {
		System.out.println("매개변수 넣은 메소드");
		
	}

}
