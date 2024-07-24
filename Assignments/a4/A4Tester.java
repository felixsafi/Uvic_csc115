import java.util.Arrays;

public class A4Tester {
	
	private static int testPassCount = 0;
	private static int testCount = 0;
	private static double THRESHOLD = 0.1; // allowable margin of error for floating point results
	
    public static void main(String[] args) {
		
		/* PART I
		   implement and test each of the following methods
		   found in A4Exercises.java, one at a time */
		
		testCountOdd();
		testAddXToAll();
		testGetMinimum();
		testComesBefore();

		/* PART II:
		   implement and test each of the following methods
		   found in A4Exercises.java, one at a time.
		   Documentation can be found in Stack.java */

		testGroceriesCount();
		testTotalPrice();
		testAveragePrice();
		testContainsItem();
		testStackedCorrectly();
		
		System.out.println("Passed " + testPassCount + " / " + testCount + " tests");
	}

	public static void testCountOdd() {
		System.out.println("\nStarting countOdd tests");
		
		int[] arr0 = {};
		int[] arr1 = {5};
		int[] arr2 = {2, 8};
		int[] arr3 = {9, 16, 12, 4, 5, 24, 60};
		
		int result = 0;
		int expected = 0;
		
		result = A4Exercises.countOdd(arr0);
		expected = 0;
		displayResults(result==expected, "countOdd in empty array");

		result = A4Exercises.countOdd(arr1);
		expected = 1;
		displayResults(result==expected, "countOdd in arr1");
		
		result = A4Exercises.countOdd(arr2);
		expected = 0;
		displayResults(result==expected, "countOdd in arr2");

		result = A4Exercises.countOdd(arr3);
		expected = 2;
		displayResults(result==expected, "countOdd in arr3");
		
		// TODO: add more tests here
		
	}

	public static void testAddXToAll() {
		System.out.println("\nStarting addXToAll tests");
		
		int[] arr0 = {};
		int[] arr1 = {7, 1, 3};
		
		int[] expected0  = {};
		int[] expected1a = {9, 3, 5};
		
		A4Exercises.addXToAll(arr0, 5);
		displayResults(Arrays.equals(arr0, expected0), "add 5 to all values in empty array");
		
		A4Exercises.addXToAll(arr1, 2);
		displayResults(Arrays.equals(arr1, expected1a), "add 2 to all values in arr1");
		
		// TODO: add more tests here
		
	}
	
	public static void testGetMinimum() {
		System.out.println("\nStarting getMinimum tests");
		int[] arr0 = {};
		int[] arr1 = {7};
		int[] arr2 = {7, 8};
		int[] arr3 = {8, 7};
		int[] arr4 = {1, 2, 3, 4, 5};
		int[] arr5 = {9, 8, 7, 6, 5};
		
		int result = 0;
		int expected = 0;
		
		result = A4Exercises.getMinimum(arr0);
		expected = -1;
		displayResults(result==expected, "minimum of empty array");
		
		result = A4Exercises.getMinimum(arr1);
		expected = 7;
		displayResults(result==expected, "minimum of arr1");
		
		result = A4Exercises.getMinimum(arr2);
		expected = 7;
		displayResults(result==expected, "minimum of arr2");
		
		result = A4Exercises.getMinimum(arr3);
		expected = 7;
		displayResults(result==expected, "minimum of arr3");
		
		result = A4Exercises.getMinimum(arr4);
		expected = 1;
		displayResults(result==expected, "minimum of arr4");
		
		result = A4Exercises.getMinimum(arr5);
		expected = 5;
		displayResults(result==expected, "minimum of arr5");
		
		// TODO: add more tests here

	}
	
	public static void testComesBefore() {
		System.out.println("\nStarting comesBefore tests");
		int[] arr0 = {};
		int[] arr1 = {7};
		int[] arr2 = {7, 8};
		int[] arr3 = {3, 4, 3};
		int[] arr4 = {1, 2, 1, 1, 3, 4, 4, 4, 3};
		
		boolean result = false;
		boolean expected = false;
		
		result = A4Exercises.comesBefore(arr0, 7, 8);
		expected = false;
		displayResults(result==expected, "a 7 comes before first 8 in empty array");
		
		result = A4Exercises.comesBefore(arr1, 7, 8);
		expected = false;
		displayResults(result==expected, "a 7 comes before first 8 in arr1");
		
		result = A4Exercises.comesBefore(arr2, 7, 8);
		expected = true;
		displayResults(result==expected, "a 7 comes before first 8 in arr2");
		
		result = A4Exercises.comesBefore(arr2, 8, 9);
		expected = false;
		displayResults(result==expected, "an 8 comes before first 9 in arr2");
		
		result = A4Exercises.comesBefore(arr2, 6, 7);
		expected = false;
		displayResults(result==expected, "a 6 comes before first 7 in arr2");
		
		result = A4Exercises.comesBefore(arr3, 3, 4);
		expected = true;
		displayResults(result==expected, "a 3 comes before first 4 in arr3");
		
		result = A4Exercises.comesBefore(arr3, 4, 3);
		expected = false;
		displayResults(result==expected, "a 4 comes before first 3 in arr3");
		
		// TODO: add more tests here
		
	}
	
	public static void testGroceriesCount() {
		System.out.println("\nStarting groceriesCount tests");
		
		GroceryItem g1 = new GroceryItem("coffee beans", 20.00, 9);
		GroceryItem g2 = new GroceryItem("cheese", 35.00, 10);
		GroceryItem g3 = new GroceryItem("ground beef", 12.50, 12);
		GroceryItem g4 = new GroceryItem("chocolate bar", 1.99, 1);
		GroceryItem g5 = new GroceryItem("apples", 3.25, 4);
		GroceryItem g6 = new GroceryItem("flour", 8.99, 15);
		
		GroceryItem[] arr1 = {g1};
		GroceryItem[] arr2 = {g1, g2, g3};
		GroceryItem[] arr3 = {g1, g2, g3, g4, g5, g6};
		
		A4Stack<GroceryItem> s0 = new A4Stack<GroceryItem>();
		A4Stack<GroceryItem> s1 = new A4Stack<GroceryItem>(arr1);
		A4Stack<GroceryItem> s2 = new A4Stack<GroceryItem>(arr2);
		A4Stack<GroceryItem> s3 = new A4Stack<GroceryItem>(arr3);
		
		int result = 0;
		int expected = 0;
		
		result = A4Exercises.groceriesCount(s0);
		expected = 0;
		displayResults(result==expected, "total items in empty stack");
		
		result = A4Exercises.groceriesCount(s1);
		expected = 1;
		displayResults(result==expected, "total items in s1");
		displayResults(s1.toString().equals(Arrays.toString(arr1)), "stack contents unchanged");
		// System.out.println(s1);
		
		result = A4Exercises.groceriesCount(s2);
		expected = 3;
		// System.out.println(result);
		displayResults(result==expected, "total items in s2");
		displayResults(s2.toString().equals(Arrays.toString(arr2)), "stack contents unchanged");
		
		result = A4Exercises.groceriesCount(s3);
		expected = 6;
		// System.out.println(result);
		displayResults(result==expected, "total items in s3");	
		displayResults(s3.toString().equals(Arrays.toString(arr3)), "stack contents unchanged");
		
		// TODO: add more tests here
			
	}
	
	public static void testTotalPrice() {
		System.out.println("\nStarting totalPrice tests");
		
		GroceryItem g1 = new GroceryItem("coffee beans", 20.00, 9);
		GroceryItem g2 = new GroceryItem("cheese", 35.00, 10);
		GroceryItem g3 = new GroceryItem("ground beef", 12.50, 12);
		GroceryItem g4 = new GroceryItem("chocolate bar", 1.99, 1);
		GroceryItem g5 = new GroceryItem("apples", 3.25, 4);
		GroceryItem g6 = new GroceryItem("flour", 8.99, 15);
		
		GroceryItem[] arr1 = {g1};
		GroceryItem[] arr2 = {g1, g2, g3};
		GroceryItem[] arr3 = {g1, g2, g3, g4, g5, g6};
		
		A4Stack<GroceryItem> s0 = new A4Stack<GroceryItem>();
		A4Stack<GroceryItem> s1 = new A4Stack<GroceryItem>(arr1);
		A4Stack<GroceryItem> s2 = new A4Stack<GroceryItem>(arr2);
		A4Stack<GroceryItem> s3 = new A4Stack<GroceryItem>(arr3);
		
		double result = 0.0;
		double expected = 0.0;
		
		result = A4Exercises.totalPrice(s0);
		expected = 0;
		displayResults(Math.abs(result-expected)<THRESHOLD, "total price in empty stack");
		
		result = A4Exercises.totalPrice(s1);
		expected = 20.00;
		displayResults(Math.abs(result-expected)<THRESHOLD, "total price in s1");
		displayResults(s1.toString().equals(Arrays.toString(arr1)), "stack contents unchanged");
		
		result = A4Exercises.totalPrice(s2);
		expected = 20.00 + 35.00 + 12.50;
		// System.out.println(result);
		displayResults(Math.abs(result-expected)<THRESHOLD, "total price in s2");
		displayResults(s2.toString().equals(Arrays.toString(arr2)), "stack contents unchanged");
		
		result = A4Exercises.totalPrice(s3);
		expected = 20.00 + 35.00 + 12.50 + 1.99 + 3.25 + 8.99;
		// System.out.println(result);
		displayResults(Math.abs(result-expected)<THRESHOLD, "total price in s3");	
		displayResults(s2.toString().equals(Arrays.toString(arr2)), "stack contents unchanged");
		
		// TODO: add more tests here
	}
	
