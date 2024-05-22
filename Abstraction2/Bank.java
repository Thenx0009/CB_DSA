package Abstraction2;

public abstract class Bank {

	//Helps to achieve partial abstraction because of abstract and non-abstract method both
	public abstract void loan();//abstract method -->no method body
	
	//non-abstract methods
	public void credit() {
		System.out.println("Bank-- credit");
	}
	
	public void debit() {
		System.out.println("Bank-- debit");
	}
}
