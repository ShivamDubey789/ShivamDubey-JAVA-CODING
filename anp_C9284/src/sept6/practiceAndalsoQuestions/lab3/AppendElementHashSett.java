package sept6.practiceAndalsoQuestions.lab3;

import java.util.*;

public class AppendElementHashSett {

	public static void main(String [] args) {
		
		//created hashset object named set
		HashSet<String> set = new LinkedHashSet<>();
		
		//adding elements in the hashset
		set.add("shivam");
		set.add("Manish");
		set.add("Ashish");
		set.add("Ankur");
		set.add("Devika");

		//printing set 
		System.out.println("Set of names :"+set);
		
		System.out.println(" ");
		
		//created specified element
		String newName  = "Shreya";
		
		//added specified element mewName
		set.add(newName);
		
		
		//Printing new Set
		
		System.out.println("set of  New names  : "+ set);
	}
}

