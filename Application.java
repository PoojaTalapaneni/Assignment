package Sanju;
import java.util.Scanner;
import java.util.Random;

public class Application {
	Account allAccount[] = new Account[1000];
	int noOfAccount = 0;
	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);
	Scanner lo = new Scanner(System.in);

	// private ContactDetails contactDetails;
	// private Account setAccountDetails;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app = new Application();
		while (true) {
			System.out.println("------app menu------");
			System.out.println("1. Enter user Details to submit :");
			System.out.println("2. Enter Deposit Amount :");
			System.out.println("3. Enter Withdrawal Amount : ");
			System.out.println("4. All user Details : ");
			System.out.println("5. User Contact Details : ");
			System.out.println("6. KYC Document Details : ");
			System.out.println("7. Your Balance : ");
			System.out.println("8. Enter changed Mobile number : ");
			System.out.println("9. Enter Changed Email Id : ");
			System.out.println("0. -----Exit-----");
			switch (app.sc.nextInt()) {
			case 1:
				app.submitUserDetails();
				break;
			case 2:
				app.doDepositOperation();
				break;
			case 3:
				app.doWithdrawalOperation();
				break;
			case 4:
				app.printUserAllDetails();
				break;
			case 5:
				app.printUserContactDetails();
				break;
			case 6:
				app.printUserKYCDocumentDetails();
				break;
			case 7:
				app.printBalance();
				break;
			case 8:
				app.changeMobileNumber();
				break;
			case 9:
				app.changeEmailId();
				break;
			case 0:
				System.exit(0);
				break;

			}// end of switch

		} // end of while

	}// end of main

	public void submitUserDetails() {

		Random ran = new Random();
		long accountNumber = ran.nextLong();
		System.out.print("Enter User Name: ");
		String userName = scStr.nextLine();
		System.out.print("Enter Password: ");
		String password = scStr.nextLine();
		System.out.print("Enter Balance: ");
		int balance = sc.nextInt();
		System.out.print("Enter Pan Number: ");
		String panNumber = scStr.nextLine();
		System.out.print("Enter Aadhar Number: ");
		long aadharNumber = lo.nextLong();
		System.out.print("Enter Document Type: ");
		String documentType = scStr.nextLine();
		System.out.print("Enter Document Number: ");
		String documentNumber = scStr.nextLine();
		System.out.print("Enter House Number: ");
		String houseNumber = scStr.nextLine();
		System.out.print("Enter Locality: ");
		String localityName = scStr.nextLine();
		System.out.print("Enter City: ");
		String cityName = scStr.nextLine();
		System.out.print("Enter State: ");
		String stateName = scStr.nextLine();
		System.out.print("Enter Country: ");
		String countryName = scStr.nextLine();
		System.out.print("Enter Pin Code: ");
		long pinCode = lo.nextLong();
		System.out.print("Enter Mobile Number: ");
		long mobileNumber = lo.nextLong();
		System.out.print("Enter Email id: ");
		String emailId = scStr.nextLine();

		allAccount[noOfAccount++] = new Account(accountNumber, userName, password, balance);
		kycVerification kyc = new kycVerification(panNumber, aadharNumber, documentType,documentNumber);
		ContactDetails cd = new ContactDetails(houseNumber, cityName, stateName, localityName,countryName, pinCode, mobileNumber,emailId);
		Account ac = new Account(accountNumber, userName, password, balance);
		ac.setContactDetails(cd);
		ac.setAccountNumber(accountNumber);
		ac.setBalance(balance);
		ac.setUserName(userName);
		ac.getCashback();
		ac.setPassword(password);

		allAccount[noOfAccount++] = ac;
		System.out.println(" " + ac);
		System.out.println(" Added in the List ");

	}

	private void doDepositOperation() {

		System.out.println("Enter account number : ");
		int enteredNumber = sc.nextInt();

		System.out.println(" Enter Amount to be deposite :-  ");
		int amount = sc.nextInt();

		Account enteredAccount = null;
		boolean foundEnteredAccount = false;

		for (int i = 0; i < noOfAccount; i++) {
			Account a = allAccount[i];
			if (a.getAccountNumber() == enteredNumber) {
				enteredAccount = a;
				foundEnteredAccount = true;
			}
			if (foundEnteredAccount) {
				enteredAccount.setBalance(enteredAccount.getBalance() + amount);
			}
		}

		System.out.println(" Deposit Done ");
		System.out.println(" Check Balance ");
		System.out.println(enteredAccount.getAccountNumber() + " - " + enteredAccount.getBalance());

	}

	public Account getAllDetail(long searchAcNumber) {
		for (long i = 0; i < noOfAccount; i++) {
			Account ac = allAccount[(int) i];

			boolean isFound = (ac.getAccountNumber() == searchAcNumber) ? true : false;

			if (isFound) {
				return ac;
			}

		}
		return null;
	}

	private void printUserAllDetails() {

		System.out.print("Enter Searched Account Number  ");
		long searchAcNumber = lo.nextLong();

		Account ac = getAllDetail(searchAcNumber);
		System.out.println("--------------------------------------------------");
		System.out.println(ac);
		System.out.println("--------------------------------------------------");
	}

	private void changeEmailId() {
		System.out.println("Enter the Account Number");
		long accNo = lo.nextLong();

		Account ac = getAllDetail(accNo);

		System.out.println(ac.getContactDetails());

		System.out.println(" ---- Enter New Email Id ---- ");
		String eID = scStr.nextLine();

		ac.getContactDetails().setEmailId(eID);

		System.out.println("--------------------------------------------------");
		System.out.println(" --->> Successful...! :- ");
		System.out.println("your new Email Id-    " + ac.getContactDetails().getEmailId());

		System.out.println("--------------------------------------------------");
	}

	private void changeMobileNumber() {
		System.out.print("Enter the Account Number");
		long accNo = lo.nextLong();

		Account ac = getAllDetail(accNo);

		System.out.println(ac.getContactDetails());

		System.out.print(" ---- Enter New Mobile Number ---- ");
		long mobNo = lo.nextLong();

		ac.getContactDetails().setMobilenumber(mobNo);
		System.out.println("--------------------------------------------------");
		System.out.println(" --->> New Account after updation :- ");
		System.out.println("your new Mobile No.-    " + ac.getContactDetails().getMobilenumber());
		System.out.println("--------------------------------------------------");
	}

	private void printBalance() {

		System.out.println("Enter Account Number");
		long accNo = lo.nextLong();

		Account ac = getAllDetail(accNo);
		System.out.println("--------------------------------------------------");
		System.out.println(ac.getBalance());
		System.out.println("--------------------------------------------------");

	}

	private void printUserKYCDocumentDetails() {
		System.out.println("Enter Account Number");
		long accNo = lo.nextLong();

		Account ac = getAllDetail(accNo);
		System.out.println("--------------------------------------------------");
		
	}

	private void printUserContactDetails() {
		System.out.print("Enter the Account Number");
		long accNo = lo.nextLong();

		Account ac = getAllDetail(accNo);

		System.out.println(ac.getContactDetails());

	}

	private void doWithdrawalOperation() {
		System.out.println("Enter Account Number: ");
		long accNo = lo.nextLong();
		System.out.println("Enter amount for withdraw: ");
		int amt = sc.nextInt();
		Account eNo = null;
		boolean enteredAccNo = false;
		for (int i = 0; i < noOfAccount; i++) {
			Account a = allAccount[i];
			if (a.getAccountNumber() == accNo) {
				eNo = a;
				enteredAccNo = true;
			}
			if (enteredAccNo) {
				eNo.setBalance(eNo.getBalance() - amt);
			}
			System.out.println("Withdrawal is Done!....");
			System.out.println("Check Balance");
			System.out.println(eNo.getAccountNumber() + "-" + eNo.getBalance());
		}

	}

}



