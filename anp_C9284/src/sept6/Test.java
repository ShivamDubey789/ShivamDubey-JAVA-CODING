package sept6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args ) {
		
		  	NewStudent sr1  = new NewStudent(1 , "Aman" , 700) ;
		    NewStudent sr2  = new NewStudent(2 , "ZNimita" , 740) ;
		    NewStudent sr9  = new NewStudent(3 , "NAyaBAccha" , 740) ;
		    NewStudent sr3  = new NewStudent(3 , "Ashneer" , 800) ;
		    NewStudent sr4 = new NewStudent(4 , "Dipender" , 600) ;
				System.out.println("/////////////////////comparator //////////////////////////////");
				
		    List<NewStudent>  listOFNew  = new ArrayList<>() ;
		    	listOFNew.add(sr4);
		    	listOFNew.add(sr3);
		    	listOFNew.add(sr2);
		    	listOFNew.add(sr1);
		    	listOFNew.add(sr9);
		    
		   // Collections.sort(null, null)
		    
		    Collections.sort(listOFNew  , new NameComparator()); // assending or decending order mai  on the baises of marks 
			
			
				for (NewStudent gg:listOFNew) {
					System.out.println(gg);
				}
			
	}
}
