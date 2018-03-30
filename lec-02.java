class WhileLoop{
	public static void main(String ar[])
	{
	int x=1;
	while(x<=10)
		{
		System.out.println(" x: "+x);
		x++;
		}		
	}

}
// *********************************************************

class ForLoop{
	public static void main(String ar[])
	{

	for(int x=1;x<=10;x++)
		{
		System.out.println(" x: "+x);
		}		
	}

}

// **************************************************************


class DoWhileLoop{
	public static void main(String ar[])
	{
	int x=1;
	do
		{
		System.out.println(" x: "+x);
		x++;
		}while (x<=10);		
	}

}

   // *********************************************************
class Switch{
	public static void main(String ar[])
	{
		int ch=1;
		switch(ch)
		{
			case 1:
				System.out.println(" hello");
				break;
			case 2:
				System.out.println(" world");
				break;
			default :
				System.out.println("Java");
					
		}
	}
}

	// ***********************************************************************

class Test{

public static void main(String ar[])
{
	int i=0;
	i=i++;
	i=i++;
	i=i++;
	i=i++;
	System.out.println(i);
}

}

// *************************************************************************

class DataTypes{

// Any arithmetic computation related to short and bytes => results in int..
//short s1,s2  =>  s1+3 , s1+s2 , s1-s2 etc
// byte b1,b2  =>  same..

	public static void main(String ar[])
	{
	short s2,s1=10;
	// s2= s1+1;	Error
	s2=(short)(s1+1);
	s2+=1;
	s2++;


	System.out.println(s2);
	
	}

}
