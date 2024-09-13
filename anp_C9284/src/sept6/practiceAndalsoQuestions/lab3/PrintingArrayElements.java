package sept6.practiceAndalsoQuestions.lab3;

public class PrintingArrayElements {

	public static void main(String[] args) {
		
		//Array created  with index 100 named Number storing integer values
		int []Number = new int[100] ;
		
		//first loop created to store value in array number from 1 to 100
		for (int i = 0 ; i<100; i++) {
			Number[i] = i + 1;
		}
		
		//Printing statement before printing array
		System.out.println("Array Number  elements as Follows:");
		
		
		//Second loop print each element in Number array Indexes
		for(int i = 0 ; i<Number.length;i++) {
			
			//printing Number Arrays value on console
			System.out.println(Number[i]);
		}
		
		
	}
}
