package test.ch06.quiz;

public class Example1 {
	
	public static boolean isNumber(String str) {
		if (str == null || str.equals(""))
			return false;	
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("값:" + ch);
			} // for
			return true;	
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니다까?" + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니다까?" + isNumber(str));
	}
 
}
