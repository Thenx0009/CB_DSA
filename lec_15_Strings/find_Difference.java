package lec_15_Strings;

public class find_Difference {
	
	public static void main(String[] args) {
		 System.out.println(findTheDifference("abcd","abcde"));
	}
	public static char findTheDifference(String s, String t) {
        char ch =0;
        for(int i=0;i<s.length();i++){
            ch = (char) (ch^s.charAt(i));
        }
        for(int j=0;j<t.length();j++){
            ch = (char) (ch^t.charAt(j));
        }
        return ch;
    }
}

