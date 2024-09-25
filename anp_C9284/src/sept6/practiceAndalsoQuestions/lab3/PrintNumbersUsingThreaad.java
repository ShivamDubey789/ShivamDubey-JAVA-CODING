package sept6.practiceAndalsoQuestions.lab3;

//class created extending thread
class printNumber extends Thread{

	//method created which prints number
	public void run() {
	for(int i = 0 ; i<5; i++) {
		
		System.out.println(i);
		
	
		}
	}
}


//main class created
class PrintNumbersUsingThreaad{
	
	public static void main(String[] args) {
		
		//class object created named prints 
		printNumber prints = new printNumber();
		
		//start method used to start thread
		prints.start();
		
	}
} 
