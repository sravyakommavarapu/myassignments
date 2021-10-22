package composite;

import state.CreditCard;

public class MasterAccount extends CreditAccount {
	private double creditLimit;
	private double balance;
	private double monthlyDue;
	private String cardNumber;

	public MasterAccount(double userCreditLimit, double userBalance, double userMonthlyDue, String userCardNumber) {
		creditLimit = userCreditLimit;
		cardNumber = userCardNumber;
		balance = userBalance;
		monthlyDue = userMonthlyDue;
	}

	public void accountdetails() {
		System.out.println("Type of Account: Visa Account");
		System.out.println("Account number:" + cardNumber);
		System.out.println("Account Balance: $" + creditLimit);
	}
	
	public void checkbalance() {
		System.out.println(balance);
	}

	public void viewMonthlyDue() {
		System.out.println(monthlyDue);
	}
	
	public void viewAvailableCredit() {
		System.out.println(creditLimit-balance);
	}
	
	public void makePayment() {
		CreditCard creditCard= new CreditCard(balance); 
		creditCard.enterAmount();
		creditCard.pressOk();
	}
	public void withdraw() {
		CreditCard creditCard= new CreditCard(creditLimit-balance);
		creditCard.enterAmount();
		creditCard.pressOk();
	}
}
