package singletone;
//프린터 객체는 무조건 하나만 생성되어야 한다
public class Printer {
	private static Printer printer = null;

	//생성자를 private으로 바꿔준다
	public Printer() {
		
	}
	
	//메소드
	public static Printer getPrinter() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}
	
}
