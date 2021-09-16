package commandpattern;

public class PowerOffCommand implements Command {
	Power power;
	  
	public PowerOffCommand(Power power) {
		this.power = power;
	}
 
	public void execute() {
		power.on();
	}

}
