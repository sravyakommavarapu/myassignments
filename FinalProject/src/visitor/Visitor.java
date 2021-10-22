package visitor;

import composite.CheckingAccount;
import composite.Client;
import composite.SavingsAccount;
import composite.StudentAccount;

public abstract class Visitor implements Client{
	
   
    public abstract void visit(SavingsAccount saving);
    public abstract void visit(StudentAccount student);
    public abstract void visit(CheckingAccount checking);
    
}
