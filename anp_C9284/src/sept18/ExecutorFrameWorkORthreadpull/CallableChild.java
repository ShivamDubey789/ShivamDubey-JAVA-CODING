package sept18.ExecutorFrameWorkORthreadpull;

import java.util.concurrent.Callable;

public class CallableChild implements Callable {

	
	int num;
	
	CallableChild( int number){
		
		this.num = number;
	}
	
	public Object call() throws Exception {
		
		int sum = 0;
		
		System.out.println("job started by this thread" + Thread.currentThread().getName() + "it will print sum till name");
		for(int i = 0 ; i<=num; i++) {
			sum = sum + 1 ;
			
		}
		
		return null;
	}

	
	
}
