package sept5;

import java.util.ArrayList;
import java.util.List;
public class Collections {

	public static void main(String[] args) {
		
		//utility package mai collection hot hai 
		
		//what are the genric in java 
		
		//type safety is provided by particular class'
		
		List<String>  list = new ArrayList<>();
		
			list.add("ram");
		
			list.add("wkishu bhai");
		
			list.add(2,"lopi bhai");
		
		List<String> list22 = new ArrayList<>();
		
			list22.add("radhika");
		
			list22.add("kalpana");
	
			list22.add("shreya");
			
			list22.add("devika");
			
			list22.add("Saundarya");
			
			
			list.addAll(list22);
			System.out.println("sabke nam");
			
			list.remove("kalpana");
		
		for(String jj:list) {
			System.out.println(jj);
		}
		
		System.out.println(list.size());
		System.out.println(list.contains("devika"));
	}
}
