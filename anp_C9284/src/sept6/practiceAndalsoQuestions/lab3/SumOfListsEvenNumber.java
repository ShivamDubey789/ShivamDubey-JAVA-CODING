package sept6.practiceAndalsoQuestions.lab3;

import java.util.*;

public class SumOfListsEvenNumber {

	public static void main(String [] args) {
		
		//list object created with Integer datatpe Arraylist created 
				List<Integer> list = new ArrayList<>();
				
				//list of names added in list
				list.add(1);
				list.add(2);
				list.add(3);
				list.add(4);
				list.add(5);
				list.add(6);
				list.add(7);
				list.add(8);
				list.add(9);
				list.add(10);
				list.add(11);
				list.add(12);
				list.add(13);
				list.add(14);

				//printed list
				System.out.println("List of Numbers: " + list);
	
				//initial variable created
				int sum = 0;
				
				//calculating some of even numbers
				for(int cal: list) {
					if(cal % 2 == 0 ) {
						sum += cal;
					}
				}
				
				
				System.out.println("  ");
				//output printed
				System.out.println("Sum of even numbers:"+sum);
				
	}
}


