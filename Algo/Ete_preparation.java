class Test1{
	static public void main(String args[]) {
	System.out.println("hello");
	}
	
}
class Test2{
	static public void main(String... args) {
		String a="पूजा ";
		System.out.println(args[0]);
	System.out.println("hello");
	}
	
}
/*
Object based programming language follows all the features of OOPs except Inheritance.
 JavaScript and VBScript are examples of object based programming languages.

*/
/*

To solve these problems, a new language standard was developed i.e. Unicode System.
In unicode, character holds 2 byte, so java also uses 2 byte for characters.
lowest value:\u0000
highest value:\uFFFF
*/

class OperatorExample{  
public static void main(String args[]){  
    //For positive number, >> and >>> works same
	
    System.out.println(20>>2);  
    System.out.println(20>>>2);  
    //For negative number, >>> changes parity bit (MSB) to 0  
	
    System.out.println(-20>>2);  
    System.out.println(-20>>>60);  
}}  

class Test3{
	public static void main(String[] ar)
	{
		    int x=10,y=5;
			while(x-- >7 || ++y<8)
				System.out.print(x);
			System.out.print(y);

		int	a=2 + + 4+ + +1;
			System.out.println(a);
	}
	
}
class StringBufferExample{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello ");  
sb.append("Java");//now original string is changed  
System.out.println(sb);//prints Hello Java  
}  
}  