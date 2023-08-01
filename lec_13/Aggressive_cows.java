package lec_13;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int stall[] = new int[nos];
		for(int i=0;i<stall.length;i++) {
			stall[i]= sc.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(MaxDistance(stall, noc));
	}
	public static int MaxDistance(int stall[], int noc) {
		int low=0;
		int high=stall[stall.length-1];
		int ans=0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(issafe(stall,noc,mid)==true) {
				ans=mid;
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return ans;
	}
	public static boolean issafe(int stall[],int noc,int mid) {
		int pos=stall[0];
		int cow=1;
		for(int i=1;i<stall.length;i++) {
			if(stall[i]-pos>=mid) {
				pos=stall[i];
				cow++;
			}
			if (noc == cow) {
				return true;
			}
		}
		return false;
	}

}
