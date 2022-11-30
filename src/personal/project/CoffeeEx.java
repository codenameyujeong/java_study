package personal.project;

import java.util.ArrayList;
import java.util.Scanner;

import Ex.cus.Customer;
import Ex.cus.GoldCustomer;
import Ex.cus.VIPCustomer;

public class CoffeeEx {
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//객체 선언
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYul = new GoldCustomer(10040, "정약용");
		Customer customerKim = new VIPCustomer(10050, "이율곡", 12345);
		//리스트에 추가
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("==========정현님의 카페==========");
		System.out.println("아메리카노 : 1, 카페라뗴 : 2, 헤이즐넛 : 3");
		System.out.println("주문하신 메뉴 넘버를 적어주세요");
		int input = scanner.nextInt();
		
		Coffee coffee;
		if (input == 1) {
			coffee = new Americano();
			coffee.show();
		} else if (input == 2) {
			coffee = new Cafalatte();
			coffee.show();
		}else if(input == 3) {
			coffee = new Hazelnutcoffee();
			coffee.show();
		}
		
		String input1 = scanner.next();
		if (input1 == "이순신") {
			
			int price = coffee.price - (coffee.price * bonusRatio);
		}
		
		
		
		public static Customer findCustomer(String input1) {	
			for( Customer customer : customerList){
				if (customer.getCustomerID() == customerID) {				
			return customer;
				}
			}
		return null;
	}

}
