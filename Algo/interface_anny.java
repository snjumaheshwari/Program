/*
--> Anonymus inner class does not have a name,hence it cannot have a
constructor of its own..

so to initialis the varibles of the anonymous inner class default constructor of the object 
class is invoked with the help of 
-->Anonymous inner class will always either
	- extend a class ( abstarct or concrete ), or
	- implement an interface..
--> Only one object can be created for an anonymous inner class .

*/
interface A{
	int x=90;
	void meth();
	
}
class Test{
	public static void main(String ar[])
	{
		A ob=new A(){
			public void meth(){
				
			}
		}
		
	}
	
}