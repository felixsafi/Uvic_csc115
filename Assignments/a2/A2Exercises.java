public class A2Exercises {
	
	/*
	 * Purpose: get the player with more fans
	 * Parameters: Player p1, Player p2 - the players to compare
	 * Returns: Player - the player with more fans, or p1
	 *          both players have the same number of fans
	 */
	public static Player moreFans(Player p1, Player p2) {
		if(p1.getFans()<p2.getFans()){
			return p2;
		}
		return p1; // so it compiles
	}			
	
	/*
	 * Purpose: count the number of players on the given team
	 *          with more fans than the given threshold
	 * Parameters: Team t - the team to examine
	 *             int threshold - the number of fans must 
	 *                             be higher than this value
	 * Returns: int - the number of players on the team 
	 *                with more fans than threshold
	 */
	public static int countAbove(Team t, int threshold) {
		int count = 0;
		for(int i=0; i<t.getRoster().length; i++){
			if(t.getRoster()[i].getFans()>threshold){
				count++;
			}
		}
		return count; // so it compiles
	}

	/*
	 * Purpose: get the number of teams with at least one 
	 *          player on the roster named toFind
	 * Parameters: Team[] teams - the array of teams to search
	 *             String toFind - the name to search for
	 * Returns: int - the number of teams with a player on the
	 *                roster with the given name
	 */
	public static int countWithName(Team[] teams, String toFind) {
		int count = 0;
		for(int i=0; i<teams.length; i++){
			if(teams[i].getPlayer(toFind)!=null){
				count++;
			}
		}
		return count;
	}

	/*
	 * Purpose: get the average age of youngest players
	 *          in the array of teams given
	 * Parameters: Team[] t = the array of teams
	 * Returns double - the average age of the youngest 
	 *                  players from each team, or
	 *                  -1.0 if no players are able to
	 *                  be analyzed
	 */
	public static double averageYoungestAge(Team[] teams) {
		double sum = 0.0;
		double average = -1.0;
		double divisor = 0.0;

		for(int i=0; i<teams.length; i++){
			if(teams[i].getRoster().length>0){
				sum+=teams[i].getYoungest().getAge();
				divisor++;
			}
		}
		if(divisor!=0.0){
			average = sum/divisor;
		}
		return average; // so it compiles
	}
		
	/*
	 * Purpose: get the team with most fans (cumulative 
	 *          across all players on the roster)
	 * Parameters: Team[] teams - the array of teams
	 * Returns: Team - the team with the highest number
	 *                 of fans across all players on 
	 *                 the roster
	 * Precondition: teams is not empty
	 * Note: If multiple teams have the same number of
	 *       fans, the team that comes first in the 
	 *       array is returned.
	 */
	public static Team mostFans(Team[] teams) {
		Team mostFans = teams[0];
		for(int i=1; i<teams.length; i++){
			if(teams[i].totalFans()>mostFans.totalFans()){
				mostFans = teams[i];
			}
		}
		return mostFans; // so it compiles
	}
}