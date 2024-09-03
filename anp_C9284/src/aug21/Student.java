package aug21;



public class Student {
	
	//4access modifier - public, private, protected , default
	//public access ... files can be accessed inside any java script
	// private access .... can access only in class s
	
	
	 int id ;
	 String name;
	 Address address;
	

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Student() {};

	
	// to string method is string representation of this student object
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
