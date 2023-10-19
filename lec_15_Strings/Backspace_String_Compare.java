package lec_15_Strings;

public class Backspace_String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ab#c";
		String t = "ad#c";
		System.out.println(backspaceCompare(s,t)); 
	}

	public static boolean backspaceCompare(String s, String t) {
		
		StringBuilder sb1 = new StringBuilder("");
		StringBuilder sb2 = new StringBuilder("");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='#') {
				sb1.append(s.charAt(i));
			}
			else if(sb1.length()>0) {
				sb1.deleteCharAt(sb1.length()-1);
			}
		}
		for(int j=0;j<t.length();j++) {
			if(t.charAt(j)!='#') {
				sb2.append(t.charAt(j));
			}
			else if(sb2.length()>0) {
				sb2.deleteCharAt(sb2.length()-1);
			}
		}
		
		
		return sb1.toString().equals(sb2.toString());
	}

}
