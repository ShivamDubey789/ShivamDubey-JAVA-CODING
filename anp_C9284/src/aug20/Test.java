package aug20;

public class Test {

	public static void main(String[] args) {
		
		Employee empl = new Employee();// this made as default contructor
		
		empl.empId = 12 ;
		
		empl.empName = "Raju" ;
		
		empl.Salary = 70000 ; 
		
			//System.out.println(empl.empName);
			//empl.shift();
	
	
		Student student1 = new Student();
		
		student1.studentId = 34;
		student1.studentName = "Shivam Dubey";
		student1.studentAddress = " 30 , kotra , bhopal , Madhya Pradesh";
		
			
			//System.out.println("Student ID = " + student1.studentId);
			//System.out.println("Student Name = " + student1.studentName);
			// System.out.println("Student Address = " + student1.studentAddress);
			
		//student1.doingStudy();
		
		Employee e2 = new Employee(45 , "shivam " , 70000);// custom custructor parameterise
		
			//System.out.println(e2.empName);
		
		
		e2.display();
		
		Student student2 = new Student(35 , "Ashish Sharma", "9 , kotra");
		
	
			System.out.println(student2.studentId);
			

		
		student2.display();
	}
	
}
