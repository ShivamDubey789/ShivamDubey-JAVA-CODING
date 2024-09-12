package sept6.practiceAndalsoQuestions.lab3;

//abstract class vaccination
abstract class Vaccination {

	//Integer data type declared named age 
	int age;
	
	//String data type declared named nationality
	String nationality;
	
	//boolean data type declared named firstdosee anf secondDosee. both with value false 
	boolean firstdosee = false;
	
	boolean secondDosee = false;
	
	
	
	//Default constructor made
	public Vaccination() {};
	
	//Parameterized constructor created 
	public Vaccination(int age , String nationality) {
		super();
		this.age = age ;
		this.nationality = nationality;
	
	}

	
	//first dose method created 
	public void firstDose() {
	
		//its checking  nationality equals to Indian and Age is greater than 18 equal to 18
		if(nationality == "Indian" && age>=18 ) {
			System.out.println("User can take first dose");
			System.out.println("Pay Rs.250");
			firstdosee = true;
		}
	
		else {
			System.out.println("you are not eligible for the first dose");
		}
	}
	
	
	//second dose method created 
	public void secondDose() {
		// its checking if firstdosse equals to true print the statement
		if(firstdosee) {
			System.out.println("Second dose done");
			secondDosee = true;
		}
		else {
			System.out.println("you must take first dose in order to take second dose ");
		}
	}
	
	// abstract method boosterDose for Subclass
	public abstract void boosterDose();
}


//class vaccinationSuccessfull extending Vaccination

class VaccinationSuccessfull extends Vaccination{
	
	//parameterized constructor
	public VaccinationSuccessfull(int age , String nationality) {
		super();
		this.age = age;
		this.nationality = nationality;
	}
	
	//method boosterDose overiding abstract boosterclass in vaccination class
	public void boosterDose() {
		
		//checking if firstdosee equals to True and secondosee equals to True print statement
		if(firstdosee && secondDosee) {
			
			System.out.println("you can have Booster Dose");
		}
		else {
			System.out.println("you are not eligible for booster dose");
		}
	}

}

// main class Vaccine
public class Vaccine{
	
	// main method 
	public static void main(String[] args) {
		
		//VaccinationSuccessfull object created with name user in calling method int and string value are called
		VaccinationSuccessfull user = new VaccinationSuccessfull(30,"Indian");
		
			//all methods are called 
			user.firstDose();
			
			user.secondDose();
			
			user.boosterDose();
	}
}