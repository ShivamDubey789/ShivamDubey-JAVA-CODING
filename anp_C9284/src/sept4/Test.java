package sept4;

public class Test {

	public final String Adhar;
	
	//public final 
	
	public Test(String pp) {
		this.Adhar = pp;
	}
	
	
	
	public final void add() {
		
	}
	
	public final void add(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Test t = new Test("tteer");
		
		System.out.println(t.Adhar);
		String use = t.Adhar + "pam";
		
		System.out.println(use);
		t.add(9);
	}
}

//finnaly is block of code  .. f
// final is a keyword that would be applied before class so the class will not inherit .

// what is static bindin vs dynamic binding
