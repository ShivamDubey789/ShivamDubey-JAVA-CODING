package sept3;

public class TestExceptionPropagation {

	
	public void m() {
		
		
		String name=null;
		System.out.println(name.length());
		
	}
	
	public void n() {
		
		m();
	}
	
	public void p() {
		try {
			n();
		}catch(Exception e ) {
			System.out.println("exception handled");
		}
	
	}
	public static void main(String[] args) {
	
		TestExceptionPropagation n = new TestExceptionPropagation();
		n.p();
		
		System.out.println("normal flow");
		
	}
}
