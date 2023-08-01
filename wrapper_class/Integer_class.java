package wrapper_class;

public class Integer_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ii=90;
		int i=89;
		System.out.println(ii);
		System.out.println(i);
		Long ll=378l;//type casting
		Short s=18;
		
		//autoboxing;
		ii=i;
		
		Integer a = 100;
		int b = 10;
		b=a;//Integer --> int on-boxing
		System.out.println(i);
		
		Integer x=18;
		Integer x1=18;
		Integer y=189;
		Integer y1=189;
		System.out.println(x==x1);
		System.out.println(y==y1);
	}

}
