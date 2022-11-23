package test.ch10.makeExeption;

import test.ch10.InsuffException;

public class Account {
	//필드
	private long balance; //잔고
	//생성자
	public Account() {}
	//메소드
	public long getBalance() {
		return balance;
	}
	//예금
	public void deposit(int money) {
		balance += money; //잔고에 돈을 누적합산
	}
	//출금
	public void withdraw (int money) throws InsuffException {
		//잔고보다 내가 출금하려는 돈이 더 크면 예외를 발생시킴
		if (balance < money) {
			throw  new InsuffException("잔고부족:" + (money - balance) + "원이 모자람");	
		}
		balance -= money;//잔고에서 출금하려는 돈을 뺴줌
	}	
}
