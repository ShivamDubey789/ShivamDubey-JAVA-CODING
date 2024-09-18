package sept17.deadlock;

public class B {

public synchronized void funB(A a) {
		
		System.out.println("Fun  of b class starts");
		
		a.fun1();// this method will never be called .
		
		System.out.println("Fun b of b class ");
	}
	
	public synchronized void fun2() {
		
		System.out.println("inside fun1");
	}
}
