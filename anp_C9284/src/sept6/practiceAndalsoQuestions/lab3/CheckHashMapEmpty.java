package sept6.practiceAndalsoQuestions.lab3;

import java.util.HashMap;

public class CheckHashMapEmpty {

	public static void main(String[] args) {
		
	//hashmap object created with integer and string named map
	HashMap<Integer , String> map = new HashMap<>();
	
	
	//Elements put on map
	map.put(1, "shivam");
	map.put(2, "Sammy");
	map.put(3, "Devika");
	map.put(4, "Ashish");
	map.put(5, "Manish");
	map.put(6, "Ankuer");

	//new hashmap object created named maps
	HashMap<Integer , String> maps = new HashMap<>();
	
	//printed statements
	System.out.println("Check Map Contains key Value mappings?");
	
	//used isempty method to check it its empty or not
	System.out.println("Map 1 :" + map.isEmpty() + map);
	
	System.out.println("Map 2 :" + maps.isEmpty()+ " "  + maps);
 }
}