abstract class Figure{
	int d1,d2;
	Figure(int d1,int d2)
	{
		this.d1=d1;
		this.d2=d2;
	}
	abstract  void area();
	void meth()
	{
		System.out.println("abstract class ka method");
	}
	
	
}
class Rect extends Figure{
	Rect(int a,int b)
	{
		super(a,b);
		
	}
	
	void area()
	{
		System.out.println(d1*d2);
	}
	void meth()
	{
		System.out.println("Rectangle class ka method ");
	}
	
	
}
class Test{
	public static void main(String[] ar)
	{
		Rect r = new Rect(10,20);
		Figure f =new Rect(10,2);
		//f.area();
		f.meth();
		System.out.println(f.d1);
		System.out.println(f.d1);
		r.area();
	}
	
}

// can abstract class have no abstract method ? => yes..
// can abstract class have any non abstract methods ? => Yes
// can abstract class be final ? => no..
// can we create object of abstract class ? => No


// create a final abstractclass.

// define all concerete methods in an abstract..
// create an class with abstratc and concerete method..
// create abstract class with only abstarct method..
// inherit abstract class and do not define the abstract method in sub class..
// try inheriting a final method..
// try overriding a final method..
// work out with final variable..
// declare a final variable without initilizing it..
// try to create an object 
