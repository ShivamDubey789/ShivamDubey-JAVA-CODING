package sept6;

import java.util.Comparator;

public class NameComparator implements Comparator<NewStudent> {

	@Override
	public int compare(NewStudent o1, NewStudent o2) {
					
		
		return o1.id - o2.id;
		
		
	      
		
//		if(o1.marks == o2.marks)
//		{
//			return o1.name.compareTo(o2.name);
//		}else if (o1.marks > o2.marks) {
//			return 1 ;
//		}else {
//			return  -1 ;
//		}
		
		
	}

	

}
