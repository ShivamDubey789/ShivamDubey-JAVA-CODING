package sept3;

public class Account {

	double amount ; 
	
	Account(double amount) throws insufficientFundException{
		if(amount < 500) {
			throw new insufficientFundException("cant widthdraw");
		}
		
		this.amount = amount;
	} 
	
	public void withdraw(double am) throws insufficientFundException {
		
		if(am > amount) {
			throw new insufficientFundException("low balance");
		}
		
		amount = amount - am ;
		
		System.out.println("please recive amount");
	}
}
