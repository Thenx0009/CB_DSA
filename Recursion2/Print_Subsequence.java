package Recursion2;

public class Print_Subsequence {
	
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		Subseq(str, "");
		System.out.println(count);
	}

	public static void Subseq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		char ch = ques.charAt(0);
		Subseq(ques.substring(1), ans);
		Subseq(ques.substring(1), ans + ch);

	}

}
