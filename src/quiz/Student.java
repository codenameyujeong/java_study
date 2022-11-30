package quiz;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal() {
		return (int)kor+eng+math;
		
	}
	public float getAverage() {
		return (float)kor+eng+math/3;
	}
	@Override
	public String toString() {
		System.out.println("name" + ban + no);
		return "name" + ban + no;
	}
}

Bus bus = (Bus)vehicle;
vehicle.run();
bus.run();
bus.checkFare();
