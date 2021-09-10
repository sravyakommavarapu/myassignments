package factorydesignpattern;

public class KCupPodTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				KCupPodStore KeurigStore = new KeurigKCupPodStore();
				KCupPodStore StarbucksStore = new StarbucksKCupPodStore();
		 
				KCupPod kcuppod = KeurigStore.orderKCupPod("box");
				System.out.println("Bancy ordered a " + kcuppod + "\n");
		 
				kcuppod = StarbucksStore.orderKCupPod("box");
				System.out.println("Joel ordered a " + kcuppod + "\n");

				kcuppod = KeurigStore.orderKCupPod("cups");
				System.out.println("Bancy ordered a " + kcuppod + "\n");
		 
				kcuppod = StarbucksStore.orderKCupPod("cups");
				System.out.println("Joel ordered a " + kcuppod + "\n");

				kcuppod = KeurigStore.orderKCupPod("flavour");
				System.out.println("Bancy ordered a " + kcuppod + "\n");
		 
				kcuppod = StarbucksStore.orderKCupPod("flavour");
				System.out.println("Joel ordered a " + kcuppod + "\n");

				kcuppod = KeurigStore.orderKCupPod("roast");
				System.out.println("Bancy ordered a " + kcuppod + "\n");
		 
				kcuppod = StarbucksStore.orderKCupPod("roast");
				System.out.println("Joel ordered a " + kcuppod + "\n");

	}

}
