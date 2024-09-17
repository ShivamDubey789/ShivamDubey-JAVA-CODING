package sept13;

public class Common {

	
	//whenever thread enters synchronized block  that thread have lock of class
	
	public static synchronized void fun1(String name) {
		
		synchronized(Common.class) {
			
			System.out.println("welcome ");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name);
		}
	}

	
	//100 static Sychronized method will wait
}
