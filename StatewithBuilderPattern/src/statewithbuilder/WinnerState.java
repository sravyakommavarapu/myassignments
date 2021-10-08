package statewithbuilder;

public class WinnerState implements State{
 
	KCupPodsMachine kcuppodMachine;
	Award.Builder giftbuilder = new Award.Builder();
	 
    public WinnerState(KCupPodsMachine kcuppodMachine) {
        this.kcuppodMachine = kcuppodMachine;
    }
	@Override
	public void insertMoney() {
		System.out.println("Please wait, we're already giving you a K-Cup Pod");
	}

	@Override
	public void ejectMoney() {
		System.out.println("Please wait, we're already giving you a K-Cup Pod");

	}

	@Override
	public void pressOk() {
		System.out.println("Pressing again doesn't get you another kcuppod!");
	}
	@Override
	public void dispense() {
		kcuppodMachine.releaseCups();
		if (kcuppodMachine.getCount() == 0) {
			kcuppodMachine.setState(kcuppodMachine.getSoldOutState());
		} else {
			kcuppodMachine.releaseStarCups();
			System.out.println("YOU'RE A WINNER! You got a Starbucks k-cup pod with cappuccino flavour as a reward for your money");
				
			Award gift= giftbuilder.name("Alex").age(25).gender("Male").phonenumber("341-786-0987").mail("alexcooper@gmail.com").address("Romeoville,Illinois"). build();
			System.out.println(gift);
			System.out.println("Here you go!!!");
			if (kcuppodMachine.getCount() > 0) {
				kcuppodMachine.setState(kcuppodMachine.getNoMoneyState());
			} else {
            	System.out.println("Oops, out of kcuppods!");
				kcuppodMachine.setState(kcuppodMachine.getSoldOutState());
			}
		}
	}

	@Override
	public void refill() {
		
	}

}
