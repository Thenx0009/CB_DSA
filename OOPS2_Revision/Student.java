package OOPS2_Revision;

public class Student {
	
	String name;
	int age ;
	
	public Student() {
		
	}
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return this.name+" "+this.age;
	}
}
