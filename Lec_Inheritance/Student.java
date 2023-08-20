package Lec_Inheritance;

public class Student {
	
	String name = "Ayush";
	int age = 18;
	
	@Override
	public String toString() {
		return this.name+" "+ this.age;
	}
}
