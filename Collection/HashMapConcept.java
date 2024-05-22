package Collection;
import java.util.*;
import java.util.Map.Entry;
public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap is a class that implements the map interface
		//extends AbstractMap
		//it contains only unique elements
		//it may have only 1 null key and multiple null vales
		//it maintains no order
		//hashmap is non-synchronized -- not thread safe
		//concurrent modification exception -- Fail - Fast condition
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"ayush");
		map.put(2, "verma");
		map.remove(2);
		System.out.println(map);
		
		for(Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry);
		}
		System.out.println("**********");
		HashMap<Integer,Employee> hm = new HashMap<>();
		
		hm.put(1, new Employee("viksas",20,"cse"));
		hm.put(2, new Employee("shalini",30,"mech"));
		hm.put(3, new Employee("yash",15,"IOT"));
		
		for(Entry<Integer, Employee> entry: hm.entrySet()) {
			int key = entry.getKey();
			Employee e = entry.getValue();
			System.out.println(key+" "+e.name+" "+e.age+" "+e.department);
		}
	}

}
