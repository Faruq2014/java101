package nested;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int marks;
    
    Scanner input = new Scanner (System.in);
    System.out.println("enter your marks");
    marks= input.nextInt();
    
    if(marks <60){System.out.println("Fail because you are a dummy ");}
    
    else if(marks >=60 && marks <70){System.out.println("grade d");}
    
    else if(marks >=70 && marks <80){System.out.println("grade c");}
    
    else if(marks >=80 && marks <90){System.out.println("grade b");}
    
    else if(marks >=90 && marks <=100){System.out.println("grade a");}
    
    else {System.out.println("idiot, dont even know your own marks");}
		
		}

}
