package test.ch05;

public class ArrayMultiEX {

	public static void main(String[] args) {
		int[][] scores = { { 80, 90, 96 }, { 76, 88 } };
		System.out.println("1차원 배열 길일(반의 수):" + scores.length);
		System.out.println("1차원 배열 길일(첫번쨰 반의 학생 수):" + scores[0].length);
		System.out.println("1차원 배열 길일(첫번째 반의 학생 수):" + scores[1].length);
		
		System.out.println("첫번쨰 반의 세번쨰 학생:" + scores[0][2]);
		System.out.println("첫번쨰 반의 세번쨰 학생:" + scores[1][1]);
		
		int class1Sum = 0;
		
		for (int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		
		double class1Avg = (double) class1Sum/ scores[0].length;
		System.out.println("첫번째 반의 평균" + class1Avg);
	}
??????
}
