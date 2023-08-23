package Abstraction;

public interface Stack1 extends DSAI,DynamicStackInterace {//inheritance in interfaces
	
	void push();
	int pop();
	int size();
	int val=9; //by default it id public,static & final
	
	//we can give body to the
	//default, static and private
	
	default void sayhey() {
		System.out.println("hey");
	}
	public static void sayhey1() {
		System.out.println("hey1");
	}
	private void fun() {
		System.out.println("fun");
	}
}
