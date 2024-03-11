package Multithreading;

public class ThreadCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadA t1 = new ThreadA();
		t1.start();
		
		ThreadB t2 = new ThreadB();
		t2.start();
	}

}
