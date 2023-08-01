package OOPs;

public class Human {
	private String name= "Kriti";
	private int age =29;
	
	public Human(String name,int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if(age<0) {
				throw new Exception("Age can't be negative");
			}
			this.age = age;
		}
		catch(Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("heeelooo");
		}
	}
}
