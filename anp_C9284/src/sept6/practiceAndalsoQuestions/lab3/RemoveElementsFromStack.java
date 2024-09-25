package sept6.practiceAndalsoQuestions.lab3;

import java.util.*;
public class RemoveElementsFromStack {

	public static void main(String [] args) {
		
		//Stack object creeated with name stack and datatype string
		Stack<String> stack = new Stack<String>();
	
	
		// Elements added to stack 
		stack.push("Shivam");
		stack.push("Sammy");
		stack.push("Vatsal");
		stack.push("Devika");
		stack.push("Ashish");
		stack.push("Manish");
		stack.push("vaibhav");
		stack.push("Soumya");
		stack.push("Radhika");
		stack.push("Shreya");
		
		
		//printing stack
		System.out.println("Stack:"+stack);
		
		//removing elements from stack
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		
		//printing new stack
		System.out.println("New Stack : "+ stack);
		
	}
}
