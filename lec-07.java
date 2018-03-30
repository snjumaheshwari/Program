import java.util.Scanner;


class Test{
	int x,y;
	static int z=10;
	
	public static void main(String [] ar)
	{
			Test t1=new Test();
			System.out.println(t1.x+" "+t1.y+" "+t1.z);
			
			System.out.println(Demo.z);
		
	}
	
}

class Demo{
	static int z=20;	
}

// *******************************************************************************************

class Test2{
	int x,y;
	
	Test2()
	{
			x=90;
			y=10;
	
	}
			
	void meth()
	{
		System.out.println("hello static");
		System.out.println(x+"  "+y);	

	}
	
	public static void main(String[] ar)
	{
			Test2 t1=new Test2();
			t1.meth();
			
			Test2 t2=new Test2();
			t2.x=5;
			t2.y=10;
			t2.meth();
		
	}

	
}

// ********************************34 202 ch2 for java cerification*************************************************************
class Test3{
	int x=10;
	static int y=5;
	static void meth()
	{
		// System.out.println(" hello static "+x);
		// Error :- Non Static variable can not be accessed using static context..
		
		Test3 t=new Test3();
		System.out.println("hello static "+t.x);
	}
	void fun()
	{ 
		// a non static function in class can access static as well as non static variable both..
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String ar[])
	{
			meth();
			Test3 t=new Test3();
			t.fun();
	}
}
// *********************************************    GUESS THE OUTPUT ********************************************************************************

class Test4{
	int x=90;
	static void meth()
	{
		// meth2()  => error.. 
		Test4 t=new Test4();
		System.out.println(t.x);
	}
	void meth2()
	{
		Test4 t=new Test4();
		System.out.println(t.x);	
	}
	public static void main(String [] args)
	{
		Test4 t=new Test4();
		t.x=80;
		System.out.println(t.x);
		t.meth2();  // or meth(); 		
	}
	
}
// output :- 	80
//				90

//*********************************************************************  
class Test5{
		
	static int x=4;
	
	public static void main(String ar[])
	{
			for(int x=5;x<10;x++)
				x++;
			System.out.println(x--);
			
	}
	
}
// output :- 4

class Test6{
	static int x=5;
	public static int main(int ar[])
	{
		return 0;
	}
	public static void main(String ar[])
	{
		System.out.println("hello");
	}
	
	
}

class Test7{
	
	public static void main(String ar[])
	{	int x=4;
			for(x=5;x<10;x++)
			{
				x=x+2;  // or try x++
				System.out.println(x);
			}
			System.out.println(x--);
			
			
	}
	
}
// 

class Test8{
	int x;
	{
		x=90;
		System.out.println("init block");
	}
	
	static{
		System.out.println("static block");
	}
	
	public static void main(String ar[])
	{
		System.out.println("main block");
		Test8 t=new Test8();
		
	}
		
}
/* System :-static block
			main block
			init block
*/
			 
class Test9{
	
	
}

class Test10{
	int x;
	{
		x=90;
		System.out.println("init block");
	}
	Test10()
	{
		System.out.println("constructor");
		x=80;
	}
	public static void main(String ar[])
	{
			System.out.println("main block");
			Test10 t=new Test10();
			
			System.out.println(t.x);
	}
}
