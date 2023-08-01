package lec_13;

public class Kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int n=126;
		System.out.println(kthroot(k,n));
	}
	public static int kthroot(int k,int n) {
		int low=1;
		int high=n;
		int ans=0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(Math.pow(mid,k)<=n) {
				ans=mid;
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return ans;
	}

}
