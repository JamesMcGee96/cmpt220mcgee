package driver_proj0.java;
import java.util.Date;

//uml
//Account

//-id: int
//-balance: double
//-annualInterestrate: double

//-dateCreated: String
//+Account()
//+setDate()
//+getDate()
//+getId()                                        
//+setBalance()
//+getBalance()
//+deposit(amount)
//+withdraw(amount)
//+setAnnualinterestrate()
//+getAnnualinterestrate()
//+getMonthlyinterestrate()

public class Account113 {


		  private int number;
		  private double balance;
		  private double annualInterestRate;
		  
		  private Date dateCreated = new java.util.Date();
		  
		  public Account () {
			  java.util.Date dateCreated = new java.util.Date();
		  }
		  
		  public Account (int id, double bal, double AIRate) {
			  number = id;
			  balance = bal;
			  annualInterestRate = AIRate;
			  }
		  
		public setdate(java.util.Date dateCreated) {
			this.dateCreated = dateCreated;
		}
		
		public java.util.Date getdate1() {
			return dateCreated;
		}
		
		public java.util.Date getdate() {
			return this.dateCreated = dateCreated;
		}
		
		public int getId() {
			return number;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public double deposit(double deposit) {
			balance += deposit;
			return(deposit);
		}
		
		public double withdraw(double withdraw) {
			this.balance -= withdraw;
			return(withdraw);
		}
		
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}
		
		public void setAnnualInterestRate(double annualInterestrate) {
			this.annualInterestRate = annualInterestRate;
		}
		
	public double getMonthlyInterestRate() {
	double monthlyInterest = (annualInterestRate / 1200) * balance;	
	return monthlyInterest;
	}

}
