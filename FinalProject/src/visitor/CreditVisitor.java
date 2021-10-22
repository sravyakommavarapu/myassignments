package visitor;

import composite.CheckingAccount;
import composite.SavingsAccount;
import composite.StudentAccount;

public class CreditVisitor extends Visitor{
	public CreditVisitor() {
		
	}
	@Override
	public void visit(SavingsAccount saving) {
		
		saving.credit(saving.amount);
	}

	@Override
	public void visit(StudentAccount student) {
         student.credit(student.amount);
	}

	@Override
	public void visit(CheckingAccount checking) {
		checking.credit(checking.amount);
	}

}
