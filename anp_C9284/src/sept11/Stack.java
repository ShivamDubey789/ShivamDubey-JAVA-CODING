package sept11;

import java.util.Arrays;

public class Stack {

	private int maxSize ;
	
	private int top = -1;
	
	private int[] stackArray;
	
	//stack st = new Stack(234) ; \\\
	
		public Stack(int size) {
			
			maxSize = size;
			stackArray = new int[maxSize];
			
			// here maxSize will be created 
		}
	//push method to enter the data 
	// push tab tak kaam nahi karega jab tak ki mai nahi kitne siza ka array mahi banao
	
		public void push(int element){
			
			
			if(top>= maxSize - 1 ) {
				System.out.println("stack overflow");
				return ;
			}
			stackArray[++top] = element;
			//top = -1;
			
			
		}
		
		//it will remove the last value of the array or it is not removing it is giving you last value
		// moving cursor to 
		
		public int pop() {
			
			if(top < 0 ) {
				System.out.println("Stack is empty under flow");
				return -1;
			}
			return stackArray[top--];
		}
		
		  public int peek() {
			  if (top <  0) {
				  System.out.println("stack is empty  under flow condition");
				  return -1 ;
			  }
			  return 	 stackArray[top];
			}
		
		public int size() {
			
			if(top < 0 ) {
				
				System.out.println("stack is empty");
				return 0;
			}
			return top +1;
		}
		
		public boolean isEmpty() {
			
			return top == -1;
		}
		
		public boolean isFull() {
			
			return top == maxSize -1;
		}
		
		
		
		
		
		
		@Override
		public String toString() {
			return "Stack [" + Arrays.toString(stackArray) + "]";
		}

		public static void main(String[] args) {
		
			Stack st = new Stack(5);
			
			st.push(23);
			st.push(33);
			st.push(43);
			st.push(22);
			st.push(223);
			
			System.out.println(st.pop() );
			
			System.out.println(st);
		}

}
