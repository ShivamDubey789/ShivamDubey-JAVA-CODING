package sept6;

import java.util.*;

public class Book {
		
		int bookId;
		String bookName;
		String authorName;
		
		public Book() {};
		
		public Book(int bookId, String bookName, String authorName) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.authorName = authorName;
		}
		
		
		
		public static void main(String[] args) {
		
			
			ArrayList<Book> list = new ArrayList<Book>();
				
				Book b1 = new Book(1,"book1","ravi");
				Book b2 = new Book(2,"book2","kisan");
				Book b3 = new Book(3,"book3","mohan");
				Book b4 = new Book(4,"book4","shreya");
				Book b5 = new Book(5,"book5","kapil");
				
					list.add(b1);
					list.add(b2);
					list.add(b3);
					list.add(b4);
					list.add(b5);
					
			for(Book ans  :list){
				System.out.println(ans.bookId +" "+ ans.bookName + " "+ ans.authorName);
			}
				
			
		}
		
			
	
	
		
	

	
}
