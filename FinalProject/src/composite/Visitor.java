package composite;

public abstract class Visitor implements Client{
	SavingsAccount Savings = new SavingsAccount();
    public Visitor() {
	}
    public abstract void visit(Savings){
    	
    }
}
