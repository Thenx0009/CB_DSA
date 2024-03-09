package Multithreading;

public class Test2 implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread alive");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		Thread th = new Thread(t);
		
		th.start();
				
	}

}
