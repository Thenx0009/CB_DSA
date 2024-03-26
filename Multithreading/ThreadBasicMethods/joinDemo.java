package Multithreading.ThreadBasicMethods;

public class joinDemo extends Thread {

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("child thread " + i);
				Thread.sleep(1000);
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		joinDemo t = new joinDemo();
		t.start();
		
		t.join();//here, first child thread completes its execution then join with main thread
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("main thread " + i);
				Thread.sleep(1000);
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
	
	}
}
