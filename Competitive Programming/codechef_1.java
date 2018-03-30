import java.util.Scanner;

class Codechef{
	public static void main(String ar[])
	{
	Scanner sc= new Scanner(System.in);
	int test=sc.nextInt();
	
	for(int i=0;i<test;i++)
	{
		int n=sc.nextInt();
		//1,2,5,10,50,100
		int count=0;
		count=(int)(n/100);
		n=n%100;
		
		count=count+(int)(n/50);
		n=n%50;
		
		count=count+(int)(n/10);
		n=n%10;
		
		count=count+(int)(n/5);
		n=n%5;
		
		count=count+(int)(n/2);
		n=n%2;
		
		count=count+n;
		System.out.println(count);	
	
	}
	
	}
}

 /*
class Code_2{
	public static void main(String ar[])
	{
	Scanner sc= new Scanner(System.in);
	int test=sc.nextInt();
	
	for(int i=0;i<test;i++)
	{
		int n=sc.nextInt();
		int x=(int)((n-2)/2);
		System.out.println((int)(x*(x+1)*0.5));	
	
	}
	
	}
}

//import java.util.Scanner;
 
class Problem{
public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		int test=sc.nextInt();
		for (int i=0;i<test;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			if(a>b)
				System.out.println(">");
			else if(a<b)
				System.out.println("<");
			else
				System.out.println("=");
		}
	}
 
}


class KFib{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();
	int k=sc.nextInt();
		

	fun(n,k);	

	}



}

*/





//import java.utli.Scanner;

class solution{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	int test=sc.nextInt();
	int count=0 ;// even count + ... odd count -
	for(int i=0;i<test;i++)
	{
		int x=sc.nextInt();
		if(x%2==0)
			count++;
		else
			count--;
	}
	if(count>0)
		System.out.println("READY FOR BATTLE");
	else
		System.out.println("NOT READY");	
	
	}


} 


class cost{
	
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	int test=sc.nextInt();
	//int count=0 ;// even count + ... odd count -
	for(int i=0;i<test;i++)
	{
		int quantity=sc.nextInt();
		int price =sc.nextInt();
		double cost=quantity*price;
		
		if(quantity >=1000)
			cost=cost*0.90;
		System.out.println(cost);
	}
}	
	
}