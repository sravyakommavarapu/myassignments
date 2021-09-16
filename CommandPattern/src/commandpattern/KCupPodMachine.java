package commandpattern;

public class KCupPodMachine {
	public static void main(String[] args) {
		Machine machine = new Machine();
		Power power = new Power();
		AutoOff autooff = new AutoOff();
		CupSelect cupselect=new CupSelect();
		AddWater addwater = new AddWater();
		Strong strong = new Strong();
		PowerOnCommand powerOn = new PowerOnCommand(power);
		AutoOffButtonOnCommand autooffOn = new AutoOffButtonOnCommand(autooff); 
		CupSelectSmallCommand cupsmall = new CupSelectSmallCommand(cupselect);
		AddWaterOnCommand wateron = 
		    new AddWaterOnCommand(addwater);
		StrongOnCommand strongon = new StrongOnCommand(strong);

 
		machine.setCommand(powerOn);
		machine.buttonWasPressed();
		machine.setCommand(autooffOn);
		machine.buttonWasPressed();
		machine.setCommand(cupsmall);
		machine.buttonWasPressed();
		machine.setCommand(strongon);
		machine.buttonWasPressed();
		machine.setCommand(wateron);
		machine.buttonWasPressed();
		
		
		
    }
}
