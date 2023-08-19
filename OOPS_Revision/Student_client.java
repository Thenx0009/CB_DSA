package OOPS_Revision;

public class Student_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 student class object
		Student s = new Student();
		s.age = 90;
		s.name = "ramu";
		System.out.println(s.age);
		System.out.println(s.name);
		
		System.out.println("-----------------");
		
		//2 student class object
		Student s1 = new Student();
		s1.age = 25;
		s1.name = "Vaibhavi";
		System.out.println(s1.age);
		System.out.println(s1.name);
		
		s.Intro_yourself();
		s1.Intro_yourself();
	}

}
