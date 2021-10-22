package Unused;

import java.util.Scanner;

import Main.Constants;
import composite.CheckingAccount;
import composite.MasterAccount;
import composite.SavingsAccount;
import composite.StudentAccount;
import composite.VisaAccount;
import singleton.PasswordSingleton;
import singleton.UserSingleton;
import singleton.Validation;
import visitor.BalanceVisitor;
import visitor.CreditVisitor;
import visitor.DebitVisitor;

public class Controller {

	public static void Controller(Scanner input) {

		System.out.println("Welcome to Online Banking service");
		// Scanner input = new Scanner(System.in);

		// Validating User using Singleton Pattern
		Validation Valid = new Validation();
		UserSingleton User = new UserSingleton();
		PasswordSingleton Pass = new PasswordSingleton();
		System.out.println("LOG IN");
		System.out.println("Enter user Id: ");
		String userid = input.next();
		System.out.println("Enter password:");
		String password = input.next();

		if (Valid.userID.equalsIgnoreCase(userid) && Valid.pass.equalsIgnoreCase(password)) {
			System.out.println("you have succesfully logged in");
		} else {
			System.out.println("Invalid user");
			return;
		}

		// Initializing Credit/Debit Accounts
		CheckingAccount Checking = new CheckingAccount(Constants.checkingBalance, Constants.checkingAccountNumber);
		SavingsAccount Saving = new SavingsAccount(Constants.savingsBalance, Constants.savingsAccountNumber);
		StudentAccount Student = new StudentAccount(Constants.studentBalance, Constants.studentAccountNumber);

		MasterAccount master = new MasterAccount(Constants.mastercardCreditLimit, Constants.masterBalance,
				Constants.masterMonthlyDue, Constants.masterCardNumber);
		VisaAccount visa = new VisaAccount(Constants.visaCreditLimit, Constants.visaBalance, Constants.visaMonthlyDue,
				Constants.visaCardNumber);

		// Finding more on User's request and providing options
		System.out.println("What type of account do you have?\n1.Credit Account\n2.Cash Account");
		int op = input.nextInt();
		if (op == 1) {
			System.out.println("1.Visa Account\n2.Mastercard Account");
			int creditoption = input.nextInt();
			if (creditoption == 1) {
				System.out.println(
						"What do you want to perform:\n1.View Account details\n2.Current Balance\n3.Monthly Due\n4.Available Credit\n5.Make Payment\n6.Withdraw\n7.Exit\n");
				int creditop = input.nextInt();
				if (creditop == 1) {
					visa.accountdetails();
				} else if (creditop == 2) {
					visa.checkbalance();
				} else if (creditop == 3) {
					visa.viewMonthlyDue();
				} else if (creditop == 4) {
					visa.viewAvailableCredit();
				} else if (creditop == 5) {
					visa.makePayment();
				} else if (creditop == 6) {
					visa.withdraw();
				} else if (creditop == 7) {
					return;
				}
			} else if (creditoption == 2) {
				System.out.println(
						"What do you want to perform:\n1.View Account details\n2.Current Balance\n3.Monthly Due\n4.Available Credit\n5.Make Payment\n6.Withdraw\n7.Exit\n");
				int creditop1 = input.nextInt();
				if (creditop1 == 1) {
					master.accountdetails();
				} else if (creditop1 == 2) {
					master.checkbalance();
				} else if (creditop1 == 3) {
					master.viewMonthlyDue();
				} else if (creditop1 == 4) {
					master.viewAvailableCredit();
				} else if (creditop1 == 5) {
					master.makePayment();
				} else if (creditop1 == 6) {
					master.withdraw();
				} else if (creditop1 == 7) {
					return;
				}
			}
		} else
			System.out.println("1.Savings Account\n2.Student Account\n3.Checking Account");
		int opt = input.nextInt();

		if (opt == 1) {

			System.out.println(
					"What do you want to perform:\n1.View Account details\n2.View Balance\n3.Deposit\n4.Withdraw\n5.Exit");
			int opt1 = input.nextInt();
			if (opt1 == 1) {
				Saving.accountdetails();
			} else if (opt1 == 2) {
				BalanceVisitor balancevisitor = new BalanceVisitor();
				Saving.accept(balancevisitor);
			} else if (opt1 == 3) {
				System.out.println("Enter amount of money you want to deposit: \n$ ");
				double amt = input.nextInt();
				Saving.setAmount(amt);
				CreditVisitor creditvisitor = new CreditVisitor();
				Saving.accept(creditvisitor);
			} else if (opt1 == 4) {
				System.out.println("Enter amount of money you want to debit:\n$");
				double amt1 = input.nextInt();
				Saving.setAmount(amt1);
				DebitVisitor debitvisitor = new DebitVisitor();
				Saving.accept(debitvisitor);
			} else if (opt1 == 5) {
				return;
			} else
				System.out.println("Enter a Valid option");
		} else if (opt == 2) {

			System.out.println(
					"What do you want to perform:\n1.View Account details\n2.View Balance\n3.Deposit\n4.Withdraw\n5.Exit");
			int opt1 = input.nextInt();
			if (opt1 == 1) {
				Student.accountdetails();
			} else if (opt1 == 2) {
				BalanceVisitor balancevisitor = new BalanceVisitor();
				Student.accept(balancevisitor);
			} else if (opt1 == 3) {
				System.out.println("Enter amount of money you want to deposit: \n$ ");
				double amt = input.nextInt();
				Student.setAmount(amt);
				CreditVisitor creditvisitor = new CreditVisitor();
				Student.accept(creditvisitor);
			} else if (opt1 == 4) {
				System.out.println("Enter amount of money you want to debit:\n$");
				double amt1 = input.nextInt();
				Student.setAmount(amt1);
				DebitVisitor debitvisitor = new DebitVisitor();
				Student.accept(debitvisitor);
			} else if (opt1 == 5) {
				return;
			} else
				System.out.println("Enter a Valid option");
		} else if (opt == 3) {

			System.out.println(
					"What do you want to perform:\n1.View Account details\n2.View Balance\n3.Deposit\n4.Withdraw\n5.Exit");
			int opt3 = input.nextInt();
			if (opt3 == 1) {
				Checking.accountdetails();
			} else if (opt3 == 2) {
				BalanceVisitor balancevisitor = new BalanceVisitor();
				Checking.accept(balancevisitor);
			} else if (opt3 == 3) {
				System.out.println("Enter amount of money you want to deposit: \n$ ");
				double amt = input.nextInt();
				Checking.setAmount(amt);
				CreditVisitor creditvisitor = new CreditVisitor();
				Checking.accept(creditvisitor);
			} else if (opt3 == 4) {
				System.out.println("Enter amount of money you want to debit:\n$");
				double amt1 = input.nextInt();
				Checking.setAmount(amt1);
				DebitVisitor debitvisitor = new DebitVisitor();
				Checking.accept(debitvisitor);
			} else if (opt3 == 5) {
				return;
			} else
				System.out.println("Enter a Valid option");
		}

	}

}
