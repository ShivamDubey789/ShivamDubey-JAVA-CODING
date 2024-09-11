package sept6.practiceAndalsoQuestions;

import java.util.*;
public class arrayday3 {


	public static void main(String[] args) {
		
		int[] arr = new int[10];
	
		 	arr[0] = 2;
		 	arr[1] = 4; 
		 	arr[2] = 5; 
		 	arr[3] = 3; 
		 	arr[4] = 6; 
		 	arr[5] = 7; 
		 	arr[6] = 9; 
		 	arr[7] = 4; 
		 	arr[8] = 5;
		 	arr[9] = 6; 
		 
		
		
		 
		 int [] subArray = Arrays.copyOfRange(arr,2,7);
		 
		 int maxValue = Integer.MIN_VALUE;
		 	
		 int secondMaxValue = Integer.MIN_VALUE;
		 
 				System.out.println("Sub array: "+Arrays.toString(subArray));
		 
 					for(int num: subArray) {
 						
 						if(num > maxValue) {
 							
 							secondMaxValue= maxValue;
 							
 							maxValue = num;
 						}
 						else if (num > secondMaxValue && num != maxValue) {
 			                // If current number is between highest and second-highest, update second-highest
 							secondMaxValue = num;
 			            }
 						
 					}
		 
 			System.out.println("2nd Highest element : "+ secondMaxValue );
 	 				
		
	}
}
