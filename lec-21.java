// create a class named "outer" that further contains 
class Out{
	int y=90;
	static int z=99;
	void meth1(){
		int d=77;
		
		class In{
			int x=20;
			void inMeth(){
				System.out.println(d);
			}
		}
	
	
	//d=9;
	In ob =new In();
	System.out.println(ob.x);
	ob.inMeth();
	}
}

class Test{
	public static void main(String ar[])
	{
		Out o=new Out();
		o.meth1();
	}
	
}
