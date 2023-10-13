package first_project_bank_account;

import java.util.Random;
import java.util.Scanner;

public class AccountOperations {

	private Client client1 = new Client("John John", "10.05.1999", "Frankfurter Allee  55", "Berlin");

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	long accountNumber = random.nextLong(100000, 999999999);
	int clientNumber = random.nextInt(100000, 999999);

	Account account1 = new Account(accountNumber, clientNumber, client1);

	BankCard bankCard;

	public void createCard() {
		System.out.println("Choose the type of account, 'C' - credit card and 'D' - debit");
		char typeOfAccount = scanner.nextLine().charAt(0);

		System.out.println("Enter the account opening amount:");
		float openingAmount = scanner.nextFloat();

		if (Character.toUpperCase(typeOfAccount) == 'C') {
			System.out.println("Enter limit of credit:");
			float limitOfCredit = scanner.nextFloat();
			bankCard = new BankCard(account1, "12.2050", typeOfAccount, openingAmount, limitOfCredit);
			bankCard.setBalance(openingAmount);
		} else {
			bankCard = new BankCard(account1, "12.2050", typeOfAccount, openingAmount);
			bankCard.setBalance(openingAmount);
		}

		System.out.println(bankCard.toString());
	}

	public void depositCash() {
		System.out.println("Enter amount to deposit:");
		float amount = scanner.nextFloat();
		bankCard.depositCash(amount);
	}

	public void withdrawMoney() {
		System.out.println("Enter withdrawn amount:");
		float amount = scanner.nextFloat();
		bankCard.withdrawMoney(amount);
	}

	public void payCreditCard() {
		System.out.println("Enter amount to pay:");
		float amount = scanner.nextFloat();
		bankCard.payCreditCard(amount);
	}

	public void checkBalance() {
		System.out.println("Your current balance is : " + bankCard.balance());
	}

	public void checkCreditLimit() {
		System.out.println("Your credit limit is : " + bankCard.LimitOfCredit());
	}

	public void chooseOperation() {
		System.out.println("Create account and bank card.");
		createCard();
		
		int option = 0;
		do {

			System.out.printf("Enter: \n1 - Deposit \n2 - Withdrawn Money \n3 - Check Balance \n4 - Pay Credit Card "
					+ "\n5 - Check Credit Limit \n0 - Cancel");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				depositCash();
				break;
			case 2:
				withdrawMoney();
				break;
			case 3:
				checkBalance();
				break;
			case 4:
				payCreditCard();
				break;
			case 5:
				checkCreditLimit();
				break;
			case 0:
				System.out.println();
				break;
			default:
				System.out.println("Enter one of the option numbers from 0 to 5" + "\n");
			}

		} while (option != 0);
		System.out.println("Operation ended, collect your card!!");
	}

	public void start() {
		chooseOperation();
	}

}
