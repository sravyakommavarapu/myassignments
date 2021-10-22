package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import composite.SavingsAccount;
import visitor.DebitVisitor;
import visitor.Visitor;

public class UnitTest2 {

	@Test
	public void test() {
		SavingsAccount saving= new SavingsAccount(4000, null);
		double output=saving.balance;
		assertEquals(4000,output);
	}

}
