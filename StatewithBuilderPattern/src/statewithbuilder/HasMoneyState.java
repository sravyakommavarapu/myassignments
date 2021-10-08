package statewithbuilder;

import java.util.Random;

public class HasMoneyState implements State{
	Random randomWinner = new Random(System.currentTimeMillis());
	
 
	
	KCupPodsMachine kcuppodMachine;
	public HasMoneyState(KCupPodsMachine kcuppodMachine) {
		this.kcuppodMachine = kcuppodMachine;
	}
	@Override
	public void insertMoney() {
		System.out.println("You can't insert more money");

	}

	@Override
	public void ejectMoney() {
		System.out.println("money returned");
		kcuppodMachine.setState(kcuppodMachine.getNoMoneyState());
	}

	@Override
	public void pressOk() {
		System.out.println("You pressed ok...");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (kcuppodMachine.getCount() > 1)) {
			kcuppodMachine.setState(kcuppodMachine.getWinnerState());
		} else {
			kcuppodMachine.setState(kcuppodMachine.getSoldState());
		}
		
	}

	@Override
	public void dispense() {
        System.out.println("No k-cup pod dispensed");

	}

	@Override
	public void refill() {
	}
	
		public String toString() {
			return "waiting to press ok";
	}
}
