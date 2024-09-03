package aug21;

public class animal {

	public void eat() {
		System.out.println("eating something");
	}
	
	public static void main(String[] args) {
		BabyDog ani = new BabyDog();
		
		ani.eat();
		ani.sound();
		ani.weep();
	}
}


class Dog extends animal{
	
	public void sound() {
		System.out.println("barking");
		
	}
}
	
	
class BabyDog extends Dog{
	
	public void weep() {
		
		System.out.println("weeping........");
	}
	

}
