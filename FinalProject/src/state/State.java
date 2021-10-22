package state;

public interface State {
	
	public void enterAmount();
	public void makePayment();
	public void pressOk();
	public void dispense();
	public void reset();
}
