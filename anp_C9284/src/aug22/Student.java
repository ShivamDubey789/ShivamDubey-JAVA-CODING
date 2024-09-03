package aug22;


// encapsulation makes more control over data 
// making variables private  called encapsulation 


public class Student {
	
	//what is encapsulation . what is java bean ?
	//java bean kay throught achieve kartey hain encapsulation 
	// when parametriseed constructor is made .. the default contructor is overloaded
	
	private int id;
	private String name;
	private int marks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	public Student() {};
	
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	//getter and setter
	
	//set method
	
	
	//get method
	
	
	
}
