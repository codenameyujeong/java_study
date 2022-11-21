package test.ch07;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		Parent.method1();
		Parent.method2();
		Parent.method3();

	}

}
