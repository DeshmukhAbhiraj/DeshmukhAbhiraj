class Reverse{
	
	static node head;
	
	static class Node{
		
		int data;
		Node next;
		
	}
	Node(int data){
		this.data=data;
		this.next=null;
	}
	
	Node reverse(Node node){
		Node prev =null;
		Node current = node;
        Node next = null;		
	
	  while(current!= null){
		  next=current.next;
		  current.next=prev;
		  prev=current;
		  current=next;
	  }
	  node = prev;
	  return node;
	  
	  
	}
	
	void print(Node node){
		while(node != node){
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	
	public static void main(Strings[] args){
		
		Reverse l1 = new l1();
		
		l1.head = new Node(1);
		l1.head.next = new Node(2);
		l1.head.next.next = new Node(3);
		l1.head.next.next.next = new Node(4);
		l1.head.next.next.next.next = new Node(5);
		
		System.out.println("list to be reversed");
		l1.print(head);
		
		rev=l1.reverse(head);
		
		System.out.println("list after reversed");
		
		l1.print(rev);
		
		
	}
}