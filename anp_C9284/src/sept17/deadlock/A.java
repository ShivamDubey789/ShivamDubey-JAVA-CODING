package sept17.deadlock;

public class A {

	//suppose one thread entered into this method 
	public synchronized void funA(B b) {
		
		System.out.println("Fun A of a class starts");
		
		b.fun2();
		
		System.out.println("Fun A of a class ");
	}
	
	//now at same time thread can not enter into this or
	//any other thread .... also cant that thread dont have oject level lock
	// lock is engaged in funA
	public synchronized void fun1() {
		
		System.out.println("inside fun1");
	}
}
