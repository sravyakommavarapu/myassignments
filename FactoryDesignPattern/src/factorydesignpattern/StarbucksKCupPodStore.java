package factorydesignpattern;

public class StarbucksKCupPodStore extends KCupPodStore {

	
	protected KCupPod createKCupPod(String item) {
		
		KCupPod kcuppod = null;
		KCupPodFactory kcpFactory = 
				new StarbucksKCupPodFactory();

		if (item.equals("box")) {

			kcuppod = new BoxKCupPod(kcpFactory);
			kcuppod.setName("Starbucks Box K-Cup Pods");

		} else if (item.equals("cups")) {

			kcuppod = new CupsKCupPod(kcpFactory);
			kcuppod.setName("Starbucks Cups K-Cup Pods");

		} else if (item.equals("flavour")) {

			kcuppod = new FlavourKCupPod(kcpFactory);
			kcuppod.setName("Starbucks Flavoured K-Cup Pods");

		} else if (item.equals("roast")) {

			kcuppod = new RoastKCupPod(kcpFactory);
			kcuppod.setName("Starbucks Roasted nuts K-Cup Pods");

		}
		return kcuppod;
	}

}
