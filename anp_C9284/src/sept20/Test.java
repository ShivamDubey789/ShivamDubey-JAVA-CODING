package sept20;

public class Test {

	public static void main(String[] args ) {
		
		Shape cr = new Circle();
		
		cr.shaping();

		
		Shape cri = new Shape () {
			public void shaping() {
				System.out.println("i am shapping circle");
			}
		};
		
		cr.shaping();
		
		
		Shape cris = () ->System.out.println("i am shappings circle");
	
				cri.shaping();	

				cris.shaping();
				
				
		Student random = new Student();
		
		Shape obj = random::koiEkHai;
		
		obj.shaping();
		
		Shape obje = Student::koiHaiStatic;
		
		obje.shaping();
	}
}
