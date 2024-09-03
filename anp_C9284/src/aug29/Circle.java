package aug29;

public class Circle extends Shape{
	
	
	public void calculateArea( double l) {
		
		double area = 3.14 * l*l;
		System.out.println("Area of the circle = "+ area);
	}

	public static void main(String args[]) {
		Square s1 = new Square();
		s1.calculateArea(7);
		Circle c1= new Circle();
		c1.calculateArea(8);
	}
}