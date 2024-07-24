public class StudentLinkedList implements StudentList {

	StudentNode head;
	int count;

	public StudentLinkedList() {
		head = null;
		count = 0;
	}

	public void add(Student s) {
		if(this.head==null){
			head = new StudentNode(s);
			count++;
		}else{
			StudentNode cur = head;
			while(cur.getNext()!=null){
				cur = cur.getNext();
			}
			cur.setNext(new StudentNode(s));
			count++;
		}

	}

	public int size() {
		return count;
	}

	public void removeFront() {
		if(count!=0){
			head = head.getNext();
			count--;
		}
	}

	public boolean contains(Student s) {
		if(count!=0){
			StudentNode cur = head;
			while(cur!=null){
				if(cur.getData().equals(s)){
					return true;
				}
				cur = cur.getNext();
			}
		}
		return false;
	}
	
	/*
	 * Purpose: returns a String reprensentation of elements
	 *      in this list separated by newlines
	 * Parameters: none
	 * Returns: String - the representation
	 */
	public String toString() {
		// DO NOT CHANGE THIS METHOD - it is correct
		// Changing it will result in your code getting
		// a score of 0 from the autograder for this lab
		
		String s = "";
		StudentNode tmp = head;

		while(tmp != null) {
			s  += tmp.getData() + "\n";
			tmp = tmp.next;
		}

		return s;
	}
}
