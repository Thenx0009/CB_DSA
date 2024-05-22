package Multithreading.ThreadBasicMethods;

import java.util.Iterator;

public class ThreadInterrupt extends Thread {
	
	public void run(){
		try {
			for (int i = 0; i <=5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadInterrupt t1 = new ThreadInterrupt();
		t1.start();
		t1.interrupt();
	}

}
