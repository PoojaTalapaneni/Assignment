package Sanju;

public class Account {

	private long accountNumber;
	private String userName;
	private int cashBack;
	private String password;
	private int balance;
	kycVerification kycDetails;
	ContactDetails contactDetails;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	 
	public kycVerification getkycDetails() {
		return kycDetails;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	/*@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", userName=" + userName + ", password=" + password
				+ ", balance=" + balance + ", kycDetails=" + kycDetails + ", contactDetails=" + contactDetails + "]";
	}*/
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public Account(long accountNumber, String userName, String password, int balance, kycVerification kycDetails,
			ContactDetails contactDetails) {
		super();
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.password = password;
		this.balance = balance;
		this.kycDetails = kycDetails;
		this.contactDetails = contactDetails;
	}
	private long setAccountDetails(long accNo) {
		// TODO Auto-generated method stub
		return accNo;
	}
	public Account(long accountNumber, String password, String password1,  int balance) {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCashback() {
		this.cashBack=cashBack;
	}
	public void getCashback() {
		// TODO Auto-generated method stub
	return;
	}
	
}	


