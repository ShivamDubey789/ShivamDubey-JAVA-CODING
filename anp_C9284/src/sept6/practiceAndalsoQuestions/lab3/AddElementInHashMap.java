package sept6.practiceAndalsoQuestions.lab3;

import java.util.*;
public class AddElementInHashMap {

	public static void main(String[] args) {
		
		// hashmap object created named map with two datatype integer and string
		HashMap<Integer , String> map = new HashMap<>();
	
	
		//Elements put on map
		map.put(1, "shivam");
		map.put(2, "Sammy");
		map.put(3, "Devika");
		map.put(4, "Ashish");
		map.put(5, "Manish");
		map.put(6, "Ankuer");
	
	
		//printed map
		System.out.println("Map : " + map);
		
		//created specified elemetns
		int Key = 7;
		String Value = "Mohit";
		
		//add elements on map
		map.put(Key, Value);
		
		//printed ne w map 
		System.out.println("New Map :"+ map);
	}
}
