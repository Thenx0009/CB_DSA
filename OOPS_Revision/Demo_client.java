package OOPS_Revision;

public class Demo_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s2 = new Student();
		Student s3 = new Student();
		s2.name = "Kunal";
		s2.age = 28;
		s3.name = "Hardik";
		s3.age = 26;
		System.out.println(s2.name+" "+s2.age);
		System.out.println(s3.name+" "+s3.age);
		//function calling 
		//Test1(s2,s3);
		Test2(s2,s3);
		System.out.println(s2.name+" "+s2.age);
		System.out.println(s3.name+" "+s3.age);
	}
	public static void Test1(Student s2,Student s3) {
		Student t = s2;
		s2 = s3;
		s3 = t;
	}
	public static void Test2(Student s2,Student s3) {
		 s2 = new Student();
		 int tempa = s2.age;
		 s2.age = s3.age;
		 s3.age = tempa;
		 
		 s3 = new Student();
		 String temp = s2.name;
		 s2.name = s3.name;
		 s3.name = temp;
	}

}
