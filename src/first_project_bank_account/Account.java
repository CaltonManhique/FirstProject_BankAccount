package first_project_bank_account;

public class Account {

	private long accountNumber;
	private int clientNumber;
	private Client client;

	public Account(long accountNumber, int clientNumber, Client client) {
		this.accountNumber = accountNumber;
		this.clientNumber = clientNumber;
		this.client = client;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Account [ accountNumber=" + accountNumber + ", clientNumber=" + clientNumber + ", client=" + client
				+ "]";
	}

}
