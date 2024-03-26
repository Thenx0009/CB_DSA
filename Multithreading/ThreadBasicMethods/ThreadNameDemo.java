package Multithreading.ThreadBasicMethods;

public class ThreadNameDemo extends Thread{
	
	public void run(){
		System.out.println("thread task is exceuted by "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello is printed by "+Thread.currentThread().getName());
		
		ThreadNameDemo t1 = new ThreadNameDemo();
		t1.start();
		System.out.println(t1.isAlive());
		
		ThreadNameDemo t2 = new ThreadNameDemo();
		t2.start();
		System.out.println(t2.isAlive());
	}
}
