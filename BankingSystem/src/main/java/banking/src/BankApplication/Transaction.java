package BankApplication;


public class Transaction {
	private Long accountNumber;
	private Bank bank;

	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
	}

	public double getBalance() {
        return -1;
	}

	public void credit(double amount) {
	}

	public boolean debit(double amount) {
        return true;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
}
