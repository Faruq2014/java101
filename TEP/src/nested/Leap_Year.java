package nested;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		byte year;

		Scanner scanner=new Scanner (System.in);

		System.out.println(" Enter a year");

		year= (byte) scanner.nextInt();

		if (year%4 ==0 && year%100!=0)

		System.out.println("it is a leap year");

		else if  ((year%4==0) && (year%100==0) &&(year %400==0))

			System.out.println("this is a leap year");

		 else

			{System.out.println("this is not a leap year");}

	}

}
