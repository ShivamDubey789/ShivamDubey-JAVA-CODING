package sept3;

public class Test {

	public static void main(String[] args) {
		
		Account ac;
		try {
			ac = new Account(50);
			
			ac.withdraw(500);
		} catch (insufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
