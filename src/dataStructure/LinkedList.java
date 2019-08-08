package dataStructure;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;

	public class Node {
		Object data;
		Node nextNode;

		public Node(Object data) {
			this.data = data;
			this.nextNode = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}

	public void addFirst(Object data) {
		Node newNode = new Node(data);
		newNode.nextNode = head;
		head = newNode;
		size++;
		if (head.nextNode == null) {
			tail = head;
		}
	}

	public void addLast(Object data) {
		if (size == 0) {
			addFirst(data);
		} else {
			Node newNode = new Node(data);
			tail.nextNode = newNode;
			tail = newNode;
			size++;
		}
	}

	Node node(int k) {
		Node n = head;
		for (int i = 0; i < k; i++) {
			n = n.nextNode;
		}
		return n;
	}

	public void add(int k, Object data) {
		if (k == 0) {
			addFirst(data);
		} else {
			Node newNode = new Node(data);
			Node temp1 = node(k - 1);
			Node temp2 = temp1.nextNode;
			temp1.nextNode = newNode;
			newNode.nextNode = temp2;
			size++;
			if (newNode.nextNode == null) {
				tail = newNode;
			}
		}
	}

	public String toString() {
		if (head == null) {
			return "[]";
		}

		Node temp = head;
		String str = "[";

		while (temp.nextNode != null) {
			str += temp.data + ",";
			temp = temp.nextNode;
		}

		str += temp.data;

		return str + "]";
	}

	public Object removeFirst() {
		Object temp = head;
		head = head.nextNode;
		Object returnData = head.data;
		temp = null;
		size--;
		return returnData;
	}

	public Object remove(int k) {
		if (k == 0) {
			return removeFirst();
		} else {
			Node temp = node(k - 1);
			Node todoDeleted = temp.nextNode;
			temp.nextNode = temp.nextNode.nextNode;
			Object returnData = todoDeleted.data;
			if (todoDeleted == tail) {
				tail = temp;
			}
			todoDeleted = null;
			size--;
			return returnData;
		}
	}
	
	public int size() {
		return size;
	}
	
	public Object get(int k) {
		Node returndata = node(k);
		return returndata.data;
	}
	
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data!=data) {
			temp = temp.nextNode;
			index++;
			if(temp==null) {
				return -1;
			}
		}
		return index;
	}
}
