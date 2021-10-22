package visitor;

import composite.CheckingAccount;
import composite.SavingsAccount;
import composite.StudentAccount;

public class BalanceVisitor extends Visitor {
	public BalanceVisitor() {
		
	}
    public void visit(SavingsAccount saving) {
    	 saving.checkbalance();
    }
    public void visit(StudentAccount student) {
		 student.checkbalance();
    	
    }
    public void visit(CheckingAccount checking) {
    	checking.checkbalance();
    }
	
	
}

