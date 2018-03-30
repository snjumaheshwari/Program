abstract class Demo{
	Demo(){
	print();
	}
	abstract void print();
}	

class main extends Demo{
int y;
	main(){
	y=90;
	}	

	void print()
	{
	System.out.println(y);
	}


	public static void main(String ... ar)
	{
	main m=new main();
	}

}

// output :-0