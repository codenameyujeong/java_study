package Fomat;

import java.util.regex.Pattern;

public class PatterEx {

	public static void main(String[] args) {
		String regExp = "(010|02)-\\d{3,4}-\\d{4}";//패턴을 넣을 문자열, 전화번호 체크
		String data = "010-123-4567";
		
		boolean result = Pattern.matches(regExp, data);//matches (패턴,검증하고픈 데이터)
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "test@naver.com";
		
		result = Pattern.matches(regExp, data);

	}

}
