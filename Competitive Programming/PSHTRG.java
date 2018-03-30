//physty and triangle... using java ... and segment Tree

import java.util.Scanner;

class Solution{
	
	static void update(int a[], int position, int value)
	{
		
	}
	static void find(int a[], int lower, int upper)
	{
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		
		
		
		for (int i=0;i<m;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			if(x==1)
				update(a,y,z);
			else
				find(a,y,z);
		}
	
	}
	
}