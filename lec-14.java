class Test{
	public static void main(String[] ar)
	{
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder("ab");
		StringBuilder sb3=new StringBuilder(40);
		
		sb2.append("12345678901234567890");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		
	}
}
class Test2{
	// write a program to check weather a string is palindrome or not..
	public static void main(String[] ar)
	{
			String s1=ar[0];
			int i=0;
			int l=s1.length();
			boolean flag=true;
			while(i<=l)
			{
				if(s1.charAt(i)!=s1.charAt(l-1))
				{
					flag=false;
					break;
				}
				i++;
				l--;
				
			}
		System.out.println(flag);
		
	}
}

class Test2{
	// write a program to check weather a string is palindrome or not..
	public static void main(String[] ar)
	{
			String s1=ar[0];
			
			StringBuilder sb=new StringBuilder(ar[0]);
			sb.reverse();
			
			if(ar[0].equals(sb.toString()))
			{
				System.out.println("true");
			}
			else
				System.out.println("false");
			
			/*
			boolean flag=true;
			while(i<=l)
			{
				if(s1.charAt(i)!=s1.charAt(l-1))
				{
					flag=false;
					break;
				}
				i++;
				l--;
				
			}
		System.out.println(flag);
		*/
		
	}
}


class Test3{
	
	
	
}