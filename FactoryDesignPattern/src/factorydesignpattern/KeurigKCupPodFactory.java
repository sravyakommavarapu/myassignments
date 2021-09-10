package factorydesignpattern;

public class KeurigKCupPodFactory implements KCupPodFactory {

	@Override
	public Box createBox() {
		// TODO Auto-generated method stub
		return new SmallBox();
	}

	@Override
	public Cups createCups() {
		// TODO Auto-generated method stub
		return new PlasticCups();
	}

	@Override
	public Flavour createFlavour() {
		// TODO Auto-generated method stub
		return new CoffeeFlavour();
	}

	@Override
	public Roast createRoast() {
		// TODO Auto-generated method stub
		return new DarkRoast();
	}

}
