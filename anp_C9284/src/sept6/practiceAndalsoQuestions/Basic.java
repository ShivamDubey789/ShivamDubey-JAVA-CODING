package sept6.practiceAndalsoQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Basic {

	
	// 2-d array how to input into 2d array by user
	//then different method to explore and traverse .. this 2 d like N spiral traversal
	
	// what is internal working of arraylist?
	
	public static void main(String[] args) {
	
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
			System.out.println(list);
		
	
		
		//vector 
		// vector is same as ArrayList
		//it belongs to legacy class
		// it is Synchronized . means it is not multithreaded it is also called thread safety
		
		//HashTable
		//Stack
		//Dictionary
		//Properties
		//Vector
		//these all are Synchronized
		
		
		Vector <String> vecto = new Vector<>();
		
		vecto.add("Pooj");
		vecto.add("Rakhi");
		vecto.add("pooja");
		vecto.add("sunit");
		vecto.add(null);
		vecto.add(null);
		
		
		//stack
		// it follows lifo method(list in first out)
		
		//interview -> explain stck implementation array in java
		Stack<String> stack = new Stack<String>();
		
			stack.push("ayhush");
			stack.push("manish");
			stack.push("suresh");
			stack.push("kajal");
			stack.push("ashsih");
			
			stack.pop(); // last se data hatana
			
			//stack.peek(); // jo last mai uss data ko bata degi .// jo remove honey wala hai
			
				System.out.println(stack.peek());
			
				System.out.println(stack);
		
			
		//Stack implementation using array
			
			
		// implementation of linked list in java
		LinkedList<String> a1 = new LinkedList<String>();
		
			a1.add("ravi");
			a1.add("Shyam");
			a1.add("kisan");
			a1.add("radha");
			a1.add("kopi");
			a1.remove("ravi");
			
				System.out.println(a1);
			
		HashSet<String> set = new HashSet<String>();
		
			set.add("ravi");
			set.add("Shyam");
			set.add("kisan");
			set.add("radha");
			set.add("kopi");
			
			set.add(null);
			set.add(null);
			
				System.out.println(set);
			
		LinkedHashSet<String> sset = new LinkedHashSet<String>();
		
			sset.add("pavitra");
			sset.add("ravi");
			sset.add("Shyam");
			sset.add("kisan");
			sset.add("radha");
			sset.add("kopi");
			
			sset.add(null);
			sset.add(null);
			
				System.out.println(sset);
				
		
		
			
		
		
			
	}


	
}
