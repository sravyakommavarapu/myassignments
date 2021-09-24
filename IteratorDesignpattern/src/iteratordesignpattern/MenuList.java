package iteratordesignpattern;

public class MenuList implements List<Menu> {
	  private Menu[] menu;
	     
	    public MenuList(Menu[] menu)
	    {
	        this.menu = menu;
	    }
	     
	    @Override
	    public Iterator<Menu> iterator() {
	        return new MenuIterator(menu);
	    }
}

