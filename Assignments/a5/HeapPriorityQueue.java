/*
* HeapPriorityQueue.java
*
* An implementation of a minimum PriorityQueue using a heap.
* based on the implementation in "Data Structures and Algorithms
* in Java", by Goodrich and Tamassia
*
* This implementation will throw a Runtime, HeapEmptyException
*	if the heap is empty and removeMin is called.
*
* This implementation will throw a Runtime, HeapFullException
*	if the heap is full and insert is called.
*
*/
public class HeapPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T> {

	protected final static int DEFAULT_SIZE = 10000;
	
	protected T[] storage;
	protected int currentSize;
	
	// Feel free to change rootIndex to 0 if you want to 
	// use 0-based indexing (either option is fine)
	private static final int rootIndex = 1;

	/*
	 * Constructor that initializes the array to hold DEFAULT_SIZE elements
	 */
	@SuppressWarnings({"unchecked"})
	public HeapPriorityQueue(Class<T> dataType) {
		// Creating generics arrays in Java is not very clean. The following 
		// two lines allocate the generic array for you based on whether you
		// have selected to store the root at index 0 or 1 above.
		if (rootIndex == 0) {
			storage = (T[]) java.lang.reflect.Array.newInstance(dataType, DEFAULT_SIZE);
		} else {
			storage = (T[]) java.lang.reflect.Array.newInstance(dataType, DEFAULT_SIZE+1);
		}
		currentSize = 0;
	}
	
	/*
	 * Constructor that initializes the array to hold size elements
	 */
	@SuppressWarnings({"unchecked"})
	public HeapPriorityQueue(Class<T> clazz, int size) {
		// Creating generics arrays in Java is not very clean. The following 
		// two lines allocate the generic array for you based on whether you
		// have selected to store the root at index 0 or 1 above.
		if (rootIndex == 0) {
			storage = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
		} else {
			storage = (T[]) java.lang.reflect.Array.newInstance(clazz, size+1);
		}
		currentSize = 0;
	}

	public void insert (T element) throws HeapFullException {
		if (isFull()) {
			throw new HeapFullException();
		}
		currentSize++;
		storage[currentSize] = element;
		bubbleUp(currentSize);
		
		// When inserting the first element, choose whether to use 
		// a 0-based on 1-based implementation. (By default, the root
		// index is set to 1 for you above. Whatever you choose,
		// make sure your implementation for the rest of the program
		// is consistent with this choice.		
    }

	private void swap(int a, int b){
		T temp = storage[a];
		storage[a] = storage[b];
		storage[b] = temp;
	}
	
	private void bubbleUp(int index) {
		// TODO: implement this
	}
			
	public T removeMin() throws HeapEmptyException {
		if (isEmpty()) {
			throw new HeapEmptyException();
		}
		T min = storage[rootIndex];
		storage[rootIndex] = storage[currentSize];
		currentSize--;
		bubbleDown(rootIndex);
		return min;
	}
	
	private void bubbleDown(int index) {
		while (!isLeaf(index)) {
			int minChildIndex = minChildIndex(index);
			if (storage[index].compareTo(storage[minChildIndex]) <= 0) {
				break;
			}
			swap(index, minChildIndex);
			index = minChildIndex;
		}
	}

	public boolean isEmpty(){
		int max;
		if (rootIndex == 0) {
			max = storage.length;
		} else {
			max = storage.length - 1;
		}
		return currentSize == max;
	}
	
	public boolean isFull() {
		// TODO: implement this
		
		return false; // so it compiles
	}

	private boolean isLeaf(int index) {
		return index > currentSize / 2;
	}
	
	private int minChildIndex(int index) {
		int leftChildIndex = 2 * index;
		int rightChildIndex = 2 * index + 1;
		
		if (rightChildIndex > currentSize) {
			return leftChildIndex;
		} else {
			return (storage[leftChildIndex].compareTo(storage[rightChildIndex]) < 0) ? leftChildIndex : rightChildIndex;
		}
	}
	
	public int size () {

		
		return currentSize; // so it compiles
	}
	
	// FOR DEBUGGING:
	public String toString() {
		String s = "";
		String sep = "";
		if (rootIndex == 0) {
			for (int i = 0; i < currentSize; i++) {
				s += sep + storage[i];
				sep = " ";				
			}
		} else if (rootIndex == 1) {
			for(int i=1; i<=currentSize; i++) {
				s += sep + storage[i];
				sep = " ";
			}
		}
		return s;
	}
}
