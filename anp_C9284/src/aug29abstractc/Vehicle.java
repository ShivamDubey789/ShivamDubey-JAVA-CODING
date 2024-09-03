package aug29abstractc;

public abstract class Vehicle {

	public void drive() {
		System.out.println("Driving car");
	}
	
	public static void main(String[] args) {
		
		
		Car c = new Car();
		
		c.drive();
		
		MotorCycle m = new MotorCycle();
		
		m.drive();
	}
}

