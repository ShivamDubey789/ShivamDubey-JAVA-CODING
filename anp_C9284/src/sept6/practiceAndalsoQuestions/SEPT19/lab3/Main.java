package sept6.practiceAndalsoQuestions.SEPT19.lab3;

public class Main {

	public static void main(String[] args) {
			
			PrintNumbers num = new PrintNumbers();
			
			Thread begin = new Thread(num);
			
			begin.start();
			
			PrintNumb numb = new PrintNumb();
			
			Thread gg = new Thread(numb);
			gg.start();
			
			
			
			try {
				begin.join();
				gg.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