	public static void testAveragePrice() {
		System.out.println("\nStarting averagePrice tests");
		
		GroceryItem g1 = new GroceryItem("coffee beans", 20.00, 9);
		GroceryItem g2 = new GroceryItem("cheese", 35.00, 10);
		GroceryItem g3 = new GroceryItem("ground beef", 12.50, 12);
		GroceryItem g4 = new GroceryItem("chocolate bar", 1.99, 1);
		GroceryItem g5 = new GroceryItem("apples", 3.25, 4);
		GroceryItem g6 = new GroceryItem("flour", 8.99, 15);
		
		GroceryItem[] arr1 = {g1};
		GroceryItem[] arr2 = {g1, g2, g3};
		GroceryItem[] arr3 = {g1, g2, g3, g4, g5, g6};
		
		A4Stack<GroceryItem> s0 = new A4Stack<GroceryItem>();
		A4Stack<GroceryItem> s1 = new A4Stack<GroceryItem>(arr1);
		A4Stack<GroceryItem> s2 = new A4Stack<GroceryItem>(arr2);
		A4Stack<GroceryItem> s3 = new A4Stack<GroceryItem>(arr3);
		
		double result = 0.0;
		double expected = 0.0;
		
		result = A4Exercises.averagePrice(s0);
		expected = 0.0;
		displayResults(Math.abs(result-expected)<THRESHOLD, "average price in empty stack");
		
		result = A4Exercises.averagePrice(s1);
		expected = 20.00/1.0;
		displayResults(Math.abs(result-expected)<THRESHOLD, "average price in s1");
		displayResults(s1.toString().equals(Arrays.toString(arr1)), "stack contents unchanged");
		
		result = A4Exercises.averagePrice(s2);
		expected = (20.00 + 35.00 + 12.50)/3.0;
		// System.out.println(result);
		displayResults(Math.abs(result-expected)<THRESHOLD, "average price in s2");
		displayResults(s2.toString().equals(Arrays.toString(arr2)), "stack contents unchanged");
		
		result = A4Exercises.averagePrice(s3);
		expected = (20.00 + 35.00 + 12.50 + 1.99 + 3.25 + 8.99)/6.0;
		// System.out.println(result);
		displayResults(Math.abs(result-expected)<THRESHOLD, "average price in s3");	
		displayResults(s3.toString().equals(Arrays.toString(arr3)), "stack contents unchanged");
		
		// TODO: add more tests here
	}
	
