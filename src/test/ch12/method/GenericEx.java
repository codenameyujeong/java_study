package test.ch12.method;

public class GenericEx {
	//제네릭 메소드
	public static <T> Box <T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	public static void main(String[] args) {
		//제네릭 메소드 호출: T를 Integer로 대체
		Box<Integer> box1 = boxing(100);
		int inValue = box1.get();
		System.out.println(inValue);
		
		Box<String> box2 = boxing("유정현");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
