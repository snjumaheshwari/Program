import java.util.Scanner;

class Main{

public static void main(String ... ar)
{
	Scanner sc=new Scanner(System.in);
	int test=sc.nextInt();
	
	while(test>0)
	{
		int a=sc.nextInt();
		test--;
		
		int a[]=new int[n];
		boolean sorted=true;
		boolean flag=true;
		
		boolean b[]=new boolean[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=false;

		}
		// if array is sorted => return False.
		
		for (int i=0;i<n;i++)
		{
			if(a[i] !=i+1)
			{
				sorted=false;
				break;
			}
		}
		
		
		// if any number is missing or duplicated => return False
		for(int i=0;i<n;i++)
		{
			if(a[i]>=n+1)
			{
				flag=false;
				break;
			}
			else
				b[a[i]-1]=true;
		}
		
		
		// return True..
		// if sorted is true or flag is false => return false
		
		
		for(int i=0;i<n;i++)
		{
			if(b[i]==false)
			{
				flag=false;
				break;
			}
		}
		if(sorted || !flag)
			System.out.println("no");
		else
			System.out.println("yes");
		
		
		
	}
}

}