package aug30;

public class FinallyBlock {

	// finally is used with try or catch blocks 
	
	
	
	
	
	
	public static void main(String[] args) {
		
		// try can not be write alone 
		
		try{
			// return ; it will return .. finally block will work
			
			//System.exit(0); // finally block will not run as system will exit earlier it self
			
			int i = 10 / 0 ; // this will give exception
			
			System.out.println("hogi ya nahi hogi");
			
			//it will not run
			
		}catch(ArithmeticException exception) {
			
			exception.printStackTrace();
			System.out.println(exception);
			return;
			
		}finally {
			
			// finally was made to close resource
			
			System.out.println("most im resource that needs to be close");
		
		}
		
		

		System.out.println("normal flow would be maintained");
	}
	
	//what is replacement of finally block 
	
}
