package sept6.practiceAndalsoQuestions.SEPT19.lab3;

public class PrintNumb implements Runnable {




	
	public void  run() {
		
		
		
		for(int i = 1; i<=10;i++) {
			
			System.out.println("Number ---------->"+ i);
	
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
