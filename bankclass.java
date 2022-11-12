package oopsconcept;
import java.io.*;
public class bankclass {

	//Display current balance in account
	public static void displayBalance(int balance)
	{
		System.out.println("Current Balance is: " +balance);
		System.out.println();
	}
	
	//Withdraw amount and update the balance
	public static int amountWithdrawl(int balance,int withdrawAmount)
	{
		System.out.println("withdraw operation:");
		System.out.println("withdraw amount: "+withdrawAmount);
		
		if(balance>=withdrawAmount) 
		{
			
			balance=balance-withdrawAmount;
			System.out.println("Please collect your card and amount");
			displayBalance(balance);
			}
		else {
			System.out.println("Insufficient balance");
			System.out.println();
		}
		return balance;
	}
	
	//Deposit amount and update the balance
	public static int amountDepositing(int balance,int depositAmount)
	{   
		System.out.println("Total balance is:" +balance);
		System.out.println("Deposit Operation:");
		System.out.println("Depositing Amount:" +depositAmount);
		balance=balance+depositAmount;
		System.out.println("Your money has been successfully Deposited");
		displayBalance(balance);
		return balance;
	}
	public static void main(String []args)
	{
		int balance=10000;
		int withdrawAmount=5000;
		int depositAmount=5000;
		
		//Display balance
		balance=amountDepositing(balance,depositAmount);
	}
}
