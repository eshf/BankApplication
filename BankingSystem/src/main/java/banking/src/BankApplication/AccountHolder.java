package BankApplication;

public abstract class AccountHolder implements AccountInterface {
	private AccountHolder accountHolder;
	private int idNumber;
	

	double balance;


	private int pin;
	void deposit(int x) {
		//double x=0.0;
		x+=balance;
		balance=x;
	}
	


	void withdraw(int x) {
		if(balance>=x){
			x-=balance;
			balance=x;
		}
	}
	
	protected AccountHolder(AccountHolder accountHolder, int idNumber, int accountNumber, int pin, double balance) {
	
	}

	public AccountHolder(int idNumber){
	}


	public AccountHolder getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public double getBalance() {
        return this.balance;
	}
	
	public int getPin() {
		return pin;
	}



	public void setPin(int pin) {
		this.pin = pin;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
		
	



	public boolean validatePin(int attemptedPin) {
        return this.validatePin(attemptedPin);
	}

	

	public long getAccountNumber() {
        return -1L;
	}

	public void creditAccount(double amount) {
		this.creditAccount(amount);
	}



	public void setAccountNumber(long accountNumber) {
	}


}