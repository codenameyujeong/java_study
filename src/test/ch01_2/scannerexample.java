package test.ch01_2;

import java.util.Scanner;

public class scannerexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("x값 입력: ");
		String strX = scanner.nextLine(); // enter키를 누르면 문자열을 읽는다.
		int x = Integer.parseInt(strX);

		System.out.println("y값 입력: ");
		String strY = scanner.nextLine(); // enter키를 누르면 문자열을 읽는다.
		int y = Integer.parseInt(strY);

		int result = x + y;
		System.out.println("result: " + result);
		System.out.println();

		while (true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();

			// if(data ==="q") javascript식으로 이퀄을 밑에줄처럼써야된다

			if (data.equals("q")) {
				break;
			}

			System.out.println("출력 문자열: " + data);
			System.out.println();

		}

		System.out.println("종료");
	}

}
