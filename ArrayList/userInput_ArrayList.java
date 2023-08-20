package ArrayList;

import java.util.*;
public class userInput_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> ll = new ArrayList<Integer>();
		
		//add 4 elements
		for(int i=0;i<10;i++) {
			ll.add(sc.nextInt());
		}
		Collections.sort(ll);
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
	}

}
