import java.util.Scanner;


class CheckPrime{
	public static void main(String ar[])
	{
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	boolean flag=true;
	
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			flag=false;
			break;
		}
	}
	
	if (n<=1)
		flag=false;
	
	if(flag==true)
	{
		System.out.println("Number is Prime");
	}
	else
	{
		System.out.println("Number is not Prime");
	}
}
}