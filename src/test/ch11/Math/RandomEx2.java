package test.ch11.Math;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int i=0; i<=5; i++) {
			//nextInt(n) : int타입의 랜덤한 숫자 리턴(0<= ~ <n)
			System.out.println(rand.nextInt(10) + ",");
		}
		System.out.println("");
		
		Random rand2 = new Random();
		for(int i=0; i<=5; i++) {
			System.out.println(rand2.nextInt(10) + ",");
			
		
		}

	}

}
