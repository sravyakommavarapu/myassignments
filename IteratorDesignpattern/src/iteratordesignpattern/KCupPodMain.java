package iteratordesignpattern;

public class KCupPodMain 
{
	 public static void main(String[] args) 
	    {
	        Menu[] menu = new Menu[4];
	        menu[0] = new Menu("Hazelnut Cream, Medium roast, $5");
	        menu[1] = new Menu("Caramel Drizzle, Dark roast, $9");
	        menu[2] = new Menu("Dark Chocolate, Dark roast, $7");
	        menu[3] = new Menu("Starbucks Espresso, Light roast, $10");
	         
	        List<Menu> list = new MenuList(menu);
	         
	        Iterator<Menu> iterator = list.iterator();
	        System.out.println("=== K-CUP PODS MENU ===");
	        System.out.println("[flavour, roast type, price]");
	         
	        while(iterator.hasNext()) {
	        	Menu currentMenu = iterator.next();
	            System.out.println(currentMenu.getName());
	        
	        
	        }
	    }
	 }

