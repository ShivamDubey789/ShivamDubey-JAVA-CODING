package aug16;

public class numberchangingpyramidpattern {

	public static void main(String[] args) {
		
		int num = 4;
		int increase = 1;  
		
		for(int i = 1; i <= num ; i++){
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(increase + " ");
				increase++;
			}
			
			System.out.println();
		} 
	}
}
