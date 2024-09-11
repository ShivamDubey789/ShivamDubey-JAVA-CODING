package sept6.practiceAndalsoQuestions;


// class created Employee which is extending User1day3
public class Employee extends User1day3 {

	
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
