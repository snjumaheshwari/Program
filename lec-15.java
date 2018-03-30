class Sup{
	int x,y;
	Sup(){
		x=10;
		y=20;
		System.out.println("Super Constructor");
	}
	
}
class Sub extends Sup{
	int z;
	Sub(){
		z=80;
		System.out.println("Sub Constructor");
	}
	
}

class Test{
	public static void main(String[] ar)
	{
		Sub d= new  Sub();
		System.out.println(d.x+" "+d.y+" "+d.z);
	}
	
}
// **********************************************************************************************************************
class Sup_{
	int x,y;
	Sup_()
	{
		System.out.println("Default sup");
	}
	Sup_(int x, int y){
		this();
		this.x=x;
		this.y=y;
		System.out.println("Super Constructor");
	}
	
}
class Sub_ extends Sup_{
	int z;
	Sub_(int z){
		super(10,20);
		this.z=z;
		System.out.println("Sub Constructor");
	}
	
}

class Test_{
	public static void main(String[] ar)
	{
		Sub_ d= new  Sub_(40);
		System.out.println(d.x+" "+d.y+" "+d.z);
	}
	
}
// **********************************************************************************
class Sup_1{
	int x,y;
	Sup_1()
	{
		System.out.println("Default sup");
	}
	Sup_1(int x, int y){
		this();
		this.x=x;
		this.y=y;
		System.out.println("Super Constructor");
	}
	
}
class Sub_1 extends Sup_1{
	int z;
	Sub_1(int x, int y,int z){
		super(x,y);
		this.z=z;
		System.out.println("Sub Constructor");
	}
	
}

class Test_1{
	public static void main(String[] ar)
	{
		Sub_1 d= new  Sub_1(10,20,40);
		System.out.println(d.x+" "+d.y+" "+d.z);

	}
}
// **************************************************************************************

//super is used to refer immediate parent class instance variable.
class Vehicle {
	int speed = 50;
	
}

class Bike extends Vehicle {
	int speed = 100;

	void display() {
		int speed=89;
		System.out.println(speed);
		System.out.println(this.speed);
		System.out.println(super.speed);
	}

	public static void main(String args[]) {
		Bike b = new Bike();
		b.display();

	}
}

// *************************************************************************************************

// super can be used to invoke parent class method

class Person {
	void message() {
		System.out.println("welcome");
	}
}

class Student extends Person {
	void message() {
		System.out.println("welcome to java");
	}

	void display() {
		message();// will invoke current class message() method
		super.message();// will invoke parent class message() method
	}

	public static void main(String args[]) {
		Student s = new Student();
		s.display();
	}
}

// ******************************************************************************

class Student3{  
int id=10;  
String name="Sanjay";  
  Student3()
  {
	  // default constructor ka kaam to ese bhi ho skta hai...
	  System.out.println("hello");
  }
void display()
{
	System.out.println(id+" "+name);
	
} 

public static void main(String args[]){  
Student3 s1=new Student3();  
Student3 s2=new Student3();
 
s1.display();  
s2.display(); 

}  
} 

// **************************************************************
// a very very important concept..
class Sup1{
	int x,y;
	Sup1(){
		x=10;
		y=20;
		System.out.println("Super Constructor");
	}
	void meth()
	{
		System.out.println("super class method");
	}
	
}
class Sub1 extends Sup1{
	int z,x;
	Sub1(){
		z=80;
		x=90;
		System.out.println("Sub Constructor");
	}
	void meth()
	{
		System.out.println("sub class meth");
	}
}

class Test2{
	public static void main(String[] ar)
	{
		Sup1 d= new  Sub1();
		d.meth(); // it will print sub class meth..
		System.out.println(d.x); // it will print x=10 i.e for super class..
	}
	
}
