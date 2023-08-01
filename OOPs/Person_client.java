package OOPs;

public class Person_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Karan",23);
		p.setName("Ankit");
		p.setAge(0);
		System.out.println(p.getAge());
		p.fun();
		
		Person p1 = new Person("Kumar",45);
		p1.setName(null);
		p.setAge(120);
		p1.fun();
	}

}
