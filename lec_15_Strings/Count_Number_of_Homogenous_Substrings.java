package lec_15_Strings;

public class Count_Number_of_Homogenous_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = s = "abbcccaa";
		System.out.println(countHomogenous(s));
	}

	public static int countHomogenous(String s) {
		int res = 0;
		int Mod = (int) Math.pow(10, 9) + 7;
		int start = 0;
		res++;
		for (int i = 1; i < s.length(); i++) {
			res++;
			if (s.charAt(start) != s.charAt(i)) {
				start = i;
			} else {
				int j = i - start;
				res = (res + j) % Mod;
			}
		}
		return res % Mod;
	}

}
