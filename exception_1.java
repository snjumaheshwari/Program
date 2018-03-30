class Test{
public static void main(String ar[]) throws InterruptedException{
		for(int i=0;i<10;i++)
		{
		System.out.println(i);
		
		Thread.sleep(500);
		}
	}
}

// **************************************************
class Test2{	
public static void main(String ar[]){
		for(int i=0;i<10;i++)
		{
		System.out.println(i);
		
			try{
			Thread.sleep(500);
			}
		
		catch( InterruptedException e){
			System.out.println("i am interrupted");
			}
			
		} // for loop 
	
	} // main function 
} // class 


class Test3{
	public static void main(String ar[])
	{
	int a[]={10,20,30,40};
	try{
		a[15]=90;
		System.out.println("not done");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("check the array index number");
		System.out.println("at index "+e.getMessage());
	}
	System.out.println("done");
}
}

// ******
class Test4{
	public static void main(String ar[])
	{
		int x=80;int y=0;
		int a[]={10,20,30,40};
		
		try{
			a[6]=90;
			int z=x/y;
			System.out.println("not done");
		}
		catch (ArithmeticException e){
			System.out.println("check the values");
			System.out.println(e.getMessage());
		}
		catch( ArrayIndexOutOfBoundsException e)
		{
			System.out.println("check the array index number");
		System.out.println("at index "+e.getMessage());
		}
		
		System.out.println("done");
	}
}

// **********************************
class Test5{
	public static void main(String ar[])
	{
		int x=80;int y=0;
		int a[]={10,20,30,40};
		
		try{
			a[6]=90;
			int z=x/y;
			System.out.println("not done");
		}
		catch (ArithmeticException e){
			System.out.println("check the values");
			System.out.println(e.getMessage());
		}
		/*catch( ArrayIndexOutOfBoundsException e)
		{
			System.out.println("check the array index number");
		System.out.println("at index "+e.getMessage());
		} */
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("done");
	}
}

//******************************
class Test6{
	/*
	// error in code.. unreacheable code..
	public static void main(String ar[])
	{
		int x=80;int y=0;
		int a[]={10,20,30,40};
		
		try{
			a[6]=90;
			int z=x/y;
			System.out.println("not done");
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		catch (ArithmeticException e){
			System.out.println("check the values");
			System.out.println(e.getMessage());
		}
		
		System.out.println("done");
	}
	*/
}

