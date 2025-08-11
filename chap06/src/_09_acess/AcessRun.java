package _09_acess;

import _10_bank.Bank;

public class AcessRun {

	public static void main(String[] args) {
		Acess ac = new Acess();
		
		// ac.num = 5;	접근 불가
		ac.setNum(5);
		System.out.println(ac.getNum());
		
		int num = ac.getNum();
		
		Bank bank = new Bank();
		bank.deposit(5000);
		bank.withdraw(3000);
		System.out.println(bank.getBalnace());
	}

}
