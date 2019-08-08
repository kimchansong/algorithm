package dataStructure;

public class ArrayStack {
	
		private int maxSize;
		private int head;
		private Object[] stackSize;
		
		public ArrayStack(int maxSize) {
			this.maxSize = maxSize;
			this.head = -1;
			this.stackSize = new Object[maxSize];
		}

		public boolean isEmpty() {
			return (head == -1);
		}

		public boolean full() {
			return head == maxSize - 1;
		}

		public void push(Object data) {
			if (full())
				throw new IndexOutOfBoundsException(head - 1 + ">=" + maxSize);

			stackSize[++head] = data;
		}

		public Object peek() {
			if (isEmpty())
				throw new IndexOutOfBoundsException(head);

			return stackSize[head];
		}

		public Object pop() {
			Object data = peek();
			head--;
			return data;
		}
	
}
