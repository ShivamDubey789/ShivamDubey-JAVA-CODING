package sept6.practiceAndalsoQuestions.lab3;



public class HillStations {

	//method location created for hillstations 
	public void location() {
		
		System.out.println("Hillstations ");
	}
	
	//method famous created for hillstations 
	public void famousFor() {
		System.out.println("famous for beautifull scenery and mountains");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//Hillstations object created and its methods are called
		HillStations hill = new HillStations();
		
		
		hill.location();
		hill.famousFor();
		
	
		System.out.println("");
		
		
		//Manali object created and its methods are called
		Manali man = new Manali();
		
	
		man.location();
		man.famousFor();
		
		System.out.println("");
		
		//Mussoorie object created and its methods are called
		Mussoorie mus = new Mussoorie();
		
		mus.location();
		mus.famousFor();
		
		System.out.println("");
		
		//Gulmarg object created and its methods are called
		Gulmarg gul = new Gulmarg();
		gul.location();
		gul.famousFor();
		
		System.out.println("");
	}
}


