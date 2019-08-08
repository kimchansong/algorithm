package dataStructure;


public class ListStack {
	private Node top;
	public class Node{
		Object data;
		Node nextData;
		public Node(Object data) {
			// TODO Auto-generated constructor stub
			this.data= data;
			this.nextData= null;
		}
	}
	public ListStack(){
		this.top = null;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public Object peek() {
		if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
		
		return top;
	}
	
	public void push(Object data) {
		Node newNode = new Node(data);
		top.nextData = newNode;
		top = newNode;
	}
	
	public Object pop() {
		Object returnData = peek();
		top = top.nextData;
		return returnData;
	}
}
