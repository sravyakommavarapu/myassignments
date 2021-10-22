package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import state.CreditCard;
import state.State;

public class UnitTest1 {

	@Test
	public void test1() {
		CreditCard creditcardtest = new CreditCard(500);
		State output = creditcardtest.getHasCreditLimit();
		assertEquals(creditcardtest.getState(), output);
	}

}
