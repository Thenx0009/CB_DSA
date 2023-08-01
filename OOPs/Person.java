package OOPs;

public class Person {
	private String name= "Kriti";
	private int age =29;
	
	//Non-parameterized Constructor
//	public Person() {
//		this.name="Motu";
//		this.age=25;
//	}
	//Parameteized Constructor
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void fun() {
		String name ="Panchi";
		int Adhar_no = 125469;
		System.out.println(this.name+" "+this.age+" "+Adhar_no);
	}
	//Encapsulation
	//Setter and Getter Methods
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
