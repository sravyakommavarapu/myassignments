package statedesignpattern;

public class SoldState implements State {
	KCupPodsMachine kcuppodMachine;
	 
    public SoldState(KCupPodsMachine kcuppodMachine) {
        this.kcuppodMachine = kcuppodMachine;
    }

	@Override
	public void insertMoney() {
		System.out.println("Please wait, we're already giving you a k-cup pod");

	}

	@Override
	public void ejectMoney() {
		System.out.println("Sorry, you already pressed ok");

	}

	@Override
	public void pressOk() {
		System.out.println("pressing ok twice doesn't get you another k-cup pod!");

	}

	@Override
	public void dispense() {
		kcuppodMachine.releaseCups();
		if (kcuppodMachine.getCount() > 0) {
			kcuppodMachine.setState(kcuppodMachine.getNoMoneyState());
		} else {
			System.out.println("Oops, out of k-cup pods!");
			kcuppodMachine.setState(kcuppodMachine.getSoldOutState());
		}
	}

	@Override
	public void refill() {

	}
	public String toString() {
		return "dispensing a kcuppod";
	}

}
