/*
 * Lab1Part2Tester.java
 *
 * A tester for the methods in your Student class
 *
 */
public class Lab1Part2Tester {

	public static void main(String[] args) {
		testConstructorsAndGetters();
		testSettersAndGetters();
		testToString();
	}

	public static void testConstructorsAndGetters() {


		// 1)
		// Tests constructor with no arguments, getSID and getGrade
		// TODO: once you have completed the getSID and getGrade methods
		// uncomment the following to test your implementation
	
	
		Student s1 = new Student();
		System.out.println("sID of student with default constructor: " + s1.getSID());
		System.out.println("grade of student with default constructor: " + s1.getGrade());

		Student s2 = new Student("V00923094", 85);
		System.out.println("sID of student with custom constructor: " + s2.getSID());
		System.out.println("grade of student with custom constructor: " + s2.getGrade());

		
	}

	public static void testSettersAndGetters(){

		// 2) 
		// TODO: implement and then call the setSID and setGrade methods
		// Hint: use getSID and getGrade methods to get the updated values
		
		System.out.println("\nOriginal information for student:");
		Student s2 = new Student("V00923094", 85);
		System.out.println("sID of student: " + s2.getSID());
		System.out.println("grade of student: " + s2.getGrade());
		
		// change the sID and/or the grade for student s2 here
		s2.setGrade(40);
		s2.setSID("V00962304");
		System.out.println("\nUpdated information for student:");
		System.out.println("updated sID of student: " + s2.getSID());
		System.out.println("updated grade of student: " + s2.getGrade());

		
	}

	public static void testToString() {
		Student s2 = new Student("V000001", 80);
		System.out.println("testing to string, expecting V000001 - 80");
		System.out.println(s2.toString());
	}
}
