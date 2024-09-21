package sept20;

public class Student {

	String name;
	Direction d;
	
	public static void koiHaiStatic() {
		
		System.out.println("static hai ");
	}
	public void koiEkHai() {
		System.out.println("sjdkawpq");
	}

	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", d=" + d + "]";
	}
	
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.d = Direction.EAST;
		
		s.name = "Purvi";
		
		System.out.println(s);
		
		
		for( Direction dd:Direction.values()) {
			
			System.out.println(dd);
		}
	}
}
