// How to take input in Java



import java.util.Scanner;

class Test{
	public static void main(String [] ar)
	{
	System.out.println(ar[0]+ar[1]);
	System.out.println(ar.length);
	int x=Integer.parseInt(ar[0]);  // parseInt is a static member of Integer Class..
	int y=Integer.parseInt(ar[1]);
	System.out.println(x+y);

	double z=Double.parseDouble(ar[2]);
	
	// System.out.println(ar[3][1]);  Compile Time Error :- array required, but String Found...

	}
}

// javac lec-03.java
// java Test 10 12 21.5 sanjay Maheshwari

/* Output:- 
	1012
	4
	22
*/

/*Possible Exception :-
	Exception :- Array index out of bound..
	

Exception :- Number Format Exception 
*/




//   ***************************************2.Using Scanner Class *********************************************************************



//import java.util.Scanner;    Import Statement Must Be at top of the File..
class InputUsingScanner{
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);   
		String s=sc.next();
		
		int i= sc.nextInt();  // Wrapper Class int Method => nextInt
		double d= sc.nextDouble();
		float f=sc.nextFloat();
		long l=sc.nextLong();
		
		System.out.println(i+" " +d+" "+f+" "+l);
		System.out.println(s);
		

		String s2=sc.next();
		String s3=sc.nextLine();
		String s4=sc.next();
		
		System.out.println(s2);
		System.out.println(s3);
	}
}