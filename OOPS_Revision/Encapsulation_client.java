package OOPS_Revision;

public class Encapsulation_client {

	public static void main(String[] args){//throws Exception //we write here also because as soon as the ecxeption is created JVM  will terminate the program
		// TODO Auto-generated method stub
		Encapsulation E = new Encapsulation("ayyyyuuusssh",25);
		E.setName("ayush");
		E.setAge(-21);
		System.out.println(E.getName());
		System.out.println(E.getAge());
	}

}
