import java.util.Scanner;
/*
def problem():
	test=int(input())
	for i in range(test):
		waste,price=map(int,input().split())
		paid=list(map(int,input().split()))
		total=sum(paid)
		min_paid=min(paid)
		want=total//price
		extra=total-(want*price)
		if(extra >= min_paid):
			print("-1")
		else :
			print(want)
*/

class Solution{
	public static void main(String ar[])
	{
		int test;
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			int n=sc.nextInt();
			int price=sc.nextInt();
			
			int paid[]=new int[n];
			for (int j=0;j<n;j++)
				paid[j]=sc.nextInt();
			
			int sum=0;
			int min=paid[0];
			for(int j=0;j<n;j++)
			{
				sum=sum+paid[j];
				if(paid[j]<min)
					min=paid[j];
			}
			int want=(int)(sum/price);
			int extra=sum-(want*price);
			if(extra >=min)
				System.out.println("-1");
			else
				System.out.println(want);
		}
		
	}
	
	
}