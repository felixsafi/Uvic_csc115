public class A4Exercises {

	// PART 1

	/*
	 * Purpose: get a count of the number of odd values in the array
	 * Parameters: int[] arr
	 * Returns: int - the number of odd-valued elements
	 * Post-condition - the array contents are unchanged
	 */
	public static int countOdd(int[] arr) {
		return countOddRecur(arr, 0);
	}

	public static int countOddRecur(int[] arr, int start){
		if (start>=arr.length) return 0;
		return ((arr[start]%2!=0)? 1 : 0) + countOddRecur(arr, start+1);
	}
	
	/*
	 * Purpose: add x to all values in the given array
	 * Parameters: int[] array - the array to modify
	 *             int x - the value to add to all elements
	 * Returns: void - nothing
	 */
	public static void addXToAll(int[] array, int x) {
		addXAllRecur(array, x, 0);
	}

	public static void addXAllRecur(int[] array, int x, int start){
		if (start>=array.length) return;
		array[start]+=x;
		addXAllRecur(array, x, start+1);
	}
	
	/*
	 * Purpose: get the minimum value found in the array
	 * Parameters: int[] array - the array to search
	 * Returns: int - minimum value found in the array
	 *                or -1 if the array is empty
	 * Post-condition - the array contents are unchanged
	 */
	public static int getMinimum(int[] array) {
		return getMinRec(array, 0);
	}

	public static int getMinRec(int[] array, int start){
		if (start>=array.length) return 0;
		return Math.min(array[start], getMinRec(array, start+1));
	}
	
	/*
	 * Purpose: determines if there is at least one occurrence of x
	 *          before the first occurrence of y in the array
	 * Parameters: int[] array - the array to search
	 *             int x - the value that must come first
	 *             int y - the value that must come second
	 * Returns: boolean - true if there is at least one occurrence
	 *                    of x before the first occurrence of y
	 */
	public static boolean comesBefore(int[] array, int x, int y) {
		// TODO: implement this
		return false; // so it compiles
	}
	


	/////////////
	// PART II //
	/////////////
	
	/*
	 * Purpose: get the total number of groceries in s
	 * Parameters: Stack<GroceryItem> s - the stack of groceries
	 * Returns: int - the total number of groceries
	 * Post-condition: s is not modified
	 */
	public static int groceriesCount(Stack<GroceryItem> s) {
		// TODO: implement this
		return -1; // so it compiles
	}

	/*
	 * Purpose: get the total price of all grocery items
	 * Parameters: Stack<GroceryItem> s - the stack of groceries
	 * Returns: double - the total price of all items
	 * Post-condition: s is not modified
	 */
	public static double totalPrice(Stack<GroceryItem> s) {
		// TODO: implement this
		return -1.0; // so it compiles
	}
	
	/*
	 * Purpose: get the average price of the grociery items in s
	 * Parameters: Stack<GroceryItem> s - the stack of groceries
	 * Returns: double - the average price of the groceries
	 *                   0.0 if there are no groceries in s
	 * Post-condition: s is not modified
	 */
	public static double averagePrice(Stack<GroceryItem> s) {
		// TODO: implement this
		return -1.0; // so it compiles
	}

	/*
	 * Purpose: determine whether toFind is contained in s
	 * Parameters: Stack<GroceryItem> s - the stack of groceries
	 *             GroceryItem toFind - the grocery item to search for
	 * Returns: boolean - true if s contains toFind, false otherwise
	 * Post-condition: s is not modified
	 */
	public static boolean containsItem(Stack<GroceryItem> s, GroceryItem toFind) {
		// TODO: implement this
		return false; // so it compiles
	}

	/*
	 * Purpose: determine the grocery items in s are stacked correctly
	 *          (ie. there is never a grocery item stacked on top of 
	 *               another item that weighs LESS than it does)
	 * Parameters: Stack<GroceryItem> s - the stack of grocery items
	 * Returns: boolean - true if groceries in s are stacked correctly
	 * Post-condition: s is not modified
	 */
	public static boolean stackedCorrectly(Stack<GroceryItem> s) {
		// TODO: implement this
		return false; // so it compiles
	}

}