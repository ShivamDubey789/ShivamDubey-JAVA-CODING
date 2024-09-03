package aug29;

public class Animal {
	
	public void makeSound() {
		System.out.println("Generic Animal Sound");
	}
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		a.makeSound();
		
		Dog d = new Dog();
		d.makeSound();
		
		Cat c = new Cat();
		c.makeSound();;
		
		Cow co = new Cow();
		co.makeSound();;
	}

}
