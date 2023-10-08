package ComparatorVsComparable;

import java.util.*;

public class Sort_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		List<Employee> employees = new ArrayList<>();
		while (n-- > 0) {
			String name = sc.next();
			int salary = sc.nextInt();

			if (salary >= x) {
				employees.add(new Employee(name, salary));
			}
		}
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.salary != e2.salary) {
					return Integer.compare(e2.salary, e1.salary); // Sort by salary in decreasing order
				} else {
					return e1.name.compareTo(e2.name); // Sort lexicographically
				}
			}
		});
		for (Employee ans : employees) {
			System.out.println(ans.name + " " + ans.salary);
		}
	}

	static class Employee {
		String name;
		int salary;

		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
	}
}
