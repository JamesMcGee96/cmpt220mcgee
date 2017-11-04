package driver_proj0.java;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account1 = new Account();
		SavingsAccount account2 = new SavingsAccount();
		CheckingsAccount account3= new CheckingsAccount();
		
		account1.deposit(5000);
		account1.withdraw(4500);
		
		System.out.println("Account ID: " +account1.getId());
		System.out.println("Balance: " +account1.getBalance());
		System.out.println("Monthly interest rate: " +account1.getMonthlyInterestRate());
		System.out.println("Date created: " +account1.getDate());
		System.out.println("toString: " +account1.toString());
		System.out.println("toString: " +account2.toString());
		System.out.println("toString: " +account3.toString());
	}
}

