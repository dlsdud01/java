package _10_bank;

public class Bank {
	public int balance;
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if(money >= balance) {
			System.out.println("잔액이 부족합니다.");
		} else {
			balance -= money;
		}
	}
	
	public int getBalnace() {
		return balance;
	}
}
