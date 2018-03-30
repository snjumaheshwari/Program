import java.util.Scanner;
class Test{
	public static void main(String ar[])
	{
			String s1="test string";
			char c=s1.charAt(3);
			
			System.out.println(c);
		
	}
	
}

class Test2{
	public static void main(String ar[])
	{
		String s1="test string";
		 char ch[]=new char [s1.length()];
		// char ch[]=new char[50];
		for (int i=0;i<s1.length();i++)
		{
			ch[i]=s1.charAt(i);
		}
	
		System.out.println(ch);
		
		int a[]={1,2,3,4,5};
		System.out.println(a);
		
		for (int i=0;i<s1.length();i++)
		{
			System.out.println(ch[i]);
		}
		// System.out.println(ch[98]+" "+ch[97]);
		
	}
	
	
}

class Test3{
	//  use of toCharArray :- converts an string to chararcter array..
	
	
	public static void main(String ar[])
	{
	String s1="test string";
	char ch[]=s1.toCharArray();
	
	System.out.println(s1.length());
	System.out.println(ch.length);
	
	for(char i :ch)
		System.out.print(i);
	
	System.out.println("\n-----");
			
	}
}

class Test4{
	
	public static void main(String ar[])
	{
	String s1="test string";
	// String s1="test "; 
	char ch[]=s1.toCharArray();
	
	String s2="ABCDEFGHI";
	s2.getChars(2,7,ch,4); // from index [2,7) => place it in ch at index 4... (i.e replace )
	// stringname.getChars(start,end,array name,array String index)
	 
	System.out.println(s2);
	
	for(char i :ch)
		System.out.print(i);
	
	System.out.println("\n-----");
	
	System.out.println("s1 in uppercase : "+s1.toUpperCase());
	System.out.println("s2 in lowercase: "+s2.toLowerCase());
	
	System.out.println(" s1 and s2 are unchanged see :- "+s1+ " "+s2);
	
	}
	
	
}

class Test5
{
	public static void main(String ar[])
	{
		String s1="test string";
		String s2="string match";
		
		boolean b=s1.regionMatches(5,s2,0,6); 
		// regionMatches => return true or false  dependes on matching a portion of string with other or not..
		// s1.regionMatches(start of s1, s2 , start of s2, no of characters to match)
		
		System.out.println(b);
		
		boolean b1=s1.regionMatches(5,s2,1,6);
		System.out.println(b1);
	}
	
}



class Test6{
	public static void main(String ar[])
	{
		String s1="test string";
		String s2="sTrIng match";
		
		String s3="demo in class";
		String s4="this is a demo";
		String s5="demo";
		
		
		
		boolean b=s1.regionMatches(5,s2,0,6); 
		// regionMatches => return true or false  dependes on matching a portion of string with other or not..
		// s1.regionMatches(start of s1, s2 , start of s2, no of characters to match)
		
		System.out.println(b);
		
		boolean b1=s1.regionMatches(5,s2,1,6);
		System.out.println(b1);
		
		boolean b2=s1.regionMatches(true,5,s2,1,6);
		System.out.println(b2);
		
		System.out.println(s3.startsWith(s5));
		System.out.println(s4.endsWith(s5));
		
		
	}
	
}


class Test7{
	public static void main(String ar[])
	{
		String s2="singh";
		/*
		String s[]={"pooja singh","sanjay maheshwari","uttarkash pratap singh","roshan sharma","youraj singh"};	
		for (int i=0;i<s.length;i++)
		{
			if(s[i].toLowerCase().endsWith(s2.toLowerCase()))
				System.out.println(s[i]);
		}
		*/
		
		String s1[]=new String[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter no ");
		int n=sc.nextInt();
		System.out.println(n);
		sc.nextLine();
		for (int i=0;i<n;i++)
		{
			s1[i]=sc.nextLine();
			//System.out.println(i+ s1[i]);
		}
		System.out.println(s1.length);
		
		for (int i=0;i<n;i++)
		{
			if(s1[i].endsWith(s2))
				System.out.println(s1[i]);
		}
		
	}
	
}
class Test8{
	public static void main(String ar[])
	{
			String s1="abcde";
			String s2="afgr";
			
			System.out.println(s1.compareTo(s2));
			
			String s3="This is a test issue";
			String s4="is";
			char c='t';
			
			System.out.println(s3.indexOf(s4));
			System.out.println(s3.indexOf(c));
			
			System.out.println(s3.lastIndexOf(s4));
			System.out.println(s3.lastIndexOf(c));
			
			System.out.println(s2.indexOf(s4,4));
			System.out.println(s3.indexOf(c,11));
			
	}
}

class Test9{
	// wap to count the no of occurance s2 in s1..
	public static void main(String ar[])
	{
		String s1="this is an issueless issue";
		String s2="is";
	// My logic :-	
		int count=0;
		int i=s1.indexOf(s2);
		while(i!=-1)
		{
			count++;
			i=s1.indexOf(s2,i+1);
		}
	// Harleen Ma'am make it shorter..	
		/*
			int i=-1,count=0;
			while( (i=s1.indexOf(s2,i+1)) >=0)
				count++;
		
		*/
			
		System.out.println(count);	
	}
}
