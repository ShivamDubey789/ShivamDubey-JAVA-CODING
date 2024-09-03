package aug29;

public class Oven extends Appliance {

	int maxTemperature = 100;
	
	public void setMaxTemperature() {
		
		System.out.println("set max temperature");
	}
	
	public void displayMaxTemperature() {
		
		System.out.println("Max Temperature is " + maxTemperature);
	}
}
