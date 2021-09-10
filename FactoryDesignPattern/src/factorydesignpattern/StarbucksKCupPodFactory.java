package factorydesignpattern;

public class StarbucksKCupPodFactory implements KCupPodFactory {

	@Override
	public Box createBox() {
		
		return new LargeBox();
	}

	@Override
	public Cups createCups() {
		
		return new ReusableCups();
	}

	@Override
	public Flavour createFlavour() {
		
		return new Chocolateflavour();
	}

	@Override
	public Roast createRoast() {
		
		return new MediumRoast();
	}

}
