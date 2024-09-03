package aug22;

import aug23.Car;
public class Minicar extends Car{

	public static void main(String[] args) {
		Minicar c = new Minicar();
		c.carEngine = "v8";
		
		System.out.println(c.carEngine);
	}
}
