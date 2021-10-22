package state;

public class CreditCard {
	State reachedCreditLimit;
	State hasCreditLimit;
	State noCreditLimit;
	State paidState;

	State state;
	double number;
	double limit;

	public CreditCard(double limit) {
		reachedCreditLimit = new ReachedCreditLimit(this);
		noCreditLimit = new NoCreditLimit(this);
		hasCreditLimit = new HasCreditLimit(this);
		paidState = new PaidState(this);

		this.number = limit;
		if (limit > 0) {
			state = hasCreditLimit;
		} else {
			state = reachedCreditLimit;
		}
	}

	public void enterAmount() {
		state.enterAmount();
	}

	public void makePayment() {
		state.makePayment();
	}

	public void pressOk() {
		state.dispense();
		state.pressOk();
	}

	void releaseAmount(double amount) {
		if (number > 0) {
			number = number - amount;
			System.out.println("Amount paid \nAvailable credit in your account is " + number);
		}
	}

	double getCount() {
		return number;
	}

	void reset(double count) {
		this.number += count;
		System.out.println("The credit amount is set and its new credit limit is: " + this.number);
		state.reset();
	}

	void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public State getReachedCreditLimit() {
		return reachedCreditLimit;
	}

	public State getNoCreditLimit() {
		return noCreditLimit;
	}

	public State getHasCreditLimit() {
		return hasCreditLimit;
	}

	public State getPaidState() {
		return paidState;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nCredit card withdrawl");
		result.append("\nYour current credit limit is " + number + " $");
		result.append("\nCredit Card is " + state + "\n");
		return result.toString();
	}

}
