interface Calculate{
	double operate(int a,int b);
}

class Demo{
	public static void main(String [] ar)
	{
		
		Calculate add=(a,b)->a+b;
		Calculate sub=(a,b)->a-b;
		Calculate mul=(a,b)->a*b;
		Calculate div=(a,b)->a/b;
		
		System.out.println(add.operate(10,20));
		System.out.println(sub.operate(10,20));
		System.out.println(mul.operate(10,20));
		System.out.println(div.operate(10,20));
		
	}
	
}