package statewithbuilder;

public class KCupPodsMachine {
	State soldOutState;
	State noMoneyState;
	State hasMoneyState;
	State soldState;
	State winnerState;
	
 
	State state = soldOutState;
	int count = 0;
 
	public KCupPodsMachine(int num) {
		soldOutState = new SoldOutState(this);
		noMoneyState = new NoMoneyState(this);
		hasMoneyState = new HasMoneyState(this);
		soldState = new SoldState(this);
		winnerState= new WinnerState(this);
		

		this.count = num;
 		if (num > 0) {
			state = noMoneyState;
		} 
	}
 
	public void insertMoney() {
		state.insertMoney();
	}
 
	public void ejectMoney() {
		state.ejectMoney();
	}
 
	public void pressOk() {
		state.pressOk();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseStarCups() {
		System.out.println("A starbucks k-cup pod comes out from the slot...");
		if (count > 0) {
			count = count - 1;
		}
	}
	void releaseCups() {
		System.out.println("A k-cup pod comes out from the slot...");
		if (count > 0) {
			count = count - 1;
		}
	}
	
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("The k-cup pod machine was just refilled; it has " + this.count + " k-cup pods now");
		state.refill();
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }
    public State getWinnerState() {
        return winnerState;
    }

   	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n--- Keurig K-Cup Pod Machine---");
		result.append("\n--- 20 different flavours   ---");
		result.append("\n--- Total: " + count + " kcuppod");
		if (count != 1) {
			result.append("s---");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}

	
	

	 
}
