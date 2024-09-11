package sept6.practiceAndalsoQuestions;

public class PalindromeDay3 {
	
	

	public static void main(String[] args) {
		
		//String data type inside variable created named str with value Madam
		String str = "Madam";
		
		
		
		//String data type inside variable created named strlower with value str.LowerCase() method
		// this method converts upper case string case to lower case string
		String strlower = str.toLowerCase();
		
		
		
		//Integer data type created named strlength with value strlower.length() method //here strlower is used which has lower case madam
		//this method returns the length of string in integer which is here 5
		int strlength = strlower.length();
		
		

	
		//for loop created with integer i with value 0 
		//here condition i < strlength /2  .... 5/2 = 2.5 . as integer variable returns number only so here value =2 .so i <2 .. i++ i incrementing 
		// here loop will run 3 times which is 0,1 ,2
		
		
		for(int i = 0 ; i < strlength / 2; i++) {
		
			
			//if statement used to compare string first index character with last index character 
			// strlength - i -1 runs when loop start looping first 5-1 happens to know index of last character 
			if(strlower.charAt(i) != strlower.charAt(strlength - i - 1 )) {
				
				// if madam not equal to  madam // madam is not a palindrome is printed and return statement used to exit loop
				System.out.println(str + " is not  a palindrome");
				return;
			}
		}
		System.out.println(str + " is a palindrome");
		
	}
}
