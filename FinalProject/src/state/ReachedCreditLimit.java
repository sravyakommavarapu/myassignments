package state;

public class ReachedCreditLimit implements State {
	CreditCard creditCard;
	 
    public ReachedCreditLimit(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
 
	@Override
	public void enterAmount() {
       System.out.println("you cant enter money, your credit limit is reached");
	}

	@Override
	public void makePayment(){
		System.out.println("you cant debit, you haven't entered money you want to debit yet");

	}

	@Override
	public void pressOk() {
		System.out.println("you pressed ok, but there is no credit limit");

	}

	@Override
	public void dispense() {
		System.out.println("no money dispensed");

	}

	@Override
	public void reset() {
		creditCard.setState(creditCard.getHasCreditLimit());

	}

}
