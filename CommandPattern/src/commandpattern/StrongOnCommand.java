package commandpattern;

public class StrongOnCommand implements Command{
	Strong strong;
	  
	public StrongOnCommand(Strong strong) {
		this.strong = strong;
	}
 
	public void execute() {
		strong.on();
	}
}
