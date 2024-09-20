package sept18.ExecutorFrameWorkORthreadpull;

public class PrintingNames  implements Runnable{

	String name;
	
	PrintingNames(String name){
		
		this.name = name;
	}
	
	public void run() {
		
		System.out.println(name + "  --job is Started by----> " +Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
}
