package sept12;

public class ThreadA  extends Thread{
	
	//code everything that you want to run parallel to Main
	public void run() {
		
		
		for(int i = 51 ; i<=100; i++)
		System.out.println(i + "-------------> i am SHIVAM");
	}

}

class ThreadB extends Thread{
	
	public void run() {
		
		for(int i = 100 ; i<=150; i++) {
			System.out.println(i+ "----------->i am Vatsal");
		}
	}
}

class ThreadC extends Thread{
	
	public void run2() {
		
		for(int i = 150 ; i<=200; i++) {
			System.out.println(i+ "------------->i am Vaibhav");
		}
	}
}