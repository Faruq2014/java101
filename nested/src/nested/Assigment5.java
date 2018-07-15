package nested;

import java.util.Scanner;

public class Assigment5 {

	public static  void main(String[] args) {
		int eggs;
		int dozzens;
		int extras;
		 Scanner scanner = new Scanner(System.in);
		System.out.println("how manny eggs do you have");
		eggs = scanner.nextInt();
		dozzens = eggs/12;
		extras = eggs %12;
	System.out.println("your dozzens of eggs are " + dozzens);
	System.out.println( "your extras eggs are " + extras );
		
		
		
		
		
		

	}

}
