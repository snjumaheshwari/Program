interface A{
	String concat(String s1,String s2);
}
class demo{
	
	public static void main(String []ar)
	{
		A obj=(s1,s2)->s1+s2;
		
		System.out.println(obj.concat("hello","world"));
	}
}
/*
class demo1 implements A{
	String concat(String s1, String s2)
	{
			return s1+s2;
	}
	public static void main(String ar[])
	{
		
	}
}
*/