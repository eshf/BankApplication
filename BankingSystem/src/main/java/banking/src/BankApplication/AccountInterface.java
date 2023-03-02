package BankApplication;


 public interface AccountInterface {




	public boolean validatePin(int attemptedPin);

	public double getBalance();


	public long getAccountNumber();


	public void creditAccount(double amount);

	public boolean debitAccount(double amount);
	


}
