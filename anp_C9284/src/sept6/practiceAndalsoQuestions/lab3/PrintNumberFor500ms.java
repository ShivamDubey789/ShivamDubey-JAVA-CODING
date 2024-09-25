package sept6.practiceAndalsoQuestions.lab3;

//class created to print number
class PrintNumbers extends Thread {

	//run method created to print numbers till 10 . sleep method used for 500ms
	public void run() {
		
		for(int i = 1; i<=10; i++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class PrintNumberFor500ms{
	
	public static void main(String[] args) {
		
		//object created named num
		PrintNumbers num = new PrintNumbers();
		
		//start method called to start tREAD
		num.start();
	}
	
}