package BankApplication;

import java.util.LinkedHashMap;


public class Bank implements BankInterface {
	private LinkedHashMap<Long, AccountHolder> accounts;

	public Bank() {

	}


	public Long openCommercialAccount(int pin, double startingDeposit) {
		return -1L;
	}

	public Long openConsumerAccount(Client client, int pin, double startingDeposit) {
        return -1L;
	}

	public boolean authenticateUser(long accountNumber, int pin) {
        return true;
	}

	public double getBalance(long accountNumber) {
        return this.getBalance(accountNumber);
	}

	public void credit(long accountNumber, double amount) {
	
	}

	public boolean debit(long accountNumber, double amount) {
        return true;
	}

	@Override
	public Long openClientAccount(Client client, int pin, double startingDeposit) {
		// TODO Auto-generated method stub
		return null;
	}


	public LinkedHashMap<Long, AccountHolder> getAccounts() {
		return accounts;
	}


	public void setAccounts(LinkedHashMap<Long, AccountHolder> accounts) {
		this.accounts = accounts;
	}
}
