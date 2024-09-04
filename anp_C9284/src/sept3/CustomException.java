package sept3;

public class CustomException {

	public void ageChecker(int age) throws AgeException {
		
		
		
		if(age < 18) {
			throw new AgeException("you are not eligible for vote");
		}
		else {
			System.out.println("you are eligible");
		}
	}
	
	
	public static void main(String[] args) {
		
		CustomException n = new CustomException();
		
		
		try {
			n.ageChecker(17);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Normal Flow");
		
		
	}
}
