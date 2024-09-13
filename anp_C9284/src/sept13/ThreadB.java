package sept13;

public class ThreadB extends Thread {

	Common ccc;
	String name;

	ThreadB(Common c , String name){
		
		this.ccc = c;
		this.name = name;
	}
	
	public void run() {
		Common.fun1(name);
	}
}
