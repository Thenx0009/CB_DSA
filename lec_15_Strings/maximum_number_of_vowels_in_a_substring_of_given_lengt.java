package lec_15_Strings;

public class maximum_number_of_vowels_in_a_substring_of_given_lengt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "weallloveyou";
		int k = 3;
		System.out.println(maxVowels(s,k));
	}

	public static int maxVowels(String s, int k) {
		int count =0;
		int maxcount=0;
        if(s.length()<k){
            return 0;
        }
		for(int i=0;i<k;i++) {
			if(isVowel(s.charAt(i))) {
				count++;
			}
		}
		maxcount=count;
		int end = k-1;
        int start = 0;
        
        while(end<s.length()-1){
            if(isVowel(s.charAt(start)) && count>0){
                count--;
            } 
            if(isVowel(s.charAt(end+1))){
                count++;
            } 
            start++;
            end++;
            maxcount = Math.max(count,maxcount);
        }
		return maxcount;
	}
	public static boolean isVowel(char ch) {
		return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
	}
}
