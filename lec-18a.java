


interface A{
	void meth();
	static void meth2(){
		System.out.println("static meth2 in interface A ");
	}
	default void meth3(){
		System.out.println(" default meth3 in interface B");
	}
}


class Demo2{

	public static void main(String ... ar)
	{
		A.meth2();
	}
	
}

class Demo implements A{
	public void meth(){
		System.out.println("meth1 is implemented");
	}
	
	public static void main(string ... ar)
	{
	A ob = new Test	();
	}
	
}

