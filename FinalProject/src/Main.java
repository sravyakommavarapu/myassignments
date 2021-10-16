import java.util.Scanner;
import java.util.*;
import Singleton.Validation;
import Singleton.PasswordSingleton;
import Singleton.UserSingleton;
import composite.SavingsAccount;
import composite.StudentAccount;

public class Main {


public static void main(String ars[]) {
	
	System.out.println("Welcome to Online Banking service");
    Scanner input = new Scanner(System.in);
	
	Validation Valid = new Validation();
	UserSingleton User = new UserSingleton();
	PasswordSingleton Pass = new PasswordSingleton();
	System.out.println("LOG IN");
    System.out.println("Enter user Id: ");
    User.userid=input.next();
    System.out.println("Enter password:");
    Pass.password=input.next();

	if((Valid.userID == User.userID) && (Valid.pass == Pass.pass))
	{
		System.out.println("you have succesfully logged in");
	}
	else 
		System.out.println("Invalid user");
	System.out.println("What type of account do you have?\n1.Credit Account\n2.Cash Account");
	int op=input.nextInt();
	if(op==1) {
		
	}
	else
		System.out.println("1.Savings Account\n2.Student Account\n3.Salary Account");
	    int opt=input.nextInt();
	
	if(opt==1) {
     SavingsAccount Saving=new SavingsAccount();
	
	System.out.println("What do you want to perform:\n1.View Account details\n2.View Balance\n3.Deposit\n4.Withdraw\n5.Exit");
	int opt1=input.nextInt();
	if(opt1==1) {
		
	}
	else if(opt1==2) {
		Saving.checkbalance();
	}
	else if(opt1==3) {
		System.out.println("Enter amount of money you want to deposit: \n$ ");
		double amt= input.nextInt();
		Saving.credit(amt);
	}
	else if(opt1==4) {
		System.out.println("Enter amount of money you want to debit:\n$");
		double amt1= input.nextInt();
		Saving.debit(amt1);
	}
	else if(opt1==5) {
		return;
	}
	else
		System.out.println("Enter a Valid option");
	}
	else if(opt==2) {
		StudentAccount Student=new StudentAccount();
		
		System.out.println("What do you want to perform:\n1.View Account details\n2.View Balance\n3.Deposit\n4.Withdraw\n5.Exit");
		int opt1=input.nextInt();
		if(opt1==1) {
			
		}
		else if(opt1==2) {
			Student.checkbalance();
		}
		else if(opt1==3) {
			System.out.println("Enter amount of money you want to deposit: \n$ ");
			double amt= input.nextInt();
			Student.credit(amt);
			
		}
		else if(opt1==4) {
			System.out.println("Enter amount of money you want to debit:\n$");
			double amt1= input.nextInt();
			Student.debit(amt1);
		}
		else if(opt1==5) {
			return;
		}
		else
			System.out.println("Enter a Valid option");
	}
	
	
}

}
