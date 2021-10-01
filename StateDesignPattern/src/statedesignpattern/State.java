package statedesignpattern;

public interface State {
	public void insertMoney();
	public void ejectMoney();
	public void pressOk();
	public void dispense();
	public void refill();
}
