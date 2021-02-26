package programs;

public class BalanceAccount {
	private double balance;
	
	public BalanceAccount() {
		this.balance = 0;
	}

	public BalanceAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double money) {
		this.balance -= money;
	}

	public void deposit(double money) {
		this.balance += money;
	}

}
