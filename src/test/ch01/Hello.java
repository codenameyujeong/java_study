package test.ch01;

public class Hello {

	public static void main(String[] args) {
		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 2진수
		int var3 = 365; // 2진수
		int var4 = 0xB3; // 2진수
		long var5 = 10000000000000l;
		long var6 = 10000000000000L;
		char c1 = 'A';
		char c2 = 65;
//		System.out.println(var1 + ":"+var2+":"+ var3);

		double x = 50 ^ 2;
		float fx = 3e6f;

		boolean stop = true;

		boolean result1 = (x == 20); // x가 20인지 아닌지

		System.out.println(result1);

		if (stop) {
			System.out.println("정지합니다.");
		}

		String name = "김경범";
		String one = "A";
		System.out.println(name + one);
	}

}
