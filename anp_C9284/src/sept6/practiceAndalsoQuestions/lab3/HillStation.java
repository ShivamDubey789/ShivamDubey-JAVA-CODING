package sept6.practiceAndalsoQuestions.lab3;



class HillStations {

	//method location created for hillstations 
	public void location() {
		
		System.out.println("Hillstations ");
	}
	
	//method famous created for hillstations 
	public void famousFor() {
		System.out.println("famous for beautifull scenery and mountains");
	}
	
}


//class Manali extending HillStations
class Manali extends HillStations {
	
	//class manali is child  class of parent class hillstations
	//location and famousFor method created 
	public void location() {
		
		System.out.println("Manali is in Himachal Pradesh");
	}
	
	public void famousfor() {
		System.out.println("full with mountains");
	}
}


//class Mussoorie extending HillStations
class Mussoorie extends HillStations {

	//class Mussorie is child class of parent class hillstation
	//location and famousFor method created
	public void location() {
		
		System.out.println("Mussoori is in Uttarakhand");
	}
	
	public void famousFor() {
		System.out.println("mussoori famous for  old beautifull architecture and nature");
	}
}



//Class Gulmarg extending HillStations
class Gulmarg extends HillStations {
	
	//class Gulmarg is child class of parent class hillstation
	//location and famousFor method created
	public void location() {
		
		System.out.println("Gulmarg is in Jammu and kashmir");
	}
	
	public void famousFor() {
		System.out.println("famous for snow ,skiing and snowboarding");
	}
}


//Main class 
class HillStation{
	
public static void main(String[] args) {
		
		//Hillstations object created and its methods are called
		HillStations hill = new HillStations();
		
		
		hill.location();
		hill.famousFor();
		
	
		System.out.println("");
		
		
		//Hillstation object created with subclass's /child class  to override and its methods are called
		HillStations man = new Manali();
		
	
		man.location();
		man.famousFor();
		
		System.out.println("");
		
		
		HillStations mus = new Mussoorie();
		
		mus.location();
		mus.famousFor();
		
		System.out.println("");
		
		
		HillStations gul = new Gulmarg();
		gul.location();
		gul.famousFor();
		
		System.out.println("");
	}
}