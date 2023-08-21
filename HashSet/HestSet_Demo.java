package HashSet;
import java.util.*;

public class HestSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(23);
		set.add(63);
		set.add(23);
		set.add(83);
		set.add(45);
		set.add(23);
		System.out.println(set);
		System.out.println(set.remove(45));
		System.out.println(set);
	}
}
