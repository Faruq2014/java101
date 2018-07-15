package nested;
import java.util.*;
public class leap_year {
	public static void main(String[] args) {
		

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

}
