package aug20;

public class Employee {
	
	// method area or class area
	// heap area 
	// stack memory area
	
	
	
	//state
	int empId ; 
	
	String empName ;
	
	double Salary;
	
	
	//method or behaviour . only in method () are used.
	public void shift() {
		
		System.out.println("doing shift 9 to 6");
		
	}
	
	public void sendingMail() {
		
		System.out.println("sending mail to hr");
	}
	
	//constructor
	
	//what is constructor?
	// it is a special method which has name same as class name
	
	public Employee() {} ;
	
    //	 there is no explicit return type in constructor but it is
	//   implicitly returning object
	
	
	//   till paratermize contructor not created  then dont create default .. 
	//    if you creating paratmise  than you must to make default constructor
	
	public Employee(int num , String Naam , double dd) {
		
		empId = num;
		empName = Naam;
		Salary = dd;
		
		
	}
	
	
	// 1. these are used to create object 
	// 2. suppose there is no contructor created by Programmer
	//    so , a default cronstructor is provided by java virtual machine.	
	
	public void display() {
		
		System.out.println("Employee name " + empName);
		System.out.println("Employee ID " + empId);
		System.out.println("Employee Salary " + Salary);
	}
	

}
