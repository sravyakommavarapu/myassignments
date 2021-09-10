package factorydesignpattern;

public interface KCupPodFactory {
	public Box createBox();
	public Cups createCups();
	public Flavour createFlavour();
    public Roast createRoast();
}
