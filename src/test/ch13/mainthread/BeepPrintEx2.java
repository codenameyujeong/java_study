package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx2 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("띵");
					try {
						Thread.sleep(500);//0.5초
					}
					catch(Exception e) {}
			}
				
			}});	
		
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();//빔소리를 냄
			try {
				Thread.sleep(500);//0.5초
			}
			catch(Exception e) {}
		}
			for(int i=0; i<5; i++) {
				System.out.println("띵");
				try {
					Thread.sleep(500);//0.5초
				}
				catch(Exception e) {}
		}
	}
}