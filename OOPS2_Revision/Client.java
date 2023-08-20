package OOPS2_Revision;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CASE-->1
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
		
		//CASE-->2
//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((C)(obj)).d2);//type casting
//		System.out.println(((C)(obj)).d);//type casting
//		
//		obj.fun();
//		obj.fun1();
//		((C)(obj)).fun2();
		
		//CASE-->3
//	 	C obj = new P();
//	 	System.out.println(obj.d);
//	 	System.out.println(obj.d1);
//	 	System.out.println(obj.d2);
//	 	obj.fun();
		
		//CASE-->4
		C obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		obj.fun();
		obj.fun2();
		obj.fun1(); 
	}
}
