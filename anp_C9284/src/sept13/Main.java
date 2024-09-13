package sept13;

public class Main {

	public static void main(String[] args) {
	
		A tt = new A();
		
		Thread gg = new Thread(tt);
		
		gg.start();
		
		try {
			gg.join(); // main thread will wait till gg dosen't finish its process 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tt.sum);// 0 , some partial result,may get full result
		
	}


}
