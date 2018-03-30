import java.util.Scanner;
class Main{

public static void main(String [] ar)
{
	Scanner sc=new Scanner(System.in);
	int test=sc.nextInt();
	
	while(test>0)
	{
		test--;
		
		double a=sc.nextInt();double b=sc.nextInt();double c=sc.nextInt();double d=sc.nextInt();double e=sc.nextInt();
		
		double speed=a+((d*180)/e);
		
		double sd,fd; // sd is error in sebi and fd is error in father..
		
		
		if(speed >=b)
			sd=speed-b;
		else
			sd=b-speed;
		
		if(speed >=c)
			fd=speed-c;
		else
			fd=c-speed;
		
		
		if(sd==fd)
			System.out.println("DRAW");
		else if( sd<fd)
			System.out.println("SEBI");
		else
			System.out.println("FATHER");
	
	}
}

}

/*


#include <iostream>
using namespace std;
int main() {
   double s,sg,fg,total,ns,nf,time1,d;
   long t;
   cin>>t;
   while(t>0){
      cin>>s>>sg>>fg>>d>>time1;
      total=((d*180)/time1)+s;
      if(total>sg)
      	ns=total-sg;     
      else
      	ns=sg-total;
      if(total>fg)
      	nf=total-fg;
      else
      	nf=fg-total;
      if(nf>ns)
      	cout<<"SEBI\n";
      else if(nf<ns)
      	cout<<"FATHER\n";
      else
      	cout<<"DRAW\n";
	t--;
	}
    return 0;
}

*/