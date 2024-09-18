package sept18.ExecutorFrameWorkORthreadpull;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args) {
		
		CallableChild [] newArray = { new CallableChild(10),new CallableChild(200),new CallableChild(1000),
				new CallableChild(5000),new CallableChild(9000),new CallableChild(29928),new CallableChild(4674),new CallableChild(9356),
				new CallableChild(10000),new CallableChild(2928),new CallableChild(23426),new CallableChild(10975)};
	
	
		ExecutorService e5 = Executors.newFixedThreadPool(2);
		
			for(CallableChild cc : newArray) {
				
				Future pp = e5.submit(cc);
				
				try {
					System.out.println(pp.get());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
	}

}
