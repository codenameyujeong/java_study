package test.ch01_3;

public class Block {
	
	public static void main(String[]args) {
		int v1 = 15;
		int v2;
		
		if (v1 > 10) {
			int v4 = v1 - 10;
		}
		int v3 = v1+ v2 +5;
		
		int v1 = 1;
		System.out.println("v1:" + v1);
		if(true) {
			int v2 = 2;
			if(true) {
				int v3 =2;
				System.out.println("v1:"+v1);
				System.out.println("v2:"+v2);
				System.out.println("v3:"+v3);
			}
			System.out.println("v1:"+ v1);
			System.out.println("v2:"+ v2);
			System.out.println("v3:"+ v3);
		}
		System.out.println("v1:"+ v1);
		System.out.println("v2:"+ v2);
		System.out.println("이름: %s", "감자바");
		
	}

}

