package Recursion2;

public class Integer_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(integerBreak(n));
	}

	public static int integerBreak(int n) {

		if (n == 2 || n == 3) {
			return n - 1;
		}

		int max = 0;
		for (int i = 1; i <= n; i++) {

			int div = n / i;
			int rem = n % i;

			int pow1 = (int) Math.pow(div, i - rem);
			int pow2 = (int) Math.pow(div + 1, rem);
			max = Math.max(max, pow1 * pow2);

		}

		return max;

	}

}
