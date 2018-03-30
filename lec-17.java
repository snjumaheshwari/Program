import java.time.*;
class Test{
	
	public static void main(String ar[])
	{
		LocalDate l=LocalDate.now();
		LocalTime t=LocalTime.now();
		
		System.out.println(l+" "+t);
		
		
		LocalDate l1=LocalDate.of(2010,Month.JANUARY,23);
		LocalTime t1=LocalTime.of(22,44,22); // hh-min-sec
		LocalTime t2=LocalTime.of(5,55,23,234); // hh-min -sec-ms
		System.out.println(l1);
		
		LocalDate l2=LocalDate.of(2012,6,21);
		System.out.println(l2);
		
		LocalDate l3=LocalDate.parse("1999-09-23");
		LocalTime t3=LocalTime.parse("11:22:14");
		System.out.println(l3);
		
		System.out.println(t2);
		System.out.println(t1);
		System.out.println(t3);
		
		
	}
	
	
}