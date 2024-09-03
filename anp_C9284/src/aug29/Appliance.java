package aug29;

public class Appliance {

	String Brand = "Lg";
	int powerConsumption = 250;
	String turnon = "Turn on";
	String turnoff = "Turn on";
	
	
	public void displayApplianceInformation() {
		
		System.out.println("information displayed "+Brand +" "+ powerConsumption);
	}
	
	public void turnonandoff() {
		
		System.out.println("on/off");
	}
	

	
	public static void main(String[] args) {
		
		Appliance a = new Appliance();
		
		a.displayApplianceInformation();
		a.turnonandoff();
		
		Refrigerator r = new Refrigerator();
		r.settemperature();
		r.displaytemperature();
		
		Oven o = new Oven();
		
		o.setMaxTemperature();
		o.displayMaxTemperature();
		
	}
}
