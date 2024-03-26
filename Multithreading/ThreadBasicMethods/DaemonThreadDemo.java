package Multithreading.ThreadBasicMethods;

public class DaemonThreadDemo extends Thread{
	
	public void run(){
		System.out.println("daemon thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println("main thread");
		
		DaemonThreadDemo t1 = new DaemonThreadDemo();
		t1.setDaemon(true);
		t1.start();
	}

}
