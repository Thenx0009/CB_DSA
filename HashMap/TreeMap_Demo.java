package HashMap;

import java.util.*;

public class TreeMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap <String,Integer> map = new TreeMap<>();
		map.put("Ria",90);
		map.put("Nitish",77);
		map.put("Akash",67);
		map.put("Zaid", 88);
		map.put("Puneet", 91);
		//map.put(null, 12);//can't store null key
		System.out.println(map);
		
	}

}
