package Multithreading;

public class Test extends Thread {
	
	@Override
	public void run() {
		System.out.print("thread alive\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.start();
		//t.start();///gives the runtime exception --> java.lang.IllegalThreadStateException
		
		Test t2 = new Test();
		t2.start();
	}

}
