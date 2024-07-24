public class QueueRefBased implements Queue {

	private QueueNode front;
	private QueueNode back;
	// no numElements for this implementation

	public QueueRefBased() {
		front = null;
		back = null;
	}

	public int size() {
		int count = 0;
		QueueNode cur = front;
		while(cur!=null){
			count++;
			cur=cur.next;
		}		
		return count;			
	}

	public boolean isEmpty() {
		return front==null;
	}

	public void enqueue (int value) {
		if(isEmpty()){
			front = new QueueNode(value);
			back = front;
		}else{
			back.next = new QueueNode(value);
			back = back.next;
		}
	}

	public int dequeue() {
		int removedVal = front.getValue();
		if(size()>1){
			front = front.getNext();
		}else{
			makeEmpty();
		}
		return removedVal;
		
	}

	public int peek()  {
		return front.getValue(); 
	}

	public void makeEmpty() {
		front=null;
		back=null;
	}
}
