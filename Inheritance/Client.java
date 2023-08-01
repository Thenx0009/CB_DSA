package Inheritance;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CASE --> 1
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
		
		//CASE --> 2
//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((C)(obj)).d2);//object type casting
//		System.out.println(((C)(obj)).d);//object type casting
//		obj.fun();
//		obj.fun1();
//		((C)(obj)).fun2();//Method type casting
		
		//CASE --> 3
//		C obj = new P();
//		System.out.println(obj.C);
		
		//CASE --> 4
		C obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((P)(obj)).d);
		obj.fun();
		obj.fun1();
		obj.fun2();
	}

}
