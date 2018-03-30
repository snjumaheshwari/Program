/*
Wap in which define  an abstract class A containing a non abstract method demo() and an integer variable x initialized to 10 .
 define an interface B containing a default 
method void demo() and a double variable x initialized with 20. 
now create  a class  Test which inherits A and B and override the demo method . implemented
invoke the demo() method  of interface and the class Test both and print the value of x.
explain the output.


*/


abstract class A{
	int x=10;
	void demo()
	{
		System.out.println("Demo of abstract class a");
	}
	
}

interface B{
	double x=20.0;
	default void demo(){
		System.out.prinltn("Demo of interface");
	}
	
}

class Test extends A implements B{
	public void demo()
	{
		
	}
		
	public static void main(String ... ar)
	{
	
	
	}
	
}

// *******************************************************
interface C{
	void meth();
}

class Test1