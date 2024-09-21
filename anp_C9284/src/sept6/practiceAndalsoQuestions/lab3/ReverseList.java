package sept6.practiceAndalsoQuestions.lab3;

import java.util.*;

public class ReverseList {

	public static void main(String [] args) {
		
		//listt object created with string datatpe Arraylist created 
		List<String> list = new ArrayList<>();
		
		//list of names added in list
		list.add("Shivam");
		list.add("Sammy");
		list.add("Vatsal");
		list.add("Vaibhav");
		list.add("ashish");
		list.add("mainsh");
		list.add("mohit");
		list.add("priya");
		list.add("Devika");
		list.add("Ankur");
		list.add("Vicky");
		
		
		//printed list
		System.out.println("List of names : " + list);
		
		//Collections class called with reverse method to reverse list
		Collections.reverse(list);
		
		//printed output
		System.out.println("                                ");
		System.out.println("Reversed of given list of names:"+ list);
		
	}
}
