package Multithreading.ThreadBasicMethods;

public class PriorityThreadDemo extends Thread{

	public void run() {
		System.out.println("child thread");
		System.out.println("child thread priority "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("main thread priority "+Thread.currentThread().getPriority());
		
		PriorityThreadDemo t1 = new PriorityThreadDemo();
		t1.start();
		
	}
}
