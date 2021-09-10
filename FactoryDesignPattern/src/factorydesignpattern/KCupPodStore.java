package factorydesignpattern;

public abstract class KCupPodStore
{
	
	 
		protected abstract KCupPod createKCupPod(String item);
	 
		public KCupPod orderKCupPod(String type)
		{
			KCupPod kcuppod = createKCupPod(type);
			System.out.println("--- Making a " + kcuppod.getName() + " ---");
			kcuppod.prepare();
			kcuppod.set();
			kcuppod.fill();
			kcuppod.pack();
			return kcuppod;
		}
	
}
