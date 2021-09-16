package commandpattern;

public class Machine {
	Command slot;
	 
	public Machine() {}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public void buttonWasPressed() {
		slot.execute();
	}
}
