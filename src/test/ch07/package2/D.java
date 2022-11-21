package test.ch07.package2;

import test.ch07.package1.A;

public class D extends A {
	public D() {
		super(); //A클래스의 생성자 호출
	}
	
	public void method1() {
		this.field1 = "2";
		this.method();
	}
	public void method2() {
		A a = new A();//o
		a.field = "1";//o
		a.method();//o
	}
}
