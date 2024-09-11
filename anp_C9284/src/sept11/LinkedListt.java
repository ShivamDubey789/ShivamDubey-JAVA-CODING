package sept11;

public class LinkedListt {
	
	Node head;

	//linked list implementation using java
	
	static class Node{
		
		int data ;
		
		Node next;//agle vaale iske hi jese object ka referrence
		
		Node(int data){
			
			this.data = data;
			this.next = null;
		}
			
	
		
	}
	
	public static LinkedListt add(LinkedListt list , int data) {
		
		Node Newnode = new Node(data); //isko kisi linked list mai add karn ahai or las mai add karna 
	
		Node curr = list.head;
			
		if(list.head == null) {
			list.head = Newnode;
			return list;
		}
		
			// traversing till last node
			while(curr.next != null) {
				curr = curr.next;
			}
			
			//adding value into last
			curr.next = Newnode;
			
			return list;
	
	}
	
	public static void print(LinkedListt list) {
		
		Node curr = list.head;
		
		System.out.println("Linked list");
		//
		while(curr != null) {
			
			System.out.println(curr.data+" ");
			curr = curr.next;
		}
	}
	
	public static void main(String [] args) {
		
		LinkedListt list = new LinkedListt();
		
			list.add(list, 12);
			list.add(list, 123);
			list.add(list, 54);
			list.add(list, 32);
			
			list.print(list);
	}
}
