package wrapper_class;

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		Integer b = a; //autoboxing
		System.out.println(b);
		
		
		int x=100;
		Integer y = Integer.valueOf(x);//boxing
		System.out.println(y);
		
		Integer result = 100;
		int newResult = result.intValue();//unboxing
		System.out.println(newResult);
		
		Integer marks = 100;
		int newMarks = marks; //Auto- Unboxing
	}

}
