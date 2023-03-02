package BankApplication;

import java.util.List;


public class ClientAccount  {
	private List<Client> authorizedUsers;

	public ClientAccount(Long accountNumber, int pin, double startingDeposit) {
	}


	protected void addAuthorizedUser(Client client) {
		
	}


	public boolean isAuthorizedUser(Client client) {
        return true;
	}


	public List<Client> getAuthorizedUsers() {
		return authorizedUsers;
	}


	public void setAuthorizedUsers(List<Client> authorizedUsers) {
		this.authorizedUsers = authorizedUsers;
	}
}
