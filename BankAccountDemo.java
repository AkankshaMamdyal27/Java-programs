/*
PROGRAM 2
implement a bank account class showing method overloading with methods for deposite, withdrawal, and balance inquiry.
use method overloading to handle diffrent types of transaction.
*/


class BankAccount
{
	double bal;
	// Constructor
	BankAccount(double bal) 
	{
        bal = bal;
	}
	void deposit(double amount) // Method for deposit
	{
        bal += amount;
        System.out.println("Deposited the money: " + amount);
    }
	public void getBal()  // Method for balance inquiry
	{
        System.out.println("Balance: " + bal);
    }
	public void withdraw(double amount) // Overloaded method for withdrawal without fees
	{
        if (bal >= amount) 
		{
            bal -= amount;
            System.out.println("Withdrawn the money: " + amount);
        } else 
		{
            System.out.println("Insufficient funds!");
        }
	}
}
class FeeAccount extends BankAccount {
	double withdrawalFee;

    // creating parameterized constructor
    FeeAccount(double Bal, double fee) {
        super(Bal);
        withdrawalFee = fee;
    }

    // Overloaded method for withdrawal with fees
    public void withdraw(double amount) 
	{
        double totalAmount = amount + withdrawalFee;
        if (bal >= totalAmount) 
		{
            bal -= totalAmount;
            System.out.println("Withdrawn: $" + amount + " with fee: $" + withdrawalFee);
        } else 
		{
            System.out.println("Insufficient funds!");//printing
        }
    }
}
class BankAccountDemo
{
	public static void main(String args[])
	{
        BankAccount account1 = new BankAccount(5000);
		
		account1.deposit(1000);
        account1.withdraw(500);
        account1.getBal();

        FeeAccount account2 = new FeeAccount(1000, 10);
        account2.deposit(450);
        account2.withdraw(200);
        account2.getBal();
	}
}