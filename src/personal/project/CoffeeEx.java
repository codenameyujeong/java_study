package personal.project;

import java.util.ArrayList;
import java.util.Scanner;

import Ex.cus.Customer;
import Ex.cus.GoldCustomer;
import Ex.cus.VIPCustomer;

public class CoffeeEx {
	
	private static ArrayList<Coffee> orderList = new ArrayList<Coffee>();
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	private static ArrayList<Coffee> coffeeList = new ArrayList<Coffee>();
	static Scanner scanner = new Scanner(System.in);
	private static int customerID;
	private static int bonusRatio;
	public static boolean status = true;
	
	static Coffee americano = new Americano("아메리카노", "에테오피아 예가체프", 4000 );
	static Coffee cafelatte = new Cafalatte("카페라떼", "게이샤", 4500);
	static Coffee hazelnut = new Hazelnutcoffee("헤이즐넛", "과테말라", 5000);
	
	public static Customer findCustomer(String input1) {	
		for( Customer customer : customerList){
			if (customer.getCustomerID() == customerID) {				
		return customer;
			}
		}
	return null;
}
	public static void showAllMenu() {
		for(Coffee c : coffeeList) {
			c.show();
		}
	}
	public static void order() {
		  System.out.println("1.아메리카노 | 2.카페라떼 | 3.헤이즐넛");
	      System.out.print("주문하실 음료를 적어주세요. >");
	      System.out.println();
	      int order = scanner.nextInt();
	      if(order == 1) {
	         orderList.add(americano);
	    	 System.out.println("아메리카노 추가됐습니다!");
	    	 System.out.println();
	      }
	      else if(order == 2) {
	         orderList.add(cafelatte);
	         System.out.println("카페라떼 추가됐습니다!");
	         System.out.println();
	      }
	      else if(order == 3) {
	         orderList.add(hazelnut);
	         System.out.println("헤이즐넛 추가됐습니다!");
	         System.out.println();
	      }
	      else {
	         System.out.println("잘못된 주문입니다. 다시 주문해주세요.");
	      }
	   }
	   
	   public static void checkOrder() {
	      int total =0;
	      System.out.println("[주문 목록]");
	      for(int i=0; i<orderList.size(); i++) {
	         System.out.println(i+1+". "+orderList.get(i).name+ " | " + orderList.get(i).price+"원");
	         total+=orderList.get(i).price;
	      }
	      System.out.println();
	      System.out.println("총 : "+total+"원 입니다.");
	   }
	
	public static void main(String[] args) {
		//객체 선언
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYul = new GoldCustomer(10040, "정약용");
		Customer customerKim = new VIPCustomer(10050, "이율곡", 12345);
		
		Coffee americano = new Americano("아메리카노", "에테오피아 예가체프", 4000 );
		Coffee cafelatte = new Cafalatte("카페라떼", "게이샤", 4500);
		Coffee hazelnut = new Hazelnutcoffee("헤이즐넛", "과테말라", 5000);
		
		//리스트에 추가
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		coffeeList.add(americano);
		coffeeList.add(cafelatte);
		coffeeList.add(hazelnut);
		
		System.out.println("==========정현님의 카페==========");

//		int input = scanner.nextInt();
		
		while(status) {
			System.out.println("1.메뉴보기 | 2.주문하기 | 3.주문목록" );
			System.out.print("필요하신 서비스 번호를 적어주세요 : ");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				showAllMenu();
				break;
			case 2:
				
				order();
				break;
			case 3:
				checkOrder();
				break;
			case 4:
				status = false;
				break;
			default:
				break;
			}
		}
		
		
		String customerName = scanner.next();
		if (customerName == "이순신") {
			
//			int price = coffee.price - (coffee.price * bonusRatio);
		}
		
	}
}
