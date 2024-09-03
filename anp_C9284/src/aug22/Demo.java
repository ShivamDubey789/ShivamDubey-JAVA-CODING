package aug22;

public class Demo {

	//Polymorphism
	
	//Method Overloading 
	
	// why do you mean by compile time polymorphism? (interview)
	// add method is overloading here 
	
	//contructor is also a method .. 
	// contructor returns object of the same class
	
	public static  void add(int a , int b ) {
		
		int c = a + b;
		System.out.println(c);
		
	}
	
	public static  void add(double a , double b , double c ) {
		
		double i = a + b + c ;
		
		System.out.println(i);
	} 
	
	public static void main(String[] args) {
		
		add(12,32);
		add(12,5,24);
		
		
		Student ss = new Student();
		ss.setId(23);
		ss.setMarks(500);
		ss.setName("rakhu");
		
		
		System.out.println(ss.getId());
		System.out.println(ss.getMarks());
		System.out.println(ss.getName());
		
		System.out.println(ss.toString());
		
	}
}
