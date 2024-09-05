package sept5;

public class Arrayy {

	public static void main(String[] args) {
		
		//created array here 
		int [] arr = new int[5]; // indexes 0 1 2 3  4 
		
		
		for(int i = 0; i<arr.length; i++ ) {
			
			System.out.println(arr[i]);
			System.out.println("for loop" + i);
		}
		
		
		arr[0] = 90;
		
		arr[1] = 98 ; 
		
		arr[2] = 9000 ;
		
		
		
		arr[3] = 8000;
		
		arr[4] = 8999;
		
		try {
			arr[5] = 999; // error .. array out of boud
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //array index out of bond session
		
		//enchanced for loop
		
		for(int aa : arr) {
			System.out.println(aa);
			System.out.println("for loop");
		}
		
		//Array 
		//in this array you can store multiple numbers
		//Array is a facility in java in which you can store linear data 
		//When you are creating the array .. a initial array would be there
		// of size what you have defined 
		
		arr[2] = 89;
		
		String sarr[] = new String[3];
		
		sarr[0] = "Sachin";
		
		sarr[1] = "pooja";
		
		sarr[2] = "hariom";
		
		String [] newArr = ("lalaan top","whinstin ","camera walla" );
		
		
	}
}
