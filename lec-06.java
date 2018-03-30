class Test{
	int x,y;
	Test()
	{
		this.x=10;
		this.y=10;
		System.out.println(" No arguments");
	}
	Test(int x,int y)
	{
		
		this.x=x;
		this.y=y;
			System.out.println("one Arguments");
	}
	
	public static void main(String args[])
	{
	Test t1=new Test();
	Test t2= new Test(10,20);
	
	System.out.println(t1.x+ " "+ t1.y);
	System.out.println(t2.x+" "+t2.y);

	}
	
}


class Test1{
	int x,y;
	Test1()
	{
		System.out.println(" No arguments");
	}
	Test1(int x,int y)
	{
		this();
		this.x=x;
		this.y=y;
			System.out.println("one Arguments");
	}
	
	public static void main(String args[])
	{
	
	Test1 t2= new Test1(10,20);
	System.out.println(t2.x+" "+t2.y);

	}
	
}



class Test3{
	int x,y,z;
	Test3()
	{
			this(10);
			System.out.println("no");
	}
	Test3(int x)
	{
			this(x,20);
			System.out.println("one");
	}
	Test3(int x,int y)
	{
			this(x,y,50);
			System.out.println("two");
	}
	Test3(int x,int y,int z)
	{
			this.x=x;
			this.y=y;
			this.z=z;
			System.out.println("three");
	}
	
	
	public static void main(String ar[])
	{
		//Test3 t =new Test3();
		//Test3 t= new Test3(1);
		Test3 t=new Test3(1,2);
		//Test3 t=new Test3(1,2,3);
		System.out.println(t.x+ " "+t.y+ " "+t.z);
	
		
	}
	
}

class Test4{
	int x,y;
	/*
	Test4(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	*/
	public static void main(String ar[])
	{
		Test4 t= new Test4();
		
	}
	
	// Error Reason :-
	
}
// ********************************************** STATIC VARIABE IN CLASS ********************************

class StaticTest{
	int x,y;
	static int z=10;
	
	public static void main(String ar[])
	{
			StaticTest t1= new StaticTest();
			StaticTest t2 =new StaticTest();
			
			t1.x=10;
			t1.y=20;
			t1.z=30;
			
			System.out.println(t1.x+" "+t1.y+" "+t1.z);
			System.out.println(t2.x+" "+t2.y+" "+t2.z);
			
			
			System.out.println(z);
			//System.out.println(x);
	}
	
// Concept :- Static Variale Share Memory ..
/* Output :-	10 20 30
				0 0 30
				30
*/			
}


class Static_Test2{
	
	public static void main(String ar[])
	{
			StaticTest t1= new StaticTest();
			System.out.println(t1.x+" "+t1.y+" "+t1.z);
	}
}




