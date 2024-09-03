package aug20;

public class Student {

	int studentId ;
	
	String studentName ; 
	
	String studentAddress ;
	
	public void doingStudy() {	
		System.out.println("taking class from anudip");
	} 
	
	public Student() {};
	
	
	public Student(int num , String name , String Address) {
	
	 studentId = num ;
	 studentName = name;
	 studentAddress = Address;
	}
	
	public void display() {
		System.out.println("Student ID = " + studentId);
		System.out.println("Student Name = " + studentName);
		System.out.println("Student Address = " + studentAddress);
	
	}
}

