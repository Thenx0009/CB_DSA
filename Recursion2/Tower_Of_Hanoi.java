package Recursion2;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		tower(3,"src","help","des");
	}
	public static void tower(int N,String s,String h,String d) {
		if(N==0) {
			return;
		}
		tower(N-1,s,d,h);
		System.out.println("Move "+N+" Disk from "+s+" to "+d);
		tower(N-1,h,s,d);
	}

}
