package sept12;

public class Main {

	public static void main(String[] args) {
		
		//you need to create object of the Class (thread)
		
		ThreadA t1 = new ThreadA();// new state 
		
		t1.setName("Dhoni");
		t1.setPriority(10);
		ThreadB t2 = new ThreadB();
		
			t2.setPriority(1);
			
		ThreadC t3 = new ThreadC();
		
		
		////Runnable thread
		
			ThreadBest t4 = new ThreadBest();
			
			Thread tt = new Thread(t4); 
		
			tt.start();
		
		//it will not work as different Thread for running a separate Thread you need to use 
			//t1.run();
		
		
		//from line 14 two thread will active one is main and another is t1
			t1.start();
			t2.start();
			
			//runnable state
			t3.start(); 
		
		for(int i = 0 ; i<=50; i++) { //running state
			
			try {
				
				
			
				Thread.sleep(1000); //blocked state
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// how to keep the name of the thread
			String name = Thread.currentThread().getName();
			System.out.println(i + "---------> i am Manish "+name);
		} 
		//dead state
		
		
		
		
		//Main thread should not do all the work
		
		//there are two ways to create thread
		
		//first way is to class ko extend karna
		
		//implementing runnable interaface 
		
		
	}
}


