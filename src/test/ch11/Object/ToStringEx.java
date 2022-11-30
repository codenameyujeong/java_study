package test.ch11.Object;

public class ToStringEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		//toString: 객체의 문자정보를 리턴을 한다.
		//@6f2b958e ->객체를 나타내는 16진수 해시코드
		//오버라이드를 해서 사용을 할떄는 특별하게 나타내고 싶은것
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		
		
		try {
			int value = Integer.parseInt("1oo");
		}catch(NumberFormatException e) {
			System.out.println("에러입니다");
		}
	}
	
}