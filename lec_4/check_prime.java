package lec_4;
import java.util.*;
public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count= 0;
		for(int i=2;i<n;i++){
		    if(n%i==0){
		        count++;
		        break;
		    }
		}
		if(count==0){
		        System.out.print("Prime");
		    }
		    else{
		        System.out.print("Not Prime");
		    }

	}

}
