package sept4;

public class Bank {

	double amount;

	public Bank() {};
	
	public Bank(double amount) {
		super();
		this.amount = amount;
	}
	
	public void widthdraw(double withdrawalAmount) {
		
		String amounts = (withdrawalAmount <= amount) ? "Withdraw Successfull" : "balance not enough";
	
		if(withdrawalAmount <= amount) {
			amount -= withdrawalAmount;
		}
		else {
			System.out.println(amounts);
		}
	}
	
	public void deposit(double depositAmount) {
		
		amount += depositAmount;
		System.out.println("deposited ");
	} 
	
	public void displaybalance() {
		System.out.println("total balance " + amount);
		
	}
	
	public static void main(String[] args) {
		
		Bank b = new Bank(10000);
		
		b.widthdraw(4000);
		
		b.deposit(5000);
		
		b.displaybalance();
	}
}
