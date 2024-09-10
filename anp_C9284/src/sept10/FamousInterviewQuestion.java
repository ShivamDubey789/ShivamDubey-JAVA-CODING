package sept10;

import java.util.HashMap;
import java.util.Map;

public class FamousInterviewQuestion {
	
	public static void main(String[] args) {
		
		// one of the famous question
		
		int []arr = {12,45,23,23,12,45,23,89};
		
		//uou have to find frequency of  array
		
		Map<Integer , Integer> mp = new HashMap<>();
		
		//traversing the array  using for each 
		for(int array:arr) {
			
			if(mp.containsKey(array)) {
				
				mp.put(array,mp.get(array) + 1 );
			}
			else {
				
				mp.put(array, 1);
			}
		
		}
		
		for(Map.Entry<Integer,Integer> oo : mp.entrySet()) {
			
			System.out.println(oo.getKey() + "--------->" + oo.getValue());
		}
	}

}


