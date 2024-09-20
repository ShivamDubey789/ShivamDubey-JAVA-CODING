package sept6.practiceAndalsoQuestions.SEPT19.lab3;
//Question 1: Implementing Runnable Interface Create a Java program that implements the Runnable interface to print numbers from 1 to 10 using multiple threads.
//
//Requirements:
//
//Create a class PrintNumbers that implements Runnable.
//In the run() method, print numbers from 1 to 10 using a loop.
//Create multiple threads and start them to print numbers concurrently.
public class PrintNumbers implements Runnable {


	


	public void  run() {
		
			for(int i= 1; i<=10;i++) {
				
				System.out.println("PrintNumber ---------->"+ i);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		}	

}

 