	public static void testContainsItem() {
		System.out.println("\nStarting containsItem tests");
		
		GroceryItem g1 = new GroceryItem("coffee beans", 20.00, 9);
		GroceryItem g2 = new GroceryItem("cheese", 35.00, 10);
		GroceryItem g3 = new GroceryItem("ground beef", 12.50, 12);
		GroceryItem g4 = new GroceryItem("chocolate bar", 1.99, 1);
		GroceryItem g5 = new GroceryItem("apples", 3.25, 4);
		GroceryItem g6 = new GroceryItem("flour", 8.99, 15);
		
		GroceryItem[] arr1 = {g1};
		GroceryItem[] arr2 = {g1, g2, g3};
		
		A4Stack<GroceryItem> s0 = new A4Stack<GroceryItem>();
		A4Stack<GroceryItem> s1 = new A4Stack<GroceryItem>(arr1);
		A4Stack<GroceryItem> s2 = new A4Stack<GroceryItem>(arr2);
		String s0Contents = s0.toString();
		String s1Contents = s1.toString();
		String s2Contents = s2.toString();
		
		boolean result = false;
		boolean expected = false;
		
		result = A4Exercises.containsItem(s0, g1);
		expected = false;
		displayResults(result==expected, "empty stack contains g1");
		
		result = A4Exercises.containsItem(s1, g1);
		expected = true;
		displayResults(result==expected, "s1 contains g1");
		displayResults(s1Contents.equals(s1.toString()), "stack unchanged");
		
		result = A4Exercises.containsItem(s1, g2);
		expected = false;
		displayResults(result==expected, "s1 contains g2");
		displayResults(s1Contents.equals(s1.toString()), "stack unchanged");
		
		result = A4Exercises.containsItem(s2, g1);
		expected = true;
		displayResults(result==expected, "s2 contains g1");
		displayResults(s2Contents.equals(s2.toString()), "stack unchanged");
		
		result = A4Exercises.containsItem(s2,g3);
		expected = true;
		displayResults(result==expected, "s2 contains g3");
		displayResults(s2Contents.equals(s2.toString()), "stack unchanged");
		
		result = A4Exercises.containsItem(s2, g4);
		expected = false;
		displayResults(result==expected, "s2 contains g4");
		displayResults(s2Contents.equals(s2.toString()), "stack unchanged");
		
		// TODO: add more tests here
		
	}
	
	public static void testStackedCorrectly() {
		System.out.println("\nStarting stackedCorrectly tests");
		
		GroceryItem g1 = new GroceryItem("coffee beans", 20.00, 9);
		GroceryItem g2 = new GroceryItem("cheese", 35.00, 10);
		GroceryItem g3 = new GroceryItem("ground beef", 12.50, 12);
		GroceryItem g4 = new GroceryItem("chocolate bar", 1.99, 1);
		GroceryItem g5 = new GroceryItem("apples", 3.25, 4);
		GroceryItem g6 = new GroceryItem("flour", 8.99, 15);
		
		GroceryItem[] arr1 = {g1}; // trivially correct
		GroceryItem[] arr2 = {g1, g2}; // stacked correctly
		GroceryItem[] arr3 = {g2, g1};
		
		A4Stack<GroceryItem> s0 = new A4Stack<GroceryItem>();
		A4Stack<GroceryItem> s1 = new A4Stack<GroceryItem>(arr1);
		A4Stack<GroceryItem> s2 = new A4Stack<GroceryItem>(arr2);
		A4Stack<GroceryItem> s3 = new A4Stack<GroceryItem>(arr3);
		String s0Contents = s0.toString();
		String s1Contents = s1.toString();
		String s2Contents = s2.toString();
		String s3Contents = s3.toString();
			
		boolean result = false;
		boolean expected = false;
		
		result = A4Exercises.stackedCorrectly(s0);
		expected = true;
		displayResults(result==expected, "empty stack stacked correctly");
		displayResults(s0Contents.equals(s0.toString()), "stack unchanged");
		
		result = A4Exercises.stackedCorrectly(s1);
		expected = true;
		displayResults(result==expected, "s1 stacked correctly");
		displayResults(s1Contents.equals(s1.toString()), "stack unchanged");
		
		result = A4Exercises.stackedCorrectly(s2);
		expected = true;
		displayResults(result==expected, "s2 stacked correctly");
		displayResults(s2Contents.equals(s2.toString()), "stack unchanged");

		result = A4Exercises.stackedCorrectly(s3);
		expected = false;
		displayResults(result==expected, "s3 stacked correctly");
		displayResults(s3Contents.equals(s3.toString()), "stack unchanged");

		// TODO: add more tests here
		
	}
	
	public static void displayResults (boolean passed, String testName) {
		testCount++;
		if (passed) {
			System.out.println ("Passed test: " + testName);
			testPassCount++;
		} else {
			System.out.println ("Failed test: " + testName + " at line "
				+ Thread.currentThread().getStackTrace()[2].getLineNumber());
		}
    }
}