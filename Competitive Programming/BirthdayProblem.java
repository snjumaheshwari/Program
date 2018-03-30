import java.lang.Math;

class Problem{
	//How many people must be there in a room to make the probability 50% that two people in the room have same birthday?
	
	static double find(double p)
	{
		double x=2*365 * Math.log(1/(1-p));
		double d=Math.sqrt( x);
		//System.out.println(x+" "+d);
		return Math.ceil(d); 
	}
	
	public static void main(String[] ar)
	{
		System.out.println(find(0.50));
		System.out.println(find(0.70));
		System.out.println(find(0.90));
		System.out.println(find(0.99));
		System.out.println(find(1));
	}
	
	
}

