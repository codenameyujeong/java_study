package test.ch08.filed_multi;

public class CastEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();//자동 타입변환(형변환)
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		bus.run();
		//bus.checkFare();
	}
	
	public static void ride(Vehicle vehicle) {

}
