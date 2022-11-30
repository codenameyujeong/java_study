package test.ch11.Object;

public class Member extends Object {
	//필드
	public String id;
	//생성자
	public Member(String id) {
		
	}
	//논리적 동등 만들기: 객체의 주소와 상관없이 필드의 값으로 비교
	@Override
	public boolean equals(Object obj) {
		//obj가 Member 객체를 가지고있냐?
		if (obj instanceof Member) {//강제 형변환 하기 위해 검사
			Member target = (Member)obj; //강제 형변환:자식객체에있는 필드가져옴
			if (id.equals(target.id)) {
				return true;	
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Object obj1 = new Object();
//	Object obj2 = obj1;
//	
//	System.out.println(obj1.equals(obj2));//번지수를 비교
//	System.out.println(obj1 == obj2);//번지수를 비교
//	
//	String a = "1";
//	String b = "2";
//	
//	
//	
//	//논리적 동등:같은 객체든 다른 객체든 객체 저장 데이터가 동일하다.
	
	
}
