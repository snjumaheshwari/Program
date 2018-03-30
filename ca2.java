import static java.lang.Math.sqrt;
import java.util.Scanner;
interface A{
	public abstract boolean isOdd(int n);
}
interface B{
	public abstract boolean isPrime(int n);
}

interface C{
	public abstract boolean isPalindrome(int n);
}

class ca2{	
	private static final Scanner Sc=new Scanner(System.in);
	public static void main(String args[])
	{
		A a=(n)->(n%2!=0);
		int num=Sc.nextInt();
		System.out.println("Number is odd"+a.isOdd(num));
		B b=(n)->{
		
			boolean flag=true;
			
			if(n<2)
				flag=false;
			
			int limit =(int)(sqrt(n));
			
			for(int j=2;j<=limit;j++)
			{
					if(n%j==0)
					{
						flag=false;
						break;
					}
				
			}
			return flag;
			
		};
		
		System.out.println("number is prime "+b.isPrime(num));
		
		C c=(n)->{
			int m=n;
			int reverse=0;
			int rem=0;
			while(n!=0)
			{
				rem=n%10;
				reverse=reverse*10+rem;
				n=(int)(n/10);
			}
			//System.out.println(m+" "+reverse);
			return (m==reverse);
		};

		
		System.out.println("number is palindrome "+c.isPalindrome(num));
	}
	
}
