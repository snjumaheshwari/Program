/*
que 1. if marks >50 
	      result="pass"
	
	   a. String result= (marks<=50) ? "fail" :"pass";
	   b. Wrong Choise 
	   c. Wrong Choise
	   d. Wrong Choise


que 2. */
	   class Test{
		   public static void main(String args[])
		   {
			  String out="0";
			  int x=6,y=6;
			  if(x<=6)
				  if(y>0)
					  if(x>y)	
						  out+="1";
					  else
						  out+="2";
				  else out+="3";
			   else out+="4";	
			
			System.out.println(out);
		   }
		   
		   
	   }
	   
// answer:- 02


	
class StaticTest{
	int x=2;
	static{
		System.out.println("static block executing");
		// x=3; Error :- Non Static variable can not be accessed in static reference..
	}
	
	{
		System.out.println("init block executing");
		x=4;
	}
	
	public static void main(String[] ar)
	{
			StaticTest t1 =new StaticTest();
			System.out.println(t1.x);
		
	}	
}



class Test2{
	public static void main(String ar[])
	{
		int x=-1;
		int i=2;
		int ans;
		
		//ans= (++x +i--); // 2 
		//ans=(x++ + i--); // 1
		//ans=(x++ +--i); // 0
		//ans=(x++ + ++i); // 2
		  ans=(++x +i); //2
		
		System.out.println(ans);
	}
}

class Test3{
	static int i;
	public static void main(String ar[])
	{
		Test3 t1=new Test3();
		Test3 t2=new Test3();
		Test3 t3=new Test3();
		t1.meth();
		t2.meth();
		t3.meth();
		
		
	}
	void meth()
	{
		while(++i<3)
		{
			System.out.println("A");
		}
	}
	
}

// output :- A
//			 A
// concept :- Static variable => Retain Value..

class Test4{
	public static void main(String ar[])
	{
		boolean f=true;
		int i=2;
		String s="sanju";
		if(f=false)
		{
			System.out.println("false");
		}
		else if(f)
		{ 
		System.out.println("true");
		}
	
		System.out.println(f=false);  // it will print false..
		System.out.println(f=true);	 		// it will print true..
		System.out.println(i=3);  // it will print 3
		System.out.println(s="sa"); // it will return sa
		//whatever u assign it will return ..
	}	 
	
}

class Test5{
	public static void main(String[] ar)
	{
	
		for (int x=10; x>5;x++)
		{
			if(x==16) x-=11;
			System.out.println(x+" ");
		}
		// endless loop.
	}
	
}
// 8,27,64,100,125,216,343 => odd one out 100
// 396,462,572,427,671,264 => odd one out 427
/*
 6 7 9  ___ 6 8 6 => fill in the blanks...
 (i guessed first 6) => logic no logic :) 
 so that 1.avg will be integer 
		2. positive =negative
		3. more probable.
		4. lack of any other logic..
		5. may be less than symbol..												
*/
												
class Test6{
	public static void main(String ar[])
	{
	int x=10;
		while(x>0){
			do{
				x-=2;
			}while(x>3);
			x--;
			System.out.println(x);	
		}
		
	}
	//output :-
	//			 1
	//			-2
	
}
																				
class Test7{


}	
																					
																					


