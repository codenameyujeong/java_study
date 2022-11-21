package test.ch08;

public interface RemoteControl {
	//인터페이스에 선언된 필드는 모두 PUBLIC STATIC FINAL 특성을 갖음.
	int MAX_VOLUME;
	int MIN_VOLUME;
	public void turnOn();
}
