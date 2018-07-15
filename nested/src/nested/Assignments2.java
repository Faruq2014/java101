package nested;

import java.util.Scanner;

public class Assignments2 {
	static int quarter;
	static int dime;
	static int nickle;
	static int penny;
	static double dollar;

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter how many quarter to add : ");
         quarter = scanner.nextInt();
         
     
        System.out.println("Enter how many dime to add :");
         dime = scanner.nextInt();
        
        System.out.println("Enter how many nickle to add :");
         nickle = scanner.nextInt();
     
        System.out.println("Enter how many penny to add :");
         penny = scanner.nextInt();
        
         dollar = (0.25 * quarter) + (0.10 * dime) 
                 + (0.05 * nickle) + (0.01 * penny); 

     
       System.out.println("total" + dollar);

     }
	
    }
