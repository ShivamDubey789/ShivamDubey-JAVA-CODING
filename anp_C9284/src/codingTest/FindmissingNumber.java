package codingTest;

public class FindmissingNumber {
	
	public static void main(String[] args) {
		
		int [] arr = new int[5] ;
		
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;

		
		
		for( int num : arr) {
			
			System.out.println(num);
			num = num -1 ;
			
			}
	
		
		System.out.println();
		
		}
		
	
		
} 

