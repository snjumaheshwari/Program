// wap to define an interface person containing abstarct method which return object of aadharcard class..
// create a class student 


import java.util.*;  

interface Person{
	public abstract void method( );
}

class Student implements Person{  
    int reg_no;  
    String name;  
	static int i=1;
	
	class AadharCard{
		public String aadhar_no;
		
	}
	public AadharCard method()
	{
		Student.AadharCard a= new AadharCard();
		a.aadhar_no="ind"+i;
		return a;
	}
      
    Student(String n){ 
	//Student.AadharCard a= new AadharCard();
	//AadharCard.aadhar_no="ind"+i;
	
    reg_no = i;
    name = n; 
		
    }  
    void display(){
		//Student.AadharCard a= new AadharCard();
		System.out.println(reg_no+" "+name);
		}  
	
	public static void main(String [] ar)
	{
		Student s1=new Student("Sanjay");
		Student s2=new Student("Avinash");
		Student s3=new Student("Abhilash");
		
		ArrayList<Student> list=new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Student s:list)  
			s.display();
	}  
   
 
} 