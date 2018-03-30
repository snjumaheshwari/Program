interface A{

void meth1();
void meth2();

// interface is a ... which can contain only/all abstaract methods..
// object of interface is not created..
/* by default methods are public and abstract..

Try using private,protected,default .. and get the error.. => and can't be changed...

*/

}


interface B{
	void meth3();
}
class Test implements A{
	
	public void meth1()
	{
		System.out.println("meth1");
	}
	public void meth2()
	{
		System.out.println("meth2");
	}
	
	public static void main(String ...ar)
	{
		
	}		
}

class Demo{
int a;
}

// class Test2 implements A,B extends Demo =>  error..

class Test2 extends Demo implements A,B{
	public void meth1()
	{
	}
	public void meth2()
	{
	}	
	public void meth3()
	{
	
	}

	public static void main(String ... ar)
	{
	
	}
}	


// *******************************************************************************************************

class Demo2{
public void meth1()
{
	System.out.prinltn("this is meth1 in Demo");
}
}

class Test2 extends Demo implements A,B{
	public static void meth2()
	{
		System.out.println("Hello meth2");
	}	
	public void meth3()
	{
			System.out.println("Hello meth3");
	}

	public static void main(String ... ar)
	{
	
	}
}	

// ******************************************************************************************************

