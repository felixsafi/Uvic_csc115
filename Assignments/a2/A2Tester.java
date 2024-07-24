public class A2Tester {
	
	private static int testPassCount = 0;
	private static int testCount = 0;
	private static double THRESHOLD = 0.1; // allowable margin of error for floating point results
	
	
	public static void main(String[] args) {
		/* Tests for methods inside Team.java */
		testPlayerConstructor();
		testTotalFans();
		testGetYoungest();
		testGetPlayer();
		testGoingViral();
		
		/* Tests for methods inside A2Exercises.java */
		testMoreFans();
		testCountAbove();
		testCountWithName();
		testAverageYoungestAge();
		testMostFans();
		
		System.out.println();
		System.out.println("PASSED " +testPassCount+ " / " +testCount+ " TESTS");
	}
	
	public static void testPlayerConstructor() {
		Player p1 = new Player("Parzival", 18, 31337);
		Player p2 = new Player("Jordan",   23, 32292);
		Player p3 = new Player("Serena",   41, 42280);		 
		Player p4 = new Player("The Rock", 50, 80000);
		Player p5 = new Player("Ninja",    31, 180000);
		
		String result = "";
		String expected = "";
		
		result = p1.toString();
		
		// Test failing? output the value returned to help debug
		// System.out.println(result);
		expected = "Name: Parzival, age: 18, fans: 31337";
		displayResults(result.equals(expected), "p1 fields initialized correctly");
		
		result = p2.toString();
		expected = "Name: Jordan, age: 23, fans: 32292";
		displayResults(result.equals(expected), "p2 fields initialized correctly");
		
		result = p3.toString();
		expected = "Name: Serena, age: 41, fans: 42280";
		displayResults(result.equals(expected), "p3 fields initialized correctly");
		
		result = p4.toString();
		expected = "Name: The Rock, age: 50, fans: 80000";
		displayResults(result.equals(expected), "p4 fields initialized correctly");
		
		result = p5.toString();
		expected = "Name: Ninja, age: 31, fans: 180000";
		displayResults(result.equals(expected), "p5 fields initialized correctly");
		
	}
	
	public static void testTotalFans() {
		System.out.println("\nTesting totalFans");
		Player p1 = new Player("Parzival", 18, 31337);
		Player p2 = new Player("Jordan",   23, 32292);
		Player p3 = new Player("Serena",   41, 42280); 
		Player p4 = new Player("The Rock", 50, 80000);
		Player p5 = new Player("Ninja",    31, 180000);
		Player p6 = new Player("Taylor",   23, 45000);
		Player p7 = new Player("Voldemort",71, 99);
		
		Player[] empty = {};
		Player[] arr1 = {p1, p2};
		Player[] arr2 = {p5, p3, p6, p1};
		Player[] arr3 = {p6, p7, p2, p3};
		Player[] arr4 = {p7, p2, p5, p6, p4, p3};
		
		Team t0 = new Team("Rivals",   empty);
		Team t1 = new Team("Champions", arr1);
		Team t2 = new Team("Gunters",   arr2);
		Team t3 = new Team("Gamers",    arr3);
		Team t4 = new Team("Vikes",     arr4);
		
		int result = 0;
		int expected = 0;
		
		result = t0.totalFans();
		expected = 0;
		displayResults(result==expected, "total fans of t0");
		
		result = t1.totalFans();
		// Test failing? output the value returned to help debug
		// System.out.println(result);
		expected = 31337 + 32292;
		displayResults(result==expected, "total fans of t1");
		
		result = t2.totalFans();
		expected = 180000 + 42280 + 45000 + 31337;
		displayResults(result==expected, "total fans of t2");

		result = t3.totalFans();
		expected = 119671;
		displayResults(result==expected, "total fans of t3");

		result = t0.totalFans();
		expected = 0;
		displayResults(result==expected, "total fans of t0");

		
		// TODO: Write additional tests here
		
	}
	
	public static void testGetYoungest() {
		System.out.println("\nTesting getYoungest");
		Player p1 = new Player("Parzival", 18, 31337);
		Player p2 = new Player("Jordan",   23, 32292);
		Player p3 = new Player("Serena",   41, 42280); 
		Player p4 = new Player("The Rock", 50, 80000);
		Player p5 = new Player("Ninja",    31, 180000);
		Player p6 = new Player("Taylor",   23, 45000);
		Player p7 = new Player("Voldemort",71, 99);
		
		Player[] empty = {};
		Player[] arr1 = {p4, p7, p2, p6};
		Player[] arr2 = {p5, p3, p6, p1};
		
		Team t0 = new Team("Rivals",   empty);
		Team t1 = new Team("Champions", arr2);
		Team t2 = new Team("Gunters",   arr1);
		
		Player result = null;
		Player expected = null;
		
		result = t0.getYoungest();
		expected = null;
		displayResults(result==expected, "get youngest on t0");
		
		result = t1.getYoungest();
		// Test failing? output the value returned to help debug
		// System.out.println(result);
		expected = p1;
		displayResults(result.equals(expected), "get youngest on t1");
		
		result = t2.getYoungest();
		expected = p2;
		displayResults(result.equals(expected), "get youngest on t2");
		
		// TODO: Write additional tests here

	}
	
	public static void testGetPlayer() {
		System.out.println("\nTesting getPlayer");
		Player p1 = new Player("Parzival", 18, 31337);
		Player p2 = new Player("Jordan",   23, 32292);
		Player p3 = new Player("Serena",   41, 42280); 
		Player p4 = new Player("The Rock", 50, 80000);
		Player p5 = new Player("Ninja",    31, 180000);
		Player p6 = new Player("Taylor",   23, 45000);
		Player p7 = new Player("Voldemort",71, 99);
		Player p8 = new Player("Taylor",71, 99);
		
		Player[] empty = {};
		Player[] arr1 = {p1, p2};
		Player[] arr2 = {p8, p7, p5, p3, p6, p1};
		
		Team t0 = new Team("Rivals",   empty);
		Team t1 = new Team("Champions", arr1);
		Team t2 = new Team("Gunters",   arr2);
		
		Player result = null;
		Player expected = null;
		String target = null;
		
		target = new String("Anthony");
		result = t0.getPlayer(target);
		expected = null;
		displayResults(result==expected, "get player named "+target+" on t0");
		
		target = new String("Anthony");
		result = t1.getPlayer(target);
		expected = null;
		displayResults(result==expected, "get player named "+target+" on t1");
		
		target = new String("Parzival");
		result = t1.getPlayer(target);
		expected = p1;
		displayResults(result.equals(expected), "get player named "+target+" on t1");
		
		target = new String("Serena");
		result = t2.getPlayer(target);
		expected = p3;
		displayResults(result.equals(expected), "get player named "+target+" on t2");

		target = new String("Taylor");
		result = t2.getPlayer(target);
		expected = p8;
		displayResults(result.equals(expected), "get player named "+target+" on t2");


		
		// TODO: Write additional tests here
		
	}
	
	public static void testGoingViral() {
		System.out.println("\nTesting goingViral");

		Player p1 = new Player("Parzival", 18, 31337);
		Player p2 = new Player("Jordan",   23, 32292);
		Player p3 = new Player("Serena",   41, 42280); 
		Player p4 = new Player("The Rock", 50, 80000);
		Player p5 = new Player("Ninja",    31, 180000);
		Player p6 = new Player("Taylor",   23, 45000);
		Player p7 = new Player("Voldemort",71, 99);
		Player sameName1 = new Player("Parzival", 10, 99999);
		Player sameName2 = new Player("Parzival", 20, 10000);
		
		Player[] empty = {};
		Player[] arr1 = {p1, p2, sameName1};
		Player[] arr2 = {p5, p3, p6, p1};
		
		Team t0 = new Team("Rivals",   empty);
		Team t1 = new Team("Champions", arr1);
		Team t2 = new Team("Gunters",   arr2);
		
		int result = 0;
		int expected = 0;
		
		t0.goingViral("Parzival", 11);
		result = p1.getFans();
		expected = 31337;
		displayResults(result==expected, "addFans when player not found");
		
		t1.goingViral("Parzival", 11);
		result = p1.getFans();
		expected = 31348;
		displayResults(result==expected, "add 11 fans to " + p1);
		result = sameName1.getFans();
		expected = 99999;
		displayResults(result==expected, "addFans only modifies first match");
		result = p2.getFans();
		expected = 32292;
		displayResults(result==expected, "addFans does not modify others");
		
		t2.goingViral("The Rock", 2);
		result = p5.getFans();
		expected = 180000;
		displayResults(result==expected, "addFans does not modify others");
		t2.goingViral("Ninja", 2);
		result = p5.getFans();
		expected = 180002;
		displayResults(result==expected, "add 2 fans to " + p5);
		
		// TODO: Write additional tests here
		
	}
	
	public static void testMoreFans() {
		System.out.println("\nTesting moreFans");
		
		Player p1 = new Player("Parzival", 18, 31337);
		Player p2 = new Player("Jordan",   23, 32292);
		Player p3 = new Player("Serena",   41, 42280); 
		Player p4 = new Player("The Rock", 50, 32292);
		
		Player result = null;
		Player expected = null;
		
		result = A2Exercises.moreFans(p1, p2);
		expected = p2;
		displayResults(result.equals(expected), "moreFans(p1, p2)");
		
		result = A2Exercises.moreFans(p2, p1);
		expected = p2;
		displayResults(result.equals(expected), "moreFans(p2, p1)");
		
		result = A2Exercises.moreFans(p1, p3);
		expected = p3;
		displayResults(result.equals(expected), "moreFans(p1, p3)");
		
		// TODO: Write additional tests here
			
	}
	
	public static void testCountAbove() {
		System.out.println("\nTesting countAbove");
		
		Player p1 = new Player("Parzival", 18, 31337);
		Player p2 = new Player("Jordan",   23, 32292);
		Player p3 = new Player("Serena",   41, 42280); 
		Player p4 = new Player("The Rock", 50, 80000);
		Player p5 = new Player("Ninja",    31, 180000);
		Player p6 = new Player("Taylor",   23, 45000);
		Player p7 = new Player("Voldemort",71, 99);
		
		Player[] empty = {};
		Player[] arr1 = {p1, p2};
		Player[] arr2 = {p5, p3, p6, p1};
		Player[] arr3 = {p6, p7, p2, p3};
		Player[] arr4 = {p7, p2, p5, p6, p4, p3};
		
		Team t0 = new Team("Rivals",   empty);
		Team t1 = new Team("Champions", arr1);
		Team t2 = new Team("Gunters",   arr2);
		Team t3 = new Team("Gamers",    arr3);
		Team t4 = new Team("Vikes",     arr4);
		
		int result = 0;
		int expected = 0;
		
		result = A2Exercises.countAbove(t0, 5);
		expected = 0;
		displayResults(result==expected, "players in t0 with more than 5 fans");
		
		result = A2Exercises.countAbove(t1, 5);
		expected = 2;
		displayResults(result==expected, "players in t1 with more than 5 fans");
		
		result = A2Exercises.countAbove(t1, 31337);
		expected = 1;
		displayResults(result==expected, "players in t1 with more than 5 fans");
		
		// TODO: Write additional tests here
		
	}
	
	public static void testCountWithName() {
		System.out.println("\nTesting countWithName");
		
		Player p1 = new Player("Parzival", 18, 31337);
		Player p2 = new Player("Jordan",   23, 32292);
		Player p3 = new Player("Serena",   41, 42280); 
		Player p4 = new Player("The Rock", 50, 80000);
		Player p5 = new Player("Ninja",    31, 180000);
		Player p6 = new Player("Taylor",   23, 45000);
		Player p7 = new Player("Voldemort",71, 99);
		
		Player[] empty = {};
		Player[] arr1 = {p1, p2};
		Player[] arr2 = {p5, p3, p6, p1};
		Player[] arr3 = {p6, p7, p2, p3};
		Player[] arr4 = {p7, p2, p5, p6, p4, p3};
		
		Team t0 = new Team("Rivals",   empty);
		Team t1 = new Team("Champions", arr1);
		Team t2 = new Team("Gunters",   arr2);
		Team t3 = new Team("Gamers",    arr3);
		Team t4 = new Team("Vikes",     arr4);
		
		Team[] teams0 = {};
		Team[] teams1 = {t1};
		Team[] teams2 = {t1, t2};
		Team[] teams3 = {t1, t2, t3, t4};
		
		int result = 0;
		int expected = 0;
		String searchName = "";
		
		searchName = new String("Parzival");
		result = A2Exercises.countWithName(teams0, searchName);
		expected = 0;
		displayResults(result==expected, searchName+" on teams in teams0");
		
		result = A2Exercises.countWithName(teams1, searchName);
		expected = 1;
		displayResults(result==expected, searchName+" on teams in teams1");
		
		searchName = new String("Ninja");
		result = A2Exercises.countWithName(teams1, searchName);
		expected = 0;
		displayResults(result==expected, searchName+" on teams in teams1");
		
		result = A2Exercises.countWithName(teams3, searchName);
		expected = 2;
		displayResults(result==expected, searchName+" on teams in teams3");
		
		// TODO: Write additional tests here
		
	}
	
	public static void testAverageYoungestAge(){
		System.out.println("\nTesting averageYoungestAge");
		
		Player p1 = new Player("Parzival", 18, 31337);
		Player p2 = new Player("Jordan",   23, 32292);
		Player p3 = new Player("Serena",   41, 42280); 
		Player p4 = new Player("The Rock", 50, 80000);
		Player p5 = new Player("Ninja",    31, 180000);
		Player p6 = new Player("Taylor",   23, 45000);
		Player p7 = new Player("Voldemort",71, 99);
		
		Player[] empty = {};
		Player[] arr1 = {p1, p2};
		Player[] arr2 = {p5, p3, p6, p1};
		Player[] arr3 = {p6, p7, p2, p3};
		Player[] arr4 = {p7, p2, p5, p6, p4, p3};
		
		Team t0 = new Team("Rivals",   empty);
		Team t1 = new Team("Champions", arr1);
		Team t2 = new Team("Gunters",   arr2);
		Team t3 = new Team("Gamers",    arr3);
		Team t4 = new Team("Vikes",     arr4);
		
		Team[] teams0 = {};
		Team[] teams1 = {t1};
		Team[] teams2 = {t1, t3};
		Team[] teams3 = {t4, t0, t1, t3};
		Team[] teams4 = {t2, t4, t0, t1, t3};
		
		double result = 0;
		double expected = 0;
		
		result = A2Exercises.averageYoungestAge(teams0);
		expected = -1.0;
		displayResults(Math.abs(result-expected)<THRESHOLD, "average of youngest on empty array");
		
		result = A2Exercises.averageYoungestAge(teams1);
		expected = 18/1.0;
		displayResults(Math.abs(result-expected)<THRESHOLD, "average of youngest on 1 team array");
		
		result = A2Exercises.averageYoungestAge(teams2);
		expected = (18+23)/2.0;
		displayResults(Math.abs(result-expected)<THRESHOLD, "average of youngest on array with t1, t3");
		
		result = A2Exercises.averageYoungestAge(teams3);
		expected = (18+23+23)/3.0;
		displayResults(Math.abs(result-expected)<THRESHOLD, "average of youngest on array with 3 non-empty teams");
		
		result = A2Exercises.averageYoungestAge(teams4);
		expected = (18+23+23+18)/4.0;
		displayResults(Math.abs(result-expected)<THRESHOLD, "average of youngest on array with 4 non-empty teams");
		
		// TODO: Write additional tests here
		
	}
	
	public static void testMostFans(){
		System.out.println("\nTesting mostFans");
		
		Player p1 = new Player("Parzival", 18, 31337);
		Player p2 = new Player("Jordan",   23, 32292);
		Player p3 = new Player("Serena",   41, 42280); 
		Player p4 = new Player("The Rock", 50, 80000);
		Player p5 = new Player("Ninja",    31, 180000);
		Player p6 = new Player("Taylor",   23, 45000);
		Player p7 = new Player("Voldemort",71, 99);
		
		Player[] empty = {};
		Player[] arr1 = {p1, p2};
		Player[] arr2 = {p5, p3, p6, p1};
		Player[] arr3 = {p6, p7, p2, p3};
		Player[] arr4 = {p7, p2, p5, p6, p4, p3};
		
		Team t0 = new Team("Rivals",   empty);
		Team t1 = new Team("Champions", arr1);
		Team t2 = new Team("Gunters",   arr2);
		Team t3 = new Team("Gamers",    arr3);
		Team t4 = new Team("Vikes",     arr4);
		
		Team[] teams1 = {t1};
		Team[] teams2 = {t1, t3};
		Team[] teams3 = {t4, t0, t1, t3};
		Team[] teams4 = {t2, t4, t0, t1, t3};
		
		Team result = null;
		Team expected = null;
		
		result = A2Exercises.mostFans(teams1);
		expected = t1;
		displayResults(result.equals(expected), "team with most fans in teams1");
		
		result = A2Exercises.mostFans(teams2);
		expected = t3;
		displayResults(result.equals(expected), "team with most fans in teams2");
		
		result = A2Exercises.mostFans(teams3);
		expected = t4;
		displayResults(result.equals(expected), "team with most fans in teams3");
		
		result = A2Exercises.mostFans(teams4);
		expected = t4;
		displayResults(result.equals(expected), "team with most fans in teams4");
		
		// TODO: Write additional tests here
		
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