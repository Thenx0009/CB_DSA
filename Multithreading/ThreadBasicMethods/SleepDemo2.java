package Multithreading.ThreadBasicMethods;

public class SleepDemo2 extends Thread{
	
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i+" "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}
		catch(Exception e ){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SleepDemo2 t1 = new SleepDemo2();
		t1.run();
		
		SleepDemo2 t2 = new SleepDemo2();
		t2.start();
		
		SleepDemo2 t3 = new SleepDemo2();
		t3.start();
	}

}
