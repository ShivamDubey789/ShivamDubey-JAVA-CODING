package sept6.practiceAndalsoQuestions.lab3;

class User1day32 {
	
	// integer variable declared name id
	int id;
	// String variable declared name
	String name; 
	
	// default constructor created
	public User1day32(){}; 
	
	
	//parameterized constructor created
	public User1day32(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

	//getter of id 
	public int getId() {
		return id;
	}

	//setter of id 
	public void setId(int id) {
		this.id = id;
	}

	//getter of name 
	public String getName() {
		return name;
	}

	//setter of name 
	public void setName(String name) {
		this.name = name;
	}


	//To String method to get string object representing number object
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}


	

}

//class created Employee which is extending User1day3
class Employee extends User1day32 {

	
	//Variable declared with double data type named Salary
	double salary;
	
	
	//getter method created for salary
	public double getSalary() {
		return salary;
	}

	//setter method created for salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	//calculateAnnualSalary method created with return type double which is simply multiplying salary with total number of months 
	public double calculateAnnualSalary() {
		
		return salary * 12;
		
	}
	
}

class User{
	
public static void main(String[] args) {
		
		//class employee's object was created named emp.
		Employee emp = new Employee();
		
		
		
		//set method is called to set data or values in properties which is Id ,Name And Salary 
		emp.setId(101);
		emp.setName("shivam");
		emp.setSalary(50000);

		
		//new variable created named annualSalary with double data type calling calculateAnnualSalary Method
		double annualSalary = emp.calculateAnnualSalary();
		
		
		//printing output to console calling get methods of id, name 
		System.out.println("Employee id : "+emp.getId());
		System.out.println("Employee name : "+ emp.getName());
		
		//printing variable annual salary
		System.out.println("Employee annualsalary : "+annualSalary);

	}
}

