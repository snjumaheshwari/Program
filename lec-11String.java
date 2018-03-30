class Test{
	public static void main(String [] ar)
	{
		String s1="hello";
		String s2=new String("hello");
		
		String s3=new String(s1);
		
		char ch[]={'h','e','l','l','o'};
		String s4=new String(ch);
		
		System.out.println("s1= "+s1);
		System.out.println("s2= "+s2);
		System.out.println("s3= "+s3);
		System.out.println("s4= "+s4);
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);
		System.out.println(s1==s4);
		System.out.println(s3==s4);
		System.out.println(s2==s4);
		
		
		
		System.out.println(s1.equals(s3));
		s1=s2;
		
		System.out.println(s1==s2);
				
		
	}
	
	
}
// *************************************************************
class Test2{
	public static void main(String ar[])
	{
		String s1="hello";
		String s2=new String("HeLLo");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
			
	}
	
}

// **************************************************************

class Test3{
	public static void main(String ar[])
	{
		String s1="hello";
		String s2=new String(" World ");
		
		String s3=s1+s2;
		s1=s1+" add text";
	
		System.out.println(s1);
		System.out.println(s3);
		
			
	}
	
}

class Test4{
	public static void main(String ar[])
	{
		String s1="hello";
		String s2=new String("hello");
		String s3="hello";
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
	}
	
	
}

class Test5{
	public static void main(String ar[])
	{
		//String s1="hello";
		String s2=new String("hello");
		String s3="hello";
		
		//System.out.println(s1==s2);
		System.out.println(s2==s3);  // false
		// System.out.println(s1==s3);
	}
	
	
}




