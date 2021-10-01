package statedesignpattern;

public class KCupPodMachineTesting {

public static void main(String[] args) {
		KCupPodsMachine kcuppodMachine = new KCupPodsMachine(2);

		System.out.println(kcuppodMachine);

		kcuppodMachine.insertMoney();
		kcuppodMachine.pressOk();
		kcuppodMachine.insertMoney();
		kcuppodMachine.pressOk();
		kcuppodMachine.insertMoney();
		kcuppodMachine.pressOk();
		kcuppodMachine.refill(7);	

		System.out.println(kcuppodMachine);

		kcuppodMachine.insertMoney();
		kcuppodMachine.pressOk();
		kcuppodMachine.insertMoney();
		kcuppodMachine.pressOk();
		

		System.out.println(kcuppodMachine);
	}
}
