package composite;

public class StudentAccount extends CashAccount {
	public void studentaccount() {
		
	}
	double balance=0;
	double amount;
	public void checkbalance()
	{
		System.out.println(balance);
	}
	public void credit(double amount)
	{
		System.out.println("you have credited $"+amount+"\nyour current balance is $"+(balance+amount));
		balance=balance+amount;
	}
	public void debit(double amount)
	{
		if(amount>balance)
		{
	         System.out.println("Insufficient balance, you can't debit");
		}
	    else
	   System.out.println("you have debited $"+amount+"\nyour current balance is $"+(balance-amount));
		balance=balance-amount;
	}
}
