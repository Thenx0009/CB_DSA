package Collection;

import java.util.*;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[3];//static array -size is fixed
		
		//dynamic array -- ArrayList
		
		ArrayList ar = new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add("gfh");
		ar.add('v');
		System.out.println(ar);
		System.out.println(ar.size());
		
		//non generic v generic
		
		ArrayList<Integer> ar1 = new ArrayList<>();
		ar1.add(78);
		
		//If we do not know what types of values we have to store in arraylist
		ArrayList<E> ar2 = new ArrayList<>();
		
		///Employee and Iterator example
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee("ayush", 10, "IT"));
		list.add(new Employee("yash", 5, "cse"));
		
		Iterator<Employee> it = list.iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name+" "+emp.age+" "+emp.department);
			
		}
		
	}

}
