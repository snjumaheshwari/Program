public class Test{
	int x,y;
	Test(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void meth(int x,int y)
	{
		x=x+10;
		y=y+10;
	}
	void meth()
	{
		x=x+10;
		y=y+10;
	}
	
	public static void main(String ar[])
	{
			Test ob1= new Test(10,20);
			ob1.meth(4,6);
			System.out.println(ob1.x+"  "+ob1.y);
			
			ob1.meth();
			System.out.println(ob1.x+"  "+ob1.y);
	}

/*
Output:-
10 20 
20 30
*/
	
}

public class Test2{
	int x,y;
	Test2(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void meth( Test2 o)
	{
		x=o.x+10;
		y=o.y+10;
	}
	
	public static void main(String ar[])
	{
			Test2 ob1= new Test2(10,20);
			Test2 ob2=new Test2(1,2);
			
			// 1. 
			// ob1.meth(ob2);
			// 2. 
			// ob1.meth(ob1); 
			
			
			System.out.println(ob1.x+"  "+ob1.y);
			
			System.out.println(ob2.x+"  "+ob2.y);
	}

/*
Output:-
	1.
		11 12
		1 2
	2.
		20 30
		1 2
*/
	
}





class Test3{
	int x,y;
	Test3(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void meth( Test3 o)
	{
		o.x=o.x+10;
		o.y=o.y+10;
	}
	
	public static void main(String ar[])
	{
			Test3 ob1= new Test3(10,20);
			Test3 ob2=new Test3(1,2);
			
			// 1. 
			 //ob1.meth(ob2);
			// 2. 
			// ob1.meth(ob1); 
			
			
			System.out.println(ob1.x+"  "+ob1.y);
			
			System.out.println(ob2.x+"  "+ob2.y);
	}

/*
Output:-
	1.
		
	2.
		
*/
	
}

class Test4{
	int x,y;
	Test4(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	Test4 meth( )
	{
		Test4 o=new Test4(x+10,y+20);
		return o;
	}
	
	public static void main(String ar[])
	{
			Test4 ob1= new Test4(10,20);
			Test4 ob2=new Test4(1,2);
			
			// 1. 
			 ob2=ob1.meth();
			// 2. 
			// ob1.meth(ob1); 
			
			
			System.out.println(ob1.x+"  "+ob1.y);
			
			System.out.println(ob2.x+"  "+ob2.y);
	}

/*
Output:-
	1.
		10 20
		20 40
	2.

*/
	
}


































