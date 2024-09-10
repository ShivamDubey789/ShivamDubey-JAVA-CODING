package sept10;

import java.util.HashMap;

public class Basic1 {

	public static void main(String[] args) {
        int[] sockColors = {12, 34, 12, 53, 12, 34, 53, 21, 21, 45};

        HashMap<Integer, Integer> colorCount = new HashMap<>();

        for (int color : sockColors) {
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }

        int totalPairs = 0;

        for (int count : colorCount.values()) {
            totalPairs += count / 2; 
        }
        
        System.out.println(totalPairs);
}
}