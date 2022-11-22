package test.ch08.interface_extends;

public class InterfaceEx {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		InterfaceA ia = new impl;//자동 형변환
		ia.methodA();
		
		
		
	}

}
