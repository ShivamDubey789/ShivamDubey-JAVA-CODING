package sept6.practiceAndalsoQuestions.lab3;

//Class animals parent class
class Animals {

	//MakeSound method created 
	public void makeSound() {
		
		System.out.println("the animal makes a sound");
	}	
	
}


//class Dog extending parent class Animals
class Dog extends Animals {

	//MakeSound method created overriding animal makesound method
public void makeSound() {
		
		System.out.println("the dog barks");
	}
}

 
 
//class Cat extending parent class Animals
class Cat extends Animals {

	//MakeSound method created overriding animal makesound method
public void makeSound() {
		
		System.out.println("the Cat meows");
	}
}


//main Class Animal
class Animal{
	
public static void main(String[] args) {
		
		// Animal object created with name ani calling class animal and in class calling method makeSound
		Animals ani = new Animals();
			
			ani.makeSound();
		
		// Animal object created with name dogu calling class Dog and in class calling method makeSound
		Animals dogu = new Dog();
		
			dogu.makeSound();
			
			// Animal object created with name catu calling class Cat and in class calling method makeSound
		Animals catu = new Cat();
		
			catu.makeSound();
	}
}

