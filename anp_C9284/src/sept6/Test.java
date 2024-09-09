package sept6;

import java.util.*;

public class Test {

	public static void man(String[] args) {
		
		Student s1 = new Student(1 ,"aman" ,700);
		Student s2 = new Student(1 ,"naman" ,750);
		Student s3 = new Student(1 ,"radha" ,800);
		Student s4 = new Student(1 ,"kana" ,600);
		

		List<Integer> list2 = Arrays.asList(23,56,45,34,2,5,6,4,3);
		
		
		
		
		ArrayList<Student> list = new ArrayList<>();
			
				list.add(s4);
				list.add(s3);
				list.add(s2);
				list.add(s1);
				
			Collections.sort(list2); //ascending or decind order mai on basics of marks
	
			for(Integer gg:list2) {
				
				System.out.println(gg);
			}
	}
}
