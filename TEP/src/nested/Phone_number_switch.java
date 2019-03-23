package nested;

import java.util.Scanner;

public class Phone_number_switch {

	 static  String phone = "faruq phone";

		



		public static void main(String[] args) {

		

			

			System.out.println(Phone_number_switch.phone );

			

			

			Phone_number_switch p = new Phone_number_switch();

		   p.pnumber();

		   p.speeddail();

		}

		

		public  void pnumber(){

			int sd;

			 

			    Scanner input = new Scanner (System.in);

			    System.out.println("enter your speed dail1");

			    sd= input.nextInt();

		

		    switch (sd){

		    case 1:System.out.println("calling khleed");break;

		    case 2:System.out.println("calling selim");break;

		    case 3:System.out.println("calling shaheen");break;

		    case 4:System.out.println("calling joney");break;

		    case 5:System.out.println("calling faruq");break;

		    default:System.out.println("invalid ph");

		    break;

		    }

		   

		   }

		 public void speeddail(){

			 int ph_num;

			 Scanner input = new Scanner (System.in);

			    System.out.println("enter phone number");

			    ph_num= input.nextInt();

			   

			 switch (ph_num){

			    case 571275983:System.out.println(" calling khaleed");break;

			    case 7000:System.out.println("calling selim");break;

			    case 8000:System.out.println("calling shaheen");break;

			    case 9000:System.out.println("calling joney");break;

			    case 10000:System.out.println("calling faruq");break;

			    default:System.out.println("invalid ph");

			    break;

			    }

			 

			 

		 }
}
