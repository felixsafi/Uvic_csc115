public class A4Stack<T> implements Stack<T> {
	
	private A4Node<T> head;

	public A4Stack() {
		head = null;
	}
	
	public void push(T value) {
		A4Node<T> n = new A4Node<T>(value);
		n.next = head;
		head = n;
	}
	
	public T pop() {
		if (isEmpty()) {
			return null;
		} else {
			T toReturn = head.getData();
			head = head.next;
			return toReturn;
		} 		
	}
	
	public T top() {
		if (isEmpty()) {
			return null;
		} else {
			return head.getData();
		} 	
	}
	
	public void popAll() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	
	
	/************
	 FOR TESTING
	************/
	
	// Create a stack from an array of items
	public A4Stack (T[] array) {
		head = null;
		for (int i = array.length-1; i >= 0; i--) {
			push(array[i]);
		}
	}
	
	public String toString() {
		if (isEmpty()) { 
			return "[]";
		}
		String s = "[";
		A4Node<T> cur = head;
		while (cur.next != null) {
			s += cur.getData().toString() + ", ";
			cur = cur.next;
		}
		s += cur.getData().toString() + "]";
		return s;
	}
	
}