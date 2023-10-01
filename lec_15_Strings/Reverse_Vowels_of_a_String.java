package lec_15_Strings;

public class Reverse_Vowels_of_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String s = "hello";
		System.out.println(reverseVowels(s));
	}
	public static String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char arr[] = s.toCharArray();
        while(i<j){
            while (i < j && !isVowel(arr[i])) {
                i++;
            }
            while (i < j && !isVowel(arr[j])) {
                j--;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }

}
