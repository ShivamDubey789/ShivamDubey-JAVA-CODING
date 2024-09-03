package aug22;

public class Car extends Vehicle {
	
	/* signature  it should be same as parent class*/
	public void running() {
		System.out.println("every vehicle can run but u am the best runner");
	}

	public static void main(String[] args) {
		
		
		Vehicle v = new Vehicle();
		v.running();
		
		Car c  = new Car();
		//runtime polymorphism
		c.running();
		
	
	}
}
