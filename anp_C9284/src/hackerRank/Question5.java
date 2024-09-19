package hackerRank;

import java.util.Scanner;

//Objective
//In this challenge, we're going to use loops to help us do some simple math.
//
//Task
//Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
//
//Input Format
//
//A single integer, .
//
//Constraints
//
//Output Format
//
//Print  lines of output; each line  (where ) contains the  of  in the form:
//N x i = result.



public class Question5 {
	
	 public static void main(String[] args) {
	        
		 	Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        int sum = 0;
	        
	        for(int i = 1; i<=10;i++){
	            sum = N * i;
	            System.out.println(N +" x "+i+" = "+sum);
	        }
	     
	    }

}
