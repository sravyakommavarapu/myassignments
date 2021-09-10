package factorydesignpattern;

public class KeurigKCupPodStore extends KCupPodStore
	{
		 
		protected KCupPod createKCupPod(String item) 
		{
			KCupPod kcuppod = null;
			KCupPodFactory kcpFactory = 
				new KeurigKCupPodFactory();
	 
			if (item.equals("box")) {
	  
				kcuppod = new BoxKCupPod(kcpFactory);
				kcuppod.setName("keurig's box KCupPods");
	  
			} else if (item.equals("cups")) {
	 
				kcuppod = new CupsKCupPod(kcpFactory);
				kcuppod.setName("keurig's cup KCupPods");
	 
			} else if (item.equals("flavour")) {
	 
				kcuppod = new FlavourKCupPod(kcpFactory);
				kcuppod.setName("keurig's flavoured KCupPods");
	 
			} else if (item.equals("roast")) {

				kcuppod = new RoastKCupPod(kcpFactory);
				kcuppod.setName("keurig's roasted KCupPods");
	 
			} 
			return kcuppod;
		
	}
}
	

