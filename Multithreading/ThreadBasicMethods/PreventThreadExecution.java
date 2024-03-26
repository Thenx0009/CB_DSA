package Multithreading.ThreadBasicMethods;

public class PreventThreadExecution extends Thread {
	
	public void run(){
		try {
			for(int i=1;i<=5;i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PreventThreadExecution t = new PreventThreadExecution();
		t.start();
	}

}
