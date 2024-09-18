package sept18.ExecutorFrameWorkORthreadpull;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		PrintingNames[] arrOfPrint = {new PrintingNames("Shivam"),new PrintingNames("vatsal"),
				new PrintingNames("Mohit"),new PrintingNames("Ankur"),new PrintingNames("manish"),
				new PrintingNames("Devika"),new PrintingNames("ashish"),new PrintingNames("vaibhav"),
				new PrintingNames("Priya"),new PrintingNames("Sammy"),new PrintingNames("Avaraj")};
	
	
		ExecutorService service = Executors.newFixedThreadPool(1000);
		
		for(PrintingNames oo : arrOfPrint) {
			service.submit(oo);
		}
		
		service.shutdown();
	
	
	}
}
