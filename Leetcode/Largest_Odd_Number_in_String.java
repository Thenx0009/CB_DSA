package Leetcode;

public class Largest_Odd_Number_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String num = "52";
		System.out.println(largestOddNumber(num));
	}
	public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

}
