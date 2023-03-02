package BankApplication;


public interface BankInterface {


	public Long openClientAccount(Client client, int pin, double startingDeposit);


	public boolean authenticateUser(long accountNumber, int pin);


	public double getBalance(long accountNumber);

	public void credit(long accountNumber, double amount);

	public boolean debit(long accountNumber, double amount);
}
