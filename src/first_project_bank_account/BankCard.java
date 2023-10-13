package first_project_bank_account;

public class BankCard {

	private String expiryDate;
	private char typeOfCard; // 'C' - Credit card and 'D' - Debit card
	private Account account;

	// For Credict cards
	private float limitOfCredit;
	private float creditBalance;

	// For both cards
	private float balance;

	public BankCard(Account account, String expiryDate, char typeOfCard, float balance) {
		this.account = account;
		this.expiryDate = expiryDate;
		this.typeOfCard = typeOfCard;
	}

	public BankCard(Account account, String expiryDate, char typeOfCard, float balance, float limitOfCredit) {
		this.account = account;
		this.expiryDate = expiryDate;
		this.typeOfCard = typeOfCard;
		this.limitOfCredit = limitOfCredit;
		creditBalance = limitOfCredit;
	}

	public boolean isCredictCard(char type) {
		return Character.toUpperCase(type) == 'C' ? true : false;
	}

	public void depositCash(float amount) {
		this.balance += amount;
		System.out.println("Deposit :   " + amount + "\n" + "Balance :    " + balance);
	}

	public void withdrawMoney(float amount) {
		if (amount < balance || amount < limitOfCredit) {
			if (isCredictCard(Character.toUpperCase(typeOfCard)) && creditBalance >= amount) {
				creditBalance -= amount;
				System.out.println("Withdrawn :    " + amount + "\n" + "Credit Balance :    " + creditBalance);
			} else if (isCredictCard(Character.toUpperCase(typeOfCard)) && creditBalance < amount) {
				System.out.println("Insufficient balance!!!" + "\n" + "Try less than " + creditBalance);
			} else {
				balance -= amount;
				System.out.println("Withdrawn :    " + amount + "\n" + "Balance :    " + balance);
			}
		} else {
			System.out.println("Insufficient balance!!!" + "\n");
		}
	}

	public void payCreditCard(float amount) {
		if (!isCredictCard(Character.toUpperCase(typeOfCard))) {
			System.out.println("Unable to perform this operation. Only possible with credit card!!");
		} else {
			if (balance > 0 && balance > amount) {
				if (creditBalance + amount > limitOfCredit) {
					float owedAmount = limitOfCredit - creditBalance;
					creditBalance += owedAmount;
					balance -= owedAmount;
					System.out.println("Credit Balance :    " + creditBalance + "\n" + "Balance :  " + balance);
				} else {
					creditBalance = balance - amount;
					System.out.println("Credit Balance :    " + creditBalance);
				}
			} else {
				System.out.println("Insufficient balance to perform this operation!!!");
			}
		}
	}

	public float balance() {
		return balance;
	}

	public float LimitOfCredit() {
		return limitOfCredit;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankCard [expiryDate=" + expiryDate + ", typeOfCard=" + typeOfCard + ", account=" + account
				+ ", limitOfCredit=" + limitOfCredit + ", balance=" + balance + "]";
	}

}
