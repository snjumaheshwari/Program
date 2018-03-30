interface A{

void meth(int x);
}

class Test{
	public static void main(String [] ar)
	{
		A showX=(x) ->{
		System.out.println(x);
		System.out.println("bye");
		};

		A Xadd =x-> { System.out.println(x+10);};
		
		showX.meth(10);
		Xadd.meth(10);
	}
	
}