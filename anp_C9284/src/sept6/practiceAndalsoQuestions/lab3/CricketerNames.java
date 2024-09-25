package sept6.practiceAndalsoQuestions.lab3;

import java.util.*;
public class CricketerNames {

	public static void main(String [] args) {
	
		//created hashmap object with name match
		HashMap<String,Integer> match = new HashMap<>();
			
		//added key and values
		match.put("Suresh Raina", 85);
        match.put("Gautam Gambhir", 100);
        match.put("Rishabh Pant", 60);
        match.put("MS Dhoni", 75);
        match.put("Hardik Pandya", 95);
	
       
        
        //scanner objects created to take input=-
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Cricketer's Name you want to Search : ");
        
        // added element to scan
        String Name = scan.nextLine();
        
  
        
        
        //checks if map contains key or not 
        if(match.containsKey(Name)) {
        	
        	int score = match.get(Name);
        	System.out.println(Name + "|| " + "Scored : " + score);
        }
        else {
        	System.out.println("Name not Found.");
        }
	
        scan.close();
	}
}
