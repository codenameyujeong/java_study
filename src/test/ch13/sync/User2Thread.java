package test.ch13.sync;

public class User2Thread extends Thread{
	private Calculator calculator;
	
	public User2Thread() {
		setName("user2Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory2(50);
		
	}	
}
