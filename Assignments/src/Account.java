
public class Account {

	//Class Attributes
	String number;
	String type;
	double balance;
	static String bankName = "Capital One";

	
	//Methods
	double getBalance() {
		return this.balance;
	}

	void deposit(double amount) {
		this.balance += amount;
	}
	
	void withdraw(double amount) {
		this.balance -= amount;
	}
	
	static String getTradeName() {
		return "JPM";
	}
	
	public static void main(String []args) {
		Account David = new Account();
		System.out.println(David.balance + " & " + David.number);
		David.balance = 800000;
		System.out.println(David.balance);
	}
}