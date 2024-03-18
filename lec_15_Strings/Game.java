package lec_15_Strings;
/**You are making a game! The player tries to shoot an object and can hit or miss it.
The player starts with 100 points, with a hit adding 10 points to the player’s score, and a miss deducting 20 points.
Your program needs to take 4 action results as input ("hit" or "miss"), calculate and output the player’s remaining points.

Sample Input
hit
hit
miss
hit

Sample Output
110

Explanation: 3 hits add 30 points, one miss deducts 20, making the total points equal to 110.
 */
import java.util.*;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		System.out.println(hitmiss(n));
	}
	public static int hitmiss(int n) {
		Scanner sc = new Scanner(System.in);
		int playerPoints = 100;
		while(n-->0) {
			String str = sc.next();
			if(str.equals("hit")) {
				playerPoints=playerPoints+10;
			}
			else {
				playerPoints=playerPoints-20;
			}
		}
		return playerPoints;
	}

}
