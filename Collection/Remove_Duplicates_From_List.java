package Collection;
import java.util.*;

public class Remove_Duplicates_From_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5,5,5,5, 567, 8));
		
		HashSet<Integer> set = new HashSet<>(list);
		
		System.out.println(set);
	}

}
