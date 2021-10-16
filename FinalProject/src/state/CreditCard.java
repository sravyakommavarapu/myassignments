package state;

public class CreditCard {
	State reachedCreditLimit;
	State hasCreditLimit;
	State noCreditLimit;
	State debitedState;
 
	State state;
	int count = 0;
 
	public CreditCard(double amount) {
		reachedCreditLimit = new ReachedCreditLimit(this);
		noCreditLimit = new NoCreditLimit(this);
		hasCreditLimit = new HasCreditLimit(this);
		debitedState = new DebitedState(this);

		this.count = amount;
 		if (amount > 0) {
			state = hasCreditLimit;
		} else {
			state = debitedState;
		}
	}
 
	public void enterAmount() {
		state.enterAmount();
	}
 
	public void debitAmount() {
		state.debitAmount();
	}
 
	public void pressOk() {
		state.pressOk();
		state.dispense();
	}
 
	void releaseAmount() {
		System.out.println("you amount is ready to take");
		if (count > 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void reset(double count) {
		this.count += count;
		System.out.println("The credit amount is set and its new credit limit is: " + this.count);
		state.reset();
	}

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getReachedCreditLimit() {
        return debitedState;
    }

    public State getNoCreditLimit() {
        return noCreditLimit;
    }

    public State getHasCreditLimit() {
        return hasCreditLimit;
    }

    public State getdebitedState() {
        return debitedState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		
		result.append("Credit Card has " + state + "\n");
		return result.toString();
	}
}
