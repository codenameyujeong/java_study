package test.ch03;

public class ConditionalOperator {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C' );
		System.out.println(grade);
	}
}
