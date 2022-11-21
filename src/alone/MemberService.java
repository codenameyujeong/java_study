package alone;

public class MemberService {
	
	String id;
	String password;
	boolean login(String id, String password) {
		if(id == "hong" && password == "12345" ) {
			return true;
		}else
			return false;
	}
	
}
