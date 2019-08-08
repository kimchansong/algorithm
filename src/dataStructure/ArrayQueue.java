package dataStructure;

public class ArrayQueue {
	private int front;
	private int rear;
	private int maxSize;
	private Object[] queueArray;
	
	public ArrayQueue(int maxSize) {
		this.front = 0;
		this.rear = -1;
		this.maxSize = maxSize;
		this.queueArray = new Object[maxSize];
	}
	
	public boolean empty() {
		return (front==rear+1);
	}
	
	public boolean full() {
		return (rear == maxSize-1);
	}
	
	public void insert(Object item) {
		if(full()) throw new ArrayIndexOutOfBoundsException();
		
		queueArray[++rear] = item;
	}
	
	public Object peek() {
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		
		return queueArray[front];
	}
	
	public Object remove() {
		Object item = peek();
		front++;
		return item;
	}
	
	
}
