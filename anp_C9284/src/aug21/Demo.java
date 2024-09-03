package aug21;


public class Demo {

	public static void main(String[] args) {
		
		Address p1 = new Address();
		
		p1.city = "indore";
		p1.state = "MP";
		p1.pincode = 9090909;
		
		Student s1 = new Student();
		
		s1.name = "Ranjit";
		s1.id =  90 ;
		s1.address = p1;
		
		Student s2 = new Student(89,"palak", new Address( "bhopal" , "up", 818181));
		
		s2.name="chanchal";
		
		System.out.println(s2);
		
		
		Programmer p6 = new Programmer();
		
		p6.salary = 80000;
		p6.bonus = 8000;
		p6.doingjob();
		
		System.out.println(p6.salary);
		
		
		
		BabyDog ani = new BabyDog();
		
			ani.eat();
			ani.sound();
			ani.weep();
	}
}
