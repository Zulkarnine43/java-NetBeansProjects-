public class App {

	public static void main(String[] args) {

		BankAccount ba1=new BankAccount();
		BankAccount ba2=new BankAccount();

		ba1.setAccountHlderName("Zulkar Nine");
		ba2.setAccountHlderName("Elias Kubra");

		System.out.println("Account Holder Name f BA1- "+ba1.getAccountHlderName());
		System.out.println("Account Holder Name f BA2- "+ba2.getAccountHlderName());
	}

}
public class BankAccount {

	private String accountNumber;
	private String accountHlderName;
	private String balance;



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountHlderName(String accountHlderName) {
		this.accountHlderName = accountHlderName;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHlderName() {
		return accountHlderName;
	}
	public String getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHlderName=" + accountHlderName + ", balance="
				+ balance + "]";
	}

	private void depoosit(double ammount) {

	}
	private void withdraw(double ammount) {

	}
	private void depoosit(BankAccount otherAccount,double ammount) {

	}



}