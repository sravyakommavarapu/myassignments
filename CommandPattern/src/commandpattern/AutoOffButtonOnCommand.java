package commandpattern;

public class AutoOffButtonOnCommand implements Command{
	AutoOff autooff;
	  
	public AutoOffButtonOnCommand(AutoOff autooff) {
		this.autooff = autooff;
	}
 
	public void execute() {
		autooff.on();
	}
}
