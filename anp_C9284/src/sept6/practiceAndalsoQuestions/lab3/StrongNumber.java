package sept6.practiceAndalsoQuestions.lab3;

import java.util.*;
public class StrongNumber {

	public static void main(String args[]) {
		
		// taking input
		Scanner scanner = new Scanner(System.in);
		
		// storing scanner to num variable 
		int num = scanner.nextInt();
		
		int input = num;
		
		// asking to type input
		System.out.println("type a number");
	
		int sum = 0 ;
	
		//looping num 
		while(num > 0) {
			
			//this gets last digit
			int digit = num % 10;
			
		
			int factorial = 1 ;
		
			//this loop calculate factorial of the digit
			for(int i = 1; i <= digit; i++) {
				
				//factorial *i to get factorial
				factorial *= i;
			}
			
			//sum + factorial .this adds factorial to sum
			sum+= factorial;
			
			// num / 10  here last digit is removed
			num /= 10;
		}
	
			//if else used to check if sum == num
			
			if(sum == num) {
				System.out.println(input + "is a Strong Number");
				}
			else {
				System.out.println(input + "is not a strong number");
			}
		
		scanner.close();
	}
}
