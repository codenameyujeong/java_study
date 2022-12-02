package test.ch13.mainthread;

public class ThreadNameEx {

	public static void main(String[] args) {
		//main 쓰레드 이름 가져오기
		Thread mainThread = Thread.currentThread();//main 쓰레드를 얻어온다
		System.out.println(mainThread.getName());
		//쓰레드 3개 생성
		for (int i=0; i<3; i++) {
		Thread threadA = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행");	
			}		
		};
		threadA.start();
	}
		
		//chat쓰레드 생성
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행");	
			}		
		};
		chatThread.setName("chat-thread");
		chatThread.start();
	}
}
