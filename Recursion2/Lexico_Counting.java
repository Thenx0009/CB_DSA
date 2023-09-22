package Recursion2;

public class Lexico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		counting(n, 0);
	}

	public static void counting(int n, int curr) {
		
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			counting(n,curr*10+i);
		}
	}

}
