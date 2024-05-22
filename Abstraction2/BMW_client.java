package Abstraction2;

public class BMW_client extends BMW{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW_client b = new BMW_client();
		
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		System.out.println(b.wheels);
	}

}
