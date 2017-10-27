//package driver_proj0.java;
import java.util.Date;
public class Account {
	
	public static void main(String[] args) {

		 private int id;
		   private double balance;
		   private double annualInterestRate;
		   private Date date = new Date();


		   Account()
		   {
		      id = 0;
		      balance = 0.0;
		      annualInterestRate = 0.0;
		   }

		   Account(int newId, double bal)
		   {
		      id = newId;
		      balance = bal;
		   }

		   public void setId(int newId)
		   {
		      id = newId;
		   }

		   public void setBalance( double bal)
		   {
		      balance = bal;
		   }

		   public void setAnnualInterestRate(double annualRate)
		   {
		      annualInterestRate = annualRate;
		   }       

		   public int getId()
		   { 
		      return id;
		   }

		   public double getBalance()
		   {
		      return balance;
		   }

		   public double getAnnualInterestRate()
		   {
		      return annualInterestRate;
		   }         


		   /*public void setDate(Date n)
		   {
		      dateCreated = n;
		   }*/

		   public java.util.Date getDate()
		   {
		      return date;
		   }   

		   double getMonthlyInterestRate()
		   {
		      return annualInterestRate/12;
		   }

		   double withdraw(double amount)
		   {
		      return balance -= amount;
		   }

		   double deposit(double amount)
		   {
		      return balance += amount;
	}

}
