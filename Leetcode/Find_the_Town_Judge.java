package Leetcode;

public class Find_the_Town_Judge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2, trust[][] = {{1,2}};
		System.out.println(findJudge(n,trust));
	}

	public static int findJudge(int n, int[][] trust) {
		int outDeg[] = new int[n + 1];
		int inDeg[] = new int[n + 1];

		for (int i = 0; i < trust.length; i++) {
			outDeg[trust[i][0]]++;
			inDeg[trust[i][1]]++;
		}

		for (int i = 1; i <= n; i++) {
			if (outDeg[i] == 0 && inDeg[i] == n - 1) {
				return i;
			}
		}
		return -1;
	}

}
