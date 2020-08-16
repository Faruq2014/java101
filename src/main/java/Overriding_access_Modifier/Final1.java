package Overriding_access_Modifier;

import java.util.Scanner;

public class Final1 {
public final void  m1(){
	
	int year;
	Scanner scanner=new Scanner (System.in);
	System.out.println(" Enter a year");
	year= scanner.nextInt();
	
	if (year%4 ==0 && year%100!=0)
	System.out.println("it is a leap year");
	
	else if  ((year%4==0) && (year%100==0) &&(year %400==0))
		System.out.println("this is a leap year");
	
	 else
		{System.out.println("this is not a leap year");}

}
public void m2(){
	for (int i= 50; i >=0; i--){
		System.out.println(i);
	}
}
     
}
