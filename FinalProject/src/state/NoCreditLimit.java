package state;




public class NoCreditLimit implements State{
	CreditCard creditCard;
	 
    public NoCreditLimit(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
	
	@Override
	public void enterAmount() {
        System.out.println("you cant enter money twice");
	}

	@Override
	public void makePayment() {
		System.out.println("You exceeded your credit limit. so, you can't debit money");
	}

	@Override
	public void pressOk() {
		System.out.println("you entered money, but there you exceeded credit limit");
	}

	@Override
	public void dispense() {
		System.out.println("you need to enter money first");
	}

	@Override
	public void reset() {
		
		
	}
	public String toString() {
		return "waiting to set credit limit";
	}

}
