package sept13;

public  class A implements Runnable {

	int sum = 0 ;
	
	public void run() {
		
		for(int i = 0 ; i<=100;i++) {
			
			sum+=1;
		}
		
	}

}
