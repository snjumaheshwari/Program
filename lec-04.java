import java.util.Scanner;


// using Command Line argument take a string and print 3rd 

class Test{
	public static void main(String[] ar )
	{
		System.out.println(" String is : " + ar[0]);
		char c= ar[0].charAt(4);
		
		System.out.println(c);
		
		String s = "Hello";
		char c0 =s.charAt(0);
		char c1 =s.charAt(1);
		
		System.out.println(c1);
	}
}


class Example{
	public static void main(String[] ar)
	{
		char ch= ar[0].charAt(0);
		
		System.out.println(ch);
		System.out.println(ar[0]);
		System.out.println(ar.length);
		System.out.println();
		
		System.out.println(ar[0].length());
		
		String s= ar[1];
		char ch1=s.charAt(3);
		System.out.println(ch1);
		System.out.println(ch+ch1);
		
		char ch2=(char)(ch+ ch1);
		
		// ERROR :- char ch2= char(ch1+ch2);
		
		System.out.println(ch2);
		
		System.out.println(ch+""+ch1);
		
		
	}
}


/*
Input :- xyz abcd
output :-

x
xyz
2

d
220
// a character
xd

*/


// Write a program to print all the arguments given at the run time..
class Example2{
	public static void main(String ar[])
	{
	//int n=ar.length;
	for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}

class Example2_1{
	public static void main(String ar[])
	{
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			while( s!=" Hello")
			{
				System.out.println(s);
				s=sc.next();
			}
	}
}


class Example3{
	public static void main(String ar[])
	{
		int a=2;
		int b=6;
		
		int c= a++ + a++;
		int d= ++a + ++a;
		
		System.out.println(c);
		System.out.println(d);
		
		int e=a++ + ++a;
		int f= ++a + a++;
		
		System.out.println(e);
		System.out.println(f);
		
	
		
	}
}

class Example4{
	public static void main(String ar[])
	{
		int a=2;
		int b=6;
		
		int c= a++ +a++ + ++a ;
	
		System.out.println(c);
		
	}
}

class Example5{
	public static void main(String ar[])
	{
		int x=-127;  // Negative number is stored in 2's Compliment Form..
		int y=x>>2; 
		int z=x>>3;
		
		System.out.println(y);
		System.out.println(z);
		
		int a=x>>>62;
		System.out.println(a);
		
	}
}


