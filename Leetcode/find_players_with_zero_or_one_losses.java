package Leetcode;
import java.util.*;
public class find_players_with_zero_or_one_losses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matches[][] = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
		System.out.println(findWinners(matches));
	}

	public static List<List<Integer>> findWinners(int[][] matches) {
		HashMap<Integer, Integer> winner = new HashMap<>();
		HashMap<Integer, Integer> loser = new HashMap<>();

		// Process matches
		for (int[] match : matches) {
			winner.put(match[0], winner.getOrDefault(match[0], 0) + 1);
			loser.put(match[1], loser.getOrDefault(match[1], 0) + 1);
		}

		ArrayList<Integer> notLost = new ArrayList<>();
		ArrayList<Integer> lost1 = new ArrayList<>();

		for (int playerId : winner.keySet()) {
			if (!loser.containsKey(playerId)) {
				notLost.add(playerId);
			}
		}

		for (int playerId : loser.keySet()) {
			if (loser.get(playerId) == 1) {
				lost1.add(playerId);
			}
		}

		Collections.sort(lost1);
		Collections.sort(notLost);

		ArrayList<List<Integer>> ans = new ArrayList<>();
		ans.add(notLost);
		ans.add(lost1);
		return ans;
	}

}
