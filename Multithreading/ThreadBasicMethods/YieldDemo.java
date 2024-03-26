package Multithreading.ThreadBasicMethods;

public class YieldDemo extends Thread{

	public void run() {
		Thread.yield();
		 for(int i=1;i<=5;i++) {
			 System.out.println(i+" - "+Thread.currentThread().getName());
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		YieldDemo t1 = new YieldDemo();
		t1.start();
		
		//Thread.yield(); If we want main method to stop and provide chance to other threads for execution
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
	}

}
