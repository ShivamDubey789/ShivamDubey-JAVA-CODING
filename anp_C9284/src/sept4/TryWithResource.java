package sept4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		//interview question -> what is replacement of finally block
		
		//in finally write which you need to close
		
		//FileOutputStream outputt = new FileOutputStream("shivam.txt");
		
		FileOutputStream output = null;
				
		try{
			
			output = new FileOutputStream("C:\\Users\\hii\\Desktop\\shivamm.txt");
			String msg = "welcome this ajp course";
			
			byte[] arr = msg.getBytes();
			
			output.write(arr);
			
			System.out.println("yes work done");
			
		}catch(Exception e) {
			
			System.out.println(e);
		}finally {
			
			try {
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//iska replacement hai try with resource 
		
	}
}
