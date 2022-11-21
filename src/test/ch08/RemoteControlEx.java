package test.ch08;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		
		rc = new Audio();//오디오교체
		rc.turnOn();
		
		//static의 특성을 가졌기에 객체를 생성하지않고호출
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);

	}

}
