package commandpattern;

public class AddWaterOnCommand implements Command{
	AddWater addWater;

	public AddWaterOnCommand(AddWater addWater) {
		this.addWater = addWater;
	}

	public void execute() {
		addWater.on();
	}
}
