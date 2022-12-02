package singletone;

public class Main {

	public static void main(String[] args) {
//		Printer p1 = new Printer();
//		Printer p2 = new Printer();
		User[] user = new User[10];//user객체를 담을 배열을 정의
		
		for(int i=0; i<user.length; i++) {
			//user객체를 생성해 배열에 넣어준다
			user[i] = new User("user" + i);
			user[i].print();
		}

	}

}
