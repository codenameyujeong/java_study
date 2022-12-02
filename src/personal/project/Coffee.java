package personal.project;

public class Coffee {
	String name;
	String coffeebeans;
	protected String customerName;
	protected String customerGrade;
	int price;
	int bonusPoint;
	double bonusRatio;
	int id;
	
	public void show() {
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("원두 이름:" + coffeebeans);
		System.out.println();
	}
	
	public Coffee(String name, String coffeebeans, int price) {
		this.name = name;
		this.coffeebeans = coffeebeans;
		this.price = price;
		
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급: " + customerGrade + ", 보너스 포인트: " + bonusPoint + "점"; 	
	}
}
