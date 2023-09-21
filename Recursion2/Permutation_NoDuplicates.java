package Recursion2;

public class Permutation_NoDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abca";
		printPermutation(str,"");
	}
	public static void printPermutation(String ques,String ans) {
		if(ques.equals("")) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			char ch = ques.charAt(i);
			Boolean flag = true;
			for(int j=i+1;j<ques.length();j++) {
				if(ques.charAt(j)==ch) {
					flag=false;
					break;
				}
			}
			if(flag) {
				printPermutation(ques.substring(0,i)+ques.substring(i+1), ans+ch);
			}
		}
	}

}
