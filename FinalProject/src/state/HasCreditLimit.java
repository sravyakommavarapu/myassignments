package state;

import java.util.Scanner;

public class HasCreditLimit implements State{
    Scanner sc=new Scanner(System.in);
	CreditCard creditCard;
	public HasCreditLimit(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	public double amount;
  
	@Override
	public void enterAmount() {
		System.out.println("Enter money you want to pay");
		double amount=sc.nextInt();
		this.amount=amount;
	}

	@Override
	public void makePayment() {
		if (amount > creditCard.limit) {
			creditCard.setState(creditCard.getNoCreditLimit());
		} else {
			System.out.println("you have done payment");
		}
	}

	@Override
	public void pressOk() {
		System.out.println("You pressed ok..");
		
	}

	@Override
	public void dispense() {
		creditCard.releaseAmount(amount);
		if (creditCard.getCount() > 0) {
			creditCard.setState(creditCard.getPaidState());
		}
		

	}

	@Override
	public void reset() {
	}
	public String toString() {
		return "waiting to press ok";
	}

}
