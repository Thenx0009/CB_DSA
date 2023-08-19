package OOPS_Revision;

public class Person {
	
	String name="Kriti";//parsing
	int age=89;//parsing
	
	public void fun() {
		int adhaar_no = 454468;
		System.out.println(this.name+" "+this.age+" "+adhaar_no);
	}
	//Default constructor
//	public Person() {
//		
//	}
	
	//non-parameterized
//	public Person() {
//		this.name = "Motu";
//		this.age = 24;
//	}
	
	//parameterized constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
