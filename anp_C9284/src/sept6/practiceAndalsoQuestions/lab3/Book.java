package sept6.practiceAndalsoQuestions.lab3;

import java.util.*;

public class Book {
		
		//Variable Declared bookId , BookName , authoName with data type integer,String,String respectively
		int bookId;
		String bookName;
		String authorName;
		
		//Default constructor created
		public Book() {};
		
		//Parameterized Constructor created
		public Book(int bookId, String bookName, String authorName) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.authorName = authorName;
		}
		
		
		//main method
		public static void main(String[] args) {
		
			//Array list created with object Class book
			//this is taking all the properties of book
			ArrayList<Book> list = new ArrayList<Book>();
				
				
			//books object created with named b1 ,b2 so on and properties 
				Book b1 = new Book(1," Coders at Work "," By Peter Seibel");
				Book b2 = new Book(2,"Clean Code", " By Robert cecil Martin");
				Book b3 = new Book(3,"the C Programming Language "," By Brian Kernighan");
				Book b4 = new Book(4,"Code Complete "," By Steve McConnell");
				Book b5 = new Book(5,"The Pragmatic Programmer "," By Dave Thomas");
				
					//List.add method used to store data into book object
					list.add(b1);
					list.add(b2);
					list.add(b3);
					list.add(b4);
					list.add(b5);
			
					
			//for each loop used to traverse and print properties book id , book name , author name
			for(Book ans  :list){
				System.out.println(ans.bookId +" "+ ans.bookName + " "+ ans.authorName);
			}
				
			
		}
		
			
	
	
		
	

	
}
