package sept6.practiceAndalsoQuestions.lab3;

import java.util.*;
public class UniqueCharacters {

	public static void main(String [] args) {
		
		// Scanner object created to take input
		Scanner scan = new Scanner(System.in);
				
		//asking user for input
		System.out.println("Enter a String");
	
		
		String word = scan.nextLine();
		
		//empty string variable created to store unique characters
		String UniqueChar = "";
		
		//looping input's each character
		for(int i = 0 ; i < word.length(); i++) {
			  
			//variable created to contain  word length
			char currentChar = word.charAt(i);
			
			boolean isUnique = true;
			
			//this checks if a character appears in string
			for(int j = 0; j < word.length(); j++) {
				
				//chects if i=j and if  word  i word j
				if(i != j && currentChar == word.charAt(j) ) {
					isUnique = false;
					//break used to exit from loop
					break;
				}
			}
			// isUnique is true empty string + currentChar
			if(isUnique) {
				
				UniqueChar += currentChar;
			}
			
		}
		
		//printing the output
		System.out.println("input String:" +word);
		System.out.println("Output:" + UniqueChar);
		
		
	}
}
