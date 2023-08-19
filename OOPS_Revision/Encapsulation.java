package OOPS_Revision;

public class Encapsulation {
	
	private String name;//data hiding
	private int age;//data hiding
	
	public Encapsulation(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//Encapsulation
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {//throws Exception //this tells exception might be generated
		
		try {//exception created code written in try block
			if(age<0) {
				throw new Exception("Age cannot be -ve");
			}
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		this.age = age;
//		finally {
//			
//		}
		
	}
}
