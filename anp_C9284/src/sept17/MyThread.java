package sept17;

public class MyThread extends Thread {

	
	int num = 0 ;
	
	public void run() {	
	//1000 lines of code
		
		synchronized(this) {
		
		for(int i = 0;i<=100;i++) {
			
			num = num + i;
	
		}
		this.notify(); 
	}
	// this thread will notify main thread
}
}
