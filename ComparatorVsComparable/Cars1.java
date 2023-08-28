package ComparatorVsComparable;

public class Cars1 {
	int price;
	int speed;
	String color;
	
	public Cars1() {
		
	}
	
	public Cars1(int price,int speed,String color) {
		this.price = price;
		this.speed = speed;
		this.color = color;
	}
	@Override
	public String toString() {
		return "P:"+this.price + " S:"+this.speed + " C:"+this.color;
	}
}
