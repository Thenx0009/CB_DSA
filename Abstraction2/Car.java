package Abstraction2;

//helps to  achieve 100% abstraction
public interface Car {

	static int wheels = 4;
	//By default it has public and abstract
	void start();
	
	void stop();
	
	void refuel();	
}
