package Bit_Manipulation;

public class Bitwise_AND_of_Numbers_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 5;
		int right = 7;
		System.out.println(rangeBitwiseAnd(left,right));
	}
	public static int rangeBitwiseAnd(int left, int right) {
        int result = right;
        while(right>left){
            result = right & (right-1);
            right = result;
        } 
        return result;
    }

}
