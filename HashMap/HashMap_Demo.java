 package HashMap;

 import java.util.*;
public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map = new HashMap<>();
		//put
		map.put("Ria",90);
		map.put("Nitish",77);
		map.put("Akash",67);
		map.put("Zaid", 88);
		map.put("Puneet", 91);
		//System.out.println(map);
		map.put("Puneet", 60);
		//map.put(null, 26);
		System.out.println(map);
		//get
		System.out.println(map.get("Ram"));
		System.out.println(map.get("Zaid")); 
		
		//containsKey--->its return type is boolean
		System.out.println(map.containsKey("sita"));//it is not present in map
		System.out.println(map.containsKey("Akash"));//it is present in map
		
		//remove
		System.out.println(map.remove("Ria"));
		System.out.println(map);
	}

}
