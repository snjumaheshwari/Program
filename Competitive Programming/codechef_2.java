import java.util.Scanner;
import static java.lang.Math.sqrt;
class Problem{
	// program to check valid triangle or not..
	public static void main(String [] ar)
	{
			Scanner sc=new Scanner(System.in);
			int test=sc.nextInt();
			
			for (int i=0;i<test;i++)
			{
				int A=sc.nextInt();
				int B=sc.nextInt();
				int C =sc.nextInt();
				
				if(A+B+C==180 && A>0  && B>0 && C>0)
					System.out.println("YES");
				else
					System.out.println("NO");
				
				
			}
		
	}
	
	
}

class Problem2{
	// program to check if it is palindrome or not
	public static void main(String [] ar)
	{
			Scanner sc=new Scanner(System.in);
			int test=sc.nextInt();
			
			for (int i=0;i<test;i++)
			{
				
				int n=sc.nextInt();
				int m=n;
				int reverse=0;
				int rem=0;
				while(n!=0)
				{
						rem=n%10;
						reverse=reverse*10+rem;
						n=n/10;
				}
				if(reverse==m)
					System.out.println("wins");
				else	
					System.out.println("losses");
			}
		
	}
	
	
}

class Problem3{
// program to check if number is prime or not.
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
			
		for (int i=0;i<test;i++)
		{
				
			int n=sc.nextInt();
			boolean flag=false;
			
			if(n>=2)
				flag=true;
			
			
			int limit =(int)(sqrt(n));
			
			for(int j=2;j<=limit;j++)
			{
					if(n%j==0)
					{
						flag=false;
						break;
					}
				
			}
			if(flag==true)
					System.out.println("yes");
			else
				System.out.println("no");
			
		}
	
	}

}

/*  /////////////////////////////////////////////////
*/
class Problem_4{
	// write a program to find sum of 2 smallest number ... from given array..
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			int n=sc.nextInt();
			
			int smallest=10000;
			int second=10000;
			for(int j=0;j<n;j++)
			{
				int x= sc.nextInt();
				if(x<=smallest)
				{
					second=smallest;
					smallest=x;
				}
				else if(x<=second)
				{
					second=x;
				}
			
			}
			System.out.println(smallest+second);
		}
	}
	
	
}

class Problem_5{
	// write a program to find sum of digits..
	public static void main(String [] ar)
	{
		Scanner sc= new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			int n=sc.nextInt();
			int sum=0;
			int rem;
			while(n!=0)
			{
				rem=n%10;
				n=n/10;
				sum=sum+rem;
			}
			System.out.println(sum);
			
		}
		
	}
	
	
}

class learning{
	public static void main(String [] ar)
	{
	//double b; // take any type.. like int, float, boolean etc..
	// System.out.println(b);
		
	// error :- variable b might not be initilized..
	int n=15;
	int x=(int)(sqrt(n));
	System.out.println(x);
	
	// python allows but java does not allows...
	/*
	for i in range(n):
		for i in range(m):
			print("hello")
	*/
	int i;
	for(/*int*/i=0;i<2;i++)
	{
		for(/*int*/ i=1;i<2;i++)
			System.out.println("hello");
	}
	// works fine ..
	}
	
}

