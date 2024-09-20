package sept6.practiceAndalsoQuestions.SEPT19.lab3;


abstract class Vaccination {

	
	int age;
	
	
	String nationality;
	

	boolean firstdosee = false;
	
	boolean secondDosee = false;
	
	
	
	public Vaccination() {};
	
	
	public Vaccination(int age , String nationality) {
		super();
		this.age = age ;
		this.nationality = nationality;
	
	}

	
	
	public void firstDose() {
	
		
		if(nationality == "Indian" && age>=18 ) {
			System.out.println("User can take first dose");
			System.out.println("Pay Rs.250");
			firstdosee = true;
		}
	
		else {
			System.out.println("you are not eligible for the first dose");
		}
	}
	
	

	public void secondDose() {
	
		if(firstdosee) {
			System.out.println("Second dose done");
			secondDosee = true;
		}
		else {
			System.out.println("you must take first dose in order to take second dose ");
		}
	}
	
	
	public abstract void boosterDose();
}




class VaccinationSuccessfull extends Vaccination{
	
	
	public VaccinationSuccessfull(int age , String nationality) {
		super();
		this.age = age;
		this.nationality = nationality;
	}
	
	
	public void boosterDose() {
	
		if(firstdosee && secondDosee) {
			
			System.out.println("you can have Booster Dose");
		}
		else {
			System.out.println("you are not eligible for booster dose");
		}
	}

}

public class Vaccine{
	

	public static void main(String[] args) {
		
		
		VaccinationSuccessfull user = new VaccinationSuccessfull(30,"Indian");
		
			//all methods are called 
			user.firstDose();
			
			user.secondDose();
			
			user.boosterDose();
	}
}
