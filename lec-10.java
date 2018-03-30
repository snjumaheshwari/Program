class Test{
		public static void main(String[]ar)
		{
				int a[];
				double []b;
				Test t1=new Test();
				System.out.println(t1); // name of class @ hash addresss of that object.. => by toString method of object class...	
				 // System.out.println(a);  variable a might not have been initialized
				// System.out.println(b); error  variable b might not have been initialized
				int c[]=new int [10];
				System.out.println(c);
				
				a=new int [2];
				b=new double [3];
				
				System.out.println(a); 	 //[I@ hash address
				System.out.println(b);// [D@ hash address
				
				String s[]=new String[10];
				System.out.println(s); // [Ljava.lang.String@ hash address; 
										// [Ljava.lang.String;@5c647e05
				
				Test obj[]=new Test[10];
				System.out.println(obj); 
				
				Test1 ob[]=new Test1[1];
				System.out.println(ob);
				
				// [LTest;@33909752
				//[LTest1;@55f96302
				
		}
}

// every class in java is inheriting from Object class...=> all other ..predefined as well user defined class..

class Test1{
	// let's overide the toString method
		int x,y;
		Test1(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		
		public String toString()
		{
			// it is a method overired from Object class..
			// It calls automattically when we print the object.. 
			String	s="x is : " +x+ "y is :"+y;
			return s;
		}
		
		public static void main(String[] ar)
		{
		Test1 t1=new Test1(12,23);
		Test1 t2 =new Test1(10,1);
		System.out.println(t1);
		System.out.println(t2);
	
		}
}

class Test2{
	int x,y;
	
	Test2(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void meth(int a,int b)
	{
		System.out.println("int-int");
	}
	void meth(double a, int b)
	{
		System.out.println("double-int");;
	}
	void meth(int a, double b)
	{
		System.out.println("int-double");
	}
	void meth(short a , short b)
	{
		System.out.println("short-short");
	}
	
	
	public static void main(String ar[])
	{
			Test2 ob1 =new Test2(12,20);
			ob1.meth(10,10); 
			ob1.meth(1,2); 
	}
}



class Test3{
	int x,y;
	
	Test3(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
/*	
	void meth(int a,int b)
	{
		System.out.println("int-int");
	}
	
*/
	void meth(double a, int b)
	{
		System.out.println("double-int");;
	}
	void meth(int a, double b)
	{
		System.out.println("int-double");
	}
	void meth(short a , short b)
	{
		System.out.println("short-short");
	}
	
	
	public static void main(String ar[])
	{
			Test3 ob1 =new Test3(12,20);
			// ob1.meth(10,10); //  error ambigous..
			// ob1.meth(1,2);  // error ambigous..
	}
}