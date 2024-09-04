package sept3;

public class EmailMain {

	
	public void EmailChecker(String email) throws InvalidEmailException{
		
	
		if(email.contains("@")) {
			throw new InvalidEmailException("email is verified ");
		}
		else {
			System.out.println("email not verified");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		EmailMain e = new EmailMain();
		
		try {
			e.EmailChecker("shivamdubeysdh@gmail.com");
		} catch (InvalidEmailException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("normal flow maintained");
		
	}
}
