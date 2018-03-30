import java.util.Scanner;
//import java.lang.Math;
class Division{
	// Divide two integers without using multiplication, division and mod operator
	static int fun(int divident,int divisor){
		int count=0;
		int flag=1;
		
		//if(divident/divisor)< 0 flag=-1
		if((divident <0 && divisor >0 ) ||( divident >0 && divisor <0))
		{
			flag=-1;
		}
		divident=Math.abs(divident);
		divisor=Math.abs(divisor);
		
		while(divident-divisor>=0)
		{
			count++;
			divident=divident-divisor;
		}
		return count*flag;
	}
	
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		int divident=sc.nextInt();
		int divisor=sc.nextInt();
		System.out.println(fun(divident,divisor));
	}
}