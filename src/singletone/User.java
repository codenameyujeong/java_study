package singletone;

public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public void print() {
		Printer printer = Printer.getPrinter();
		//printer.toString() 객체의 주소
		System.out.println(this.name + "사용자가 사용하는 프린트" + printer.toString());
	}
}
