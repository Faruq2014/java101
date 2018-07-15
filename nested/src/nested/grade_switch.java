package nested;

import java.util.Scanner;

public class grade_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int marks;
    Scanner input = new Scanner (System.in);
    System.out.println("enter your marks");
    marks= input.nextInt();
    
    switch (marks){
    case 60:System.out.println("fail");break;
    case 70:System.out.println("d");break;
    case 80:System.out.println("c");break;
    case 90:System.out.println("b");break;
    case 100:System.out.println("a");break;
    default:System.out.println("invalid marks");
    break;
    
   }
		
  }

   }
