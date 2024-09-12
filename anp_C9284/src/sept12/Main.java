package sept12;

import sept11.ThreadBest;

public class Main {

	public static void main(String[] args) {
		
		//you need to create object of the Class (thread)
		
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
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
			t3.start();
		
		for(int i = 0 ; i<=50; i++) {
			
			System.out.println(i + "---------> i am Manish");
		} 
		
		//Main thread should not do all the work
		
		//there are two ways to create thread
		
		//first way is to class ko extend karna
		
		//implementing runnable interaface 
		
		
	}
}


