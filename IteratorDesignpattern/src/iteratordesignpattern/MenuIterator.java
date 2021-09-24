package iteratordesignpattern;

public class MenuIterator implements Iterator<Menu> {

	private Menu[] menu;
    private int position;
     
    public MenuIterator(Menu[] menu)
    {
        this.menu = menu;
        position = 0;
    }
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		position = 0;
	}

	@Override
	public Menu next() {
		// TODO Auto-generated method stub
		return menu[position++];
	}

	@Override
	public Menu currentItem() {
		// TODO Auto-generated method stub
		if( menu[position] != null)
			 return menu[position];;
			return null;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= menu.length)
            return false;
        return true;
	}

}
