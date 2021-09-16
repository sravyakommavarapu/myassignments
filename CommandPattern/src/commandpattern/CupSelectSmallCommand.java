package commandpattern;

public class CupSelectSmallCommand implements Command {
	CupSelect cupSelect;

	public CupSelectSmallCommand(CupSelect cupSelect) {
		this.cupSelect = cupSelect;
	}

	public void execute() {
		cupSelect.small();
	}
}
