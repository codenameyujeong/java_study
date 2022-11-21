package Ex.cus;

public class VIPCustomerOther extends Customer {
	//필드
		private int agentID;//상담원 id
		double saleRatio; //할인 비울
	//생성자
	public VIPCustomerOther(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}
	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + ", 담당 상담원아이디:" + agentID;
	}
	//메소드
	public int getAgentID() {
		return agentID;
	}
	
}
