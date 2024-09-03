package aug16;

public class SquareHollowPattern {

	public static void main(String[] args) {
		
	
		for( int i = 0 ; i < 6 ; i++  ) {
			
			for(int j = 0 ; j < 5 ; j++) {
				
				if(i == 0 || i == 6 - 1 || j == 0 || j == 5 - 1) {
					System.out.print("*");
					continue;
				}
				
				System.out.print(" ");
			
			}
			System.out.println(); 
		}
					
	}
}
