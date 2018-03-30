import java.util.Scanner;

class Billing{  
	double price;
	int quantity;
	
    double computeBill(double price)
    {
		double cost=1.075*price;
    	//System.out.println(cost);
		return cost;
    }  
   
    double computeBill(double price,int quantity)
    {
		double cost=1.075*price*quantity;
    	//System.out.println(cost);
		return cost;
    	
    }  
	
      double computeBill(double price,int quantity,double coupon)
    {
		double cost=(price*quantity-coupon)*1.075;
    	//System.out.println(cost);
		return cost;
    	
    }  
	
    public static void main(String args[]){  
    Billing obj=new Billing();  
    double d1 =obj.computeBill(100);  
    double d2=obj.computeBill(20,20);  
	double d3=obj.computeBill(100,10,5);
	System.out.println(d1+"  "+d2+"  "+d3);
    
    }  
  }

  
  class StringTest{
	  public String readString()
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter a string");
		  
		  String s=sc.next();
		  return s;
	  }
	  public int countCharacter(String s,char c)
	  {
		  int count=0;
		  for(char i:s)
		  {
			  System.out.println(i);
			 if(i==c)
			  {
				  count++;
			}	  
		  }
		  return count;
	  }
	  
	  public static void main(String[] ar)
	  {
		 StringTest s1=new StringTest();
		
		System.out.println(s1.countCharacter("hello world",'o'));  
	  }
	  
  }
  