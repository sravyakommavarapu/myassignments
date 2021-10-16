package state;

public class HasCreditLimit implements State{
   
	CreditCard creditCard;
	public HasCreditLimit(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
  
	@Override
	public void enterAmount() {
		System.out.println("please enter amount you want to debit");
		
	}

	@Override
	public void debitAmount() {
		System.out.println("you have debited your amount");
		
		
	}

	@Override
	public void pressOk() {
		System.out.println("You pressed ok..");
		creditCard.setState(creditCard.getSoldState());
	}

	@Override
	public void dispense() {
		 System.out.println("No money debited");
		
	}

	@Override
	public void reset() {
		
		
	}
	public String toString() {
		return "waiting to press ok";
	}

}
