package sept10;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Basic {

	public static void main(String[] args) {
		
		
		// map
		// need store data into key value pair
		
		//shivam 80
		
		//hash map is same as hashset
		
		Map<String , Integer> map = new HashMap<>();
			
			map.put("Dhoni",90);
			map.put("Virat",75);
			map.put("Suresh",75);
			map.put("Sachin",70);
			
			map.put("Sachin",80);
			
			
			//isEmpty
			
			//map.clear()
			
			//map.remove(Key,value) example: ("dhoni")
			
			System.out.println(map);
			
			System.out.println("-------------break--------------");
			//System.out.println(map.containsKey("Dhoni"));
			
			//System.out.println(map.containsValue(90));
			
			//System.out.println(map.size());
			
			//map.putIfAbsent("Dhoni",100);
			
			Set<Entry<String , Integer>> newSet = map.entrySet();
			
			
				for(Entry<String,Integer> ee:newSet) {
					
					System.out.println(ee.getKey() +"--------->"+ee.getValue());
				}
			
	}
}
