package sept13;

public class Test {

	public static void main(String [ ] args) {
		
		Common c = new Common();
		
		ThreadA t1 = new ThreadA(c ,"Raamji");
		
		ThreadB t2 = new ThreadB(c ,"Shyamji");
		
		t1.start();
		
		
		
		t2.start();
	}
}
