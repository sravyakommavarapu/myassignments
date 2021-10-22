package state;

public class PaidState implements State {
	CreditCard creditCard;
	 
    public PaidState(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
	@Override
	public void enterAmount() {
		System.out.println("Please wait, you have already made a payment");

	}

	@Override
	public void makePayment() {
		System.out.println("Sorry, you already pressed ok");
	}

	@Override
	public void pressOk() {
		System.out.println("Your Money has been Credited to your Account successfully");

	}

	@Override
	public void dispense() {
		System.out.println("Your Money has dispensed");

	}

	@Override
	public void reset() {
		

	}
	public String toString() {
		return "dispensing your money";
	}

}
