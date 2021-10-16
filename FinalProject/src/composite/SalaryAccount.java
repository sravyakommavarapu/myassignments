package composite;

public class SalaryAccount extends CashAccount{
     public void salaryaccount() {
	 
 }
     double balance=0;
     double amount;
     void checkbalance()
     {
     	System.out.println(balance);
     }
     void credit(double amount)
     {
    		System.out.println("you have credited $"+amount+"\nyour current balance is $"+(balance+amount));
     }
     void debit(double amount)
     {
    	 if(amount>balance)
    		{
    	         System.out.println("Insufficient balance, you can't debit");
    		}
    	 else
    	   System.out.println("you have debited $"+amount+"\nyour current balance is $"+(balance-amount));

     }
}
