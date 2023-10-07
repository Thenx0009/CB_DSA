package HashSet;
import java.util.*;
public class Exist_OR_Not {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<arr.length;i++){
		        arr[i] = sc.nextInt();
		    }
		    HashSet<Integer> set = new HashSet<>();
            for (int val : arr) {
                set.add(val);
            }
		    int q = sc.nextInt();
		    for(int i=1;i<=q;i++){
		        int ele = sc.nextInt();
		        if(set.contains(ele)) {
		        	System.out.println("Yes");
		        }
		        else {
		        	System.out.println("No");
		        }
		    }
		}
	}

}
