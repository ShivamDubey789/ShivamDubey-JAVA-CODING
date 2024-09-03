package aug29;

public class Counter {

	static int count;
	
	public static void increment() {
		count++;
	}
	
	public static void getCount() {
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		
		
		
		Counter a = new Counter();
		
		Counter b = new Counter();
		
		Counter c = new Counter();
		
		a.increment();
		a.getCount();
		
		b.increment();
		b.getCount();
		
		c.increment();
		c.getCount();
		
	}
}
