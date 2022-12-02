package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeemPrintEx4 extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();//빔소리를 냄
			try {
				Thread.sleep(500);//0.5초
			}
			catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		Thread thread = new BeemPrintEx4();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);//0.5초
			}
			catch(Exception e) {}
	}
}
}

	


