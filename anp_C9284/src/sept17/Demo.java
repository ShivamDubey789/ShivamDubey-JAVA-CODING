package sept17;
// inter thread Communication how two thread works together


public class Demo {

	public static  void main(String[] args) {
		
			MyThread tt = new MyThread();
			
			
			
			tt.start();
			
			//both are not recommended
			//tt.join();
			//Thread.sleep(1000);
			
			//Released tt locks
			try {
				synchronized(tt) { // here we get lock of tt object and here main method will start waiting till it is not notified
				tt.wait();// This method release the lock 
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(tt.num);
	}
}
