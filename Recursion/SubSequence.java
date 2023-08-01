package Recursion;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abc";
		PrintSubSeq(str,"");
	}
	public static void PrintSubSeq(String str, String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = str.charAt(0);//a
		PrintSubSeq(str.substring(1),ans);
		PrintSubSeq(str.substring(1),ans+ch);
	}
}
