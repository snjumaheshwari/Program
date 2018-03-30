class Test{
	// does java supports goto statement ?
	/*
	 ans :- No..
	
	
	
	*/
	
	public static void main(String[] ar)
	{
		loop1:
		for(int i=0;i<10;i++)
		{
			loop2:
			
			for(int j=0 ;j<5;j++)
			{
				loop3:
				
				for(int k=0;k<3;k++)
				{
					if(j==1)
						break loop2;
					System.out.println(i+" "+j+" "+k);
				}
			}
		
	}
	


}
}

class Test2{
	public static void main(String[] ar)
	{
			//int goto;
			//int null; 
			int a$=3;
		//	String s1="नमस्ते" ;
			System.out.println(s1);
	}
}