package test.ch08;

public class Service {
//디폴드 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
	}
	
	//private 메소드
	private void defaultCommon() {
		System.out.println("defaultMethod1 중복 코드");
		System.out.println("defaultMethod2 중복 코드");
		System.out.println();
		
	}
	
	//정적 메소드
	static void staticMethod
	
}
