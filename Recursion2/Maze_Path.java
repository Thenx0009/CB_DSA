package Recursion2;

public class Maze_Path {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 4;
		int n = 5;
		path(m-1,n-1,0,0,"");
		System.out.println(count);
	}
	public static void path(int er,int ec,int cr,int cc,String ans) {
		/*er-->End Row
		ec-->End Column
		cr-->Current Row 
		cc-->Current Column*/
		if(cr==er && cc==ec) {
			System.out.println(ans);
			count++;
			return;
		}
		if(cr>er ||cc>ec) {
			return;
		}
		path(er,ec,cr,cc+1,ans+"H");
		path(er,ec,cr+1,cc,ans+"V");
	}

}
