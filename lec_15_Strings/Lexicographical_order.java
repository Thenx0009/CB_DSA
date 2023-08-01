package lec_15_Strings;

public class Lexicographical_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kunal";
		String s2 = "komal";
		System.out.println(Compare(s1,s2));
		System.out.println(s1.compareTo(s2));
	}
	public static int Compare(String s1,String s2) {
		//This is CompareTo function java code
		int len = Math.min(s1.length(), s2.length());
		for (int i = 0; i < len; i++) {
			if(s1.charAt(i)>s2.charAt(i)) {
			    return s1.charAt(i) - s2.charAt(i);
			}
			else if(s1.charAt(i)<s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length()- s2.length();
		
	}
}
