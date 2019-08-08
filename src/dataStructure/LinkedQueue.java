package dataStructure;

public class LinkedQueue {
	public class Node{
		Object data;
		Node NextNode;
		public Node(Object data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.NextNode = null;
		}
	}
	private Node front;
	private Node rear;
	public LinkedQueue() {
		// TODO Auto-generated constructor stub
		this.front = null;
		this.rear = null;
	}
	
	public boolean empty() {
		return front==null;
	}
	
	public Object peek() {
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		
		return front.data;
	}
	
	public void insert(Object data) {
		Node newNode = new Node(data);
		if(empty()) {
			front = newNode;
			rear = newNode;
		}else {			
			rear.NextNode = newNode;
			rear = newNode;
		}
	}
	
	public Object remove() {
		Object data = peek();
		front = front.NextNode;
		if(front==null) {
			rear = null;
		}
		return data;
	}
}
