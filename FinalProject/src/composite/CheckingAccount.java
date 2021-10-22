package composite;

import visitor.Visitor;

public class CheckingAccount extends CashAccount{

	public double balance;
	private String accountNumber;
	public double amount;
	
	public CheckingAccount(double userBalance, String userAccountNumber) {
		balance = userBalance;
		accountNumber = userAccountNumber;
	}
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void accountdetails() {
		System.out.println("Type of Account: Checking Account");
		System.out.println("Account number:" + accountNumber);
		System.out.println("Account Balance: $"+balance);
	}

	public void checkbalance() {
		System.out.println(balance);
	}

	public void credit(double amount) {
		System.out.println("you have credited $" + amount + "\nyour current balance is $" + (balance + amount));
		balance = balance + amount;
	}

	public void debit(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient balance, you can't debit");
		} else
			System.out.println("you have debited $" + amount + "\nyour current balance is $" + (balance - amount));
		balance = balance - amount;
	}
}
