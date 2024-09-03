package aug29;

public class Vehicle {

	private void startEngine() {
		System.out.println("startEngine");
		
	}
	
	protected void vehicleCompany() {
		System.out.println("vehicleompany");
	}
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		
		v.startEngine();
		v.vehicleCompany();
		
		Car c = new Car();
		
		c.startEngine();
	}
}
