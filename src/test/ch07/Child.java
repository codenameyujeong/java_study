package test.ch07;

public class Child extends Parent{
	
	public void method2() {
		System.out.println("Parent-method2()");
	}

	@Override
	public void method1() {
		
		super.method1();
	}

	
}
	
