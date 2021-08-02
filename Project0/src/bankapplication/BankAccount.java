
package bankapplication;

import java.util.Scanner; // I have imported a package to allow input from a user. 

public class BankAccount {

	public BankAccount(String custname, String custid) {
		
		customerName = custname; 
		customerId= custid; 
		
			}
		
	public static void main(String[] args) {
		BankAccount obj1 = new BankAccount("Patrick", "C001"); 
		obj1.ShowMenue(); 
	}
		
	int balance; // allow integer values from a user 
	int previousTransaction; 
	String customerName; 
	String customerId; 
	
	void deposit(int amount)
	{
		if (amount !=0)
		{
			balance= balance + amount; 
		}
	}
		void withdraw(int amount)
		{
			if (amount !=25) // initial cash in the bank
			{balance = balance - amount; 
			previousTransaction= - amount; 
			}
			}
		void getpreviousTransaction() 
		{
		if (previousTransaction >0) {
			System.out.println("Deposeted:" + previousTransaction); 
		}
		
		else if (previousTransaction < 0) {
			System.out.println("Withdraw :" + Math.abs(previousTransaction));
		}
		else 
		{
			System.out.println("No Transaction occured ");
		}
		}

	void ShowMenue() 
	{
		
		char option = '\0';		
		Scanner scanner = new Scanner(System.in); // scanner object is declared
		
		System.out.println ("Welcome to our Bank : "+ customerName); 
		System.out.println ("Your ID is :" + customerId);
		System.out.println ("\n");
		System.out.println ("A. Check balance");
		System.out.println ("B. Deposit");
		System.out.println ("C. Withdraw");
		System.out.println ("D. Previsous Transaction ");
		System.out.println ("E. Exit");

	
		do 
	{
	System.out.println ("=========================");
	System.out.println ("Enter an option");
	System.out.println ("=========================");
	option= scanner.next().charAt(0); // we are interested in getting a single character from a user  
	System.out.println ("\n");
	
	switch (option)
	{
	case 'A': 
		System.out.println("------------------------"); 
		System.out.println ("Balance = "+ balance);
		System.out.println ("------------------------");
		break; 

	case 'B': 
		System.out.println("----------------------------"); 
		System.out.println ("Enter the amount to deposit:");
		System.out.println("-----------------------------");
		int amount = scanner.nextInt();
		deposit (amount);
		System.out.println ("\n");
		break; 

	case 'C': 
		System.out.println("-------------------------"); 
		System.out.println ("Balance amount withdrawn:");
		System.out.println ("-------------------------");
		int amount2 = scanner.nextInt(); 
		withdraw(amount2);
		break; 

	case 'D': 
	System.out.println("--------------------------"); 
	getpreviousTransaction();
	System.out.println ("-------------------------");
	break; 
	
	case 'E': 
		System.out.println("Next "); 
		break; 
		default:  
			System.out.println("Invalid option !!, please enter again ");
			break; 
	}
	}while (option !='E'); 
	System.out.println("Thanks for vising us, please come again"); 
}
}