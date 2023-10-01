package lec_15_Strings;

public class Removing_Stars_From_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leet**cod*e";
		System.out.print(removeStars(s));

	}
	public static String removeStars(String s) {
		StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '*') {
                if (i > 0) {
                    sb.deleteCharAt(sb.length() - 1); // Remove the previous character
                }
            } else {
                sb.append(s.charAt(i)); // Append the character to the StringBuilder
            }
            i++;
        }
        return sb.toString();
    }
}

