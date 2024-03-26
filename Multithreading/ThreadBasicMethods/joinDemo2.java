package Multithreading.ThreadBasicMethods;

public class joinDemo2 extends Thread {
	
	static Thread mainThread;
	
	public void run() {
		
		try {
			mainThread.join(); //Here, first main thread completes its execution then join with child thread
			for (int i = 1; i <= 5; i++) {
				System.out.println("child thread " + i);
				Thread.sleep(1000);
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}	
	}

	public static void main(String[] args) {
		 mainThread = Thread.currentThread();
		
		joinDemo2 t = new joinDemo2();
		t.start();
		
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
