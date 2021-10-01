package statedesignpattern;

public class NoMoneyState implements State {

	 KCupPodsMachine kcuppodMachine;
	 
	    public NoMoneyState(KCupPodsMachine kcuppodMachine) {
	        this.kcuppodMachine = kcuppodMachine;
	    }
	@Override
	public void insertMoney() {
		System.out.println("You inserted money");
		kcuppodMachine.setState(kcuppodMachine.getHasMoneyState());
	}

	@Override
	public void ejectMoney() {
		System.out.println("You haven't inserted money");
	}

	@Override
	public void pressOk() {
		System.out.println("You pressed ok, but there's no money");

	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");

	}

	@Override
	public void refill() {

	}
	public String toString() {
		return "waiting for money";
	}

}
