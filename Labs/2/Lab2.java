/*
 * Lab2.java
 *
 * A class of static methods that operate on Students
 *
 */

//student object name points to where things are stored, and holds an adress
//if no toString method prints the memory adress when using print.out
//but uses the tostring otherwise
// making one object equal to another makes that object point to the other
//built in garbage collector removes the original info b/c nothing pointing to it
public class Lab2 {
    
	/*
	 * Purpose: determines which student has the higher grade
	 * Parameters: Student - s1, Student - s2
	 * Returns: Student - the Student with the higher grade,
	 *                    s1 if they have the same grade
	 * Precondition: s1 and s2 are not null
	 */
	public static Student getHigherGradeStudent(Student s1, Student s2) {
		if(s2.getGrade()>s1.getGrade()){
			return s2;
		}
		return s1;
	}


	/*
	 * Purpose: determines whether the grade of Student s
	 *          is above the threshold
	 * Parameters: Student - s, int - threshold
	 * Returns: boolean - true if grade is above threshold, false otherwise
	 * Preconditions: s is not null
	 */
	public static boolean isGradeAbove(Student s, int threshold){
		if(s.getGrade()>threshold){
			return true;
		}
		return false;
	}



	/*
	 * Purpose: creates an array sIDs of all Students in students
	 * Parameters: Student[] - students
	 * Returns: String[] - array of sIDs
	 * Preconditions: students is not null and contains no null elements
	 */
	// TODO: implement getClasslist
	public static String[] getClassList(Student[] students){
		String classList[] = new String[students.length];
		for(int i=0; i<students.length;i++){
			classList[i] = students[i].getSID();
		}
		return classList;
	}


	/*
	 * Purpose: counts the number of Students in students
	 *          with grade above threshold
	 * Parameters: Student[] - students, int - threshold
	 * Returns: int - the number of students with a grade above threshold
	 * Preconditions: students is not null and contains no null elements
	 */
	// TODO: implement countAbove
	// HINT: you should be using the isGradeAbove method!
	public static int countAbove (Student[] students, int threshold){
		int numberAbove = 0;
		for(int i=0; i<students.length;i++){
			if(isGradeAbove(students[i], threshold)){
				numberAbove++;
			}
		}
		return numberAbove;
	}


	/*
	 * Purpose: calculates the average grade of Students in students,
	 *          does NOT include students with -1 grade in calculation
	 *          average is 0.0 if students is empty or all students have -1 grade
	 * Parameters: Student[] - students
	 * Returns: double - the average grade
	 * Preconditions: students is not null and contains no null elements
	 */
	// TODO: implement getClassAverage
	// HINT: you can use the isGradeAbove method again
	public static double getClassAverage(Student[] students){
		double avg = 0.0;
		int n=0;
		for(int i=0; i<students.length;i++){
			if(students[i].getGrade()!=-1){
				avg+=students[i].getGrade();
				n++;
			}
		}
		if(n>0){
			return avg/n;
		}
		return avg;
	}



	/*
	 * Purpose: creates a new array 1 longer than students
	 *          and adds all students and s to the new array
	 * Parameters: Student[] - students, Student s
	 * Returns: Student[] - the new array
	 * Preconditions: students is not null and contains no null elements
	 *                Student s is not already contained within students
	 */
	// TODO: implement registerStudent
	public static Student[] registerStudent(Student[] students, Student s){
		Student[] newArray = new Student[students.length+1];
		// if(students.length!=0){
			for(int i=0;i<students.length;i++){
				newArray[i] = students[i];
			}
			newArray[newArray.length-1] = s;
		// }else{
		// 	Student[] newArray = {s};
		// }
		
		return newArray;
	}

}
