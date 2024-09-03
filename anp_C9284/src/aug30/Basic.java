package aug30;

// java mai jo bhi nayi chije aap use kar rahe ho uska package import karna padta hai
// java mai java.lang package automatic import rehta hai . there is no need to import explicitly

//jvm architecture padna hai 

public class Basic {
	
	// class area  , heap area , stack area
	
	public static void doingSomeTask() {
		
		System.out.println("work done");
		
		
	}

	public static void main(String[] args) {
		
		int i = 10 ;
		int j = 10;
		
		int task = i/ j ;
		
		System.out.println(task);
	
		System.out.println("1000 lines of code");
		
		//doingSomeTask();
		
		
		//unchecked -- matlab ki programm ko jab run kar rahe hai tab ismmai problem araha hai 
		// they are called as runtime exception 
		
		int []arr = new int [5];
		
		arr[0] = 12;
		arr[1] = 13;
		arr[2] = 14;
		arr[3] = 15;
		arr[4] = 17;
		
		//arr[5] = 89; // 5th position itna pehle se decide nahi hai 
		System.out.println(arr[0]);
		
		String k = "shivam";
		
		System.out.println(k.charAt(5));
		
		String age = "eighteen";
		
		try {
			
			int agee = Integer.parseInt(age);
		
		}catch(Exception e){
			
			System.out.println(e);
		}
		
		System.out.println("1000000 lines of code ");
		
		
		//notes 
		// exception ko jo bhi class extend kar rahi hai all are Checked Exception
		// except runtime exception
		
		//notes == jo bhi class runtime exception ko extend kar rahi hai wo saari classes are unchecked exception hoti hai 
	
		// when  you write code and exception occurs than it means there is an error in compilation error .
		// compiler only tells that this line may have error 
		// these are called checked or compile time exception
		
	
	}
}
