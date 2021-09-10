package factorydesignpattern;

public class CupsKCupPod extends KCupPod {

	KCupPodFactory kcpFactory;
	 
	public CupsKCupPod(KCupPodFactory kcpFactory) {
		this.kcpFactory = kcpFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		box = kcpFactory.createBox();
		cups = kcpFactory.createCups();
		flavour = kcpFactory.createFlavour();
		roast = kcpFactory.createRoast();
	}
}
