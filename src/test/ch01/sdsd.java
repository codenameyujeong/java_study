package test.ch01;

public class sdsd {

	private static int sum1;

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
	      int sum = 0;
	      for(int i : arr) {
	         sum += i;
	      }
	      int avg = sum / arr.length;
	      System.out.println("arr의 총합은 : " + sum + " 평균은 : " + avg);
}