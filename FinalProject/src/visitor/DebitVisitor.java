package visitor;

import composite.CheckingAccount;
import composite.SavingsAccount;
import composite.StudentAccount;

public class DebitVisitor extends Visitor{
	public DebitVisitor() {
		
	}
   double amount;
	@Override
	public void visit(SavingsAccount saving) {
		saving.debit(saving.amount);
		
	}

	@Override
	public void visit(StudentAccount student) {
		student.debit(student.amount);
		
	}

	@Override
	public void visit(CheckingAccount checking) {
		checking.debit(checking.amount);
	}

	
}
