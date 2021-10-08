package statewithbuilder;


public class SoldOutState implements State {
	KCupPodsMachine kcuppodMachine;
	 
    public SoldOutState(KCupPodsMachine kcuppodMachine) {
        this.kcuppodMachine = kcuppodMachine;
    }

	@Override
	public void insertMoney() {
		System.out.println("You can't insert money, the machine is sold out");

	}

	@Override
	public void ejectMoney() {
		System.out.println("You can't eject, you haven't inserted money yet");	}

	@Override
	public void pressOk() {
		System.out.println("You pressed ok, but there are no k-cup pods");

	}

	@Override
	public void dispense() {
		System.out.println("No k-cup pod dispensed");


	}

	@Override
	public void refill() {
		kcuppodMachine.setState(kcuppodMachine.getNoMoneyState());

	}

}
