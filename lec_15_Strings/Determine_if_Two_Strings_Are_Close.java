package lec_15_Strings;
import java.util.*;
public class Determine_if_Two_Strings_Are_Close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "abc";
		String word2 = "bca";
		System.out.println(closeStrings(word1,word2));
	}
	public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int w1[] = new int[26];
        int w2[] = new int[26];

        for(char ch:word1.toCharArray()){
            w1[ch-'a']++;
        }
        for(char ch:word2.toCharArray()){
            w2[ch-'a']++;
        }
        // w1[0] = 1  // 'a' appears 1 time
        // w1[1] = 1  // 'b' appears 1 time
        // w1[2] = 0  // 'c' appears 0 times
        // w1[3] = 0  // 'd' appears 0 times
        // w1[4] = 0  // 'e' appears 0 times
        // w1[5] = 0  // 'f' appears 0 times
        // ...        // and so on for the other letters
        // w1[25] = 0 // 'z' appears 0 times
        for(int i=0;i<26;i++){
            if((w1[i]==0 && w2[i]!=0) || (w1[i]!=0 && w2[i]==0)){
                return false;
            }
        }
        Arrays.sort(w1);
        Arrays.sort(w2);
        return Arrays.equals(w1,w2);
    }

}
