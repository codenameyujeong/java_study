package test.ch11.reflection;

public class Car {

	public static void main(String[] args) {
//		Class clazz = Car.class;
//		Class clazz = Class.forName("test.ch11.reflection.Car");
		
		
		System.out.println("패키지 이름:" + clazz.getPackage().getName());
		System.out.println("클래스의 간단한 이름: " + clazz.getSimpleName());
		System.out.println("클래스의 전체 이름: " + clazz.getTypeName());

	}

}
