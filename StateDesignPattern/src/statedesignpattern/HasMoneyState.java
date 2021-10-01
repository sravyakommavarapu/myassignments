package statedesignpattern;

public class HasMoneyState implements State {

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
		kcuppodMachine.setState(kcuppodMachine.getSoldState());
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
