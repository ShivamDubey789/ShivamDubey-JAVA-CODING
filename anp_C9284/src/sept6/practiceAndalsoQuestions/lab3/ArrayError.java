package sept6.practiceAndalsoQuestions.lab3;

public class ArrayError {

	public static void main(String[] args) {
		
		//array arr created with 10 index
		int[] arr = new int[5];
		
		//values stored in array index
	 	arr[0] = 78;
	 	arr[1] = 45; 
	 	arr[2] = 54; 
	 	arr[3] = 33; 
	 	arr[4] = 66; 
	 	
	 	
	 	
	 	// for each used to traverse
	 	for(int arrs:arr) {
	 		
	 		System.out.println(arrs);
	 	}
	 	
	 	//try and catch blocks used to throw exception
	 	try {
	 		arr[5] = 47;
	 	}catch(ArrayIndexOutOfBoundsException Exception ){
	 		
	 		Exception.printStackTrace();
	 	}
	 	
	 	
	 	
	 	System.out.println("array throwing exception");
	
	}
}
