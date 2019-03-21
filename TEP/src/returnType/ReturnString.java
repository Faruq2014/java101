package returnType;
/**
This program demonstrates a method that
returns a reference to a String object.
*/
public class ReturnString {

	 public static void main(String[] args)
	   {
	      
		 String customer = ReturnString.fullName("Faruq", "Molla");
		 /*Static method, so access by class name.
		  *  // creating reference "customer" object to hold the value
		  */
	     System.out.println(customer);
	     //System.out.println(ReturnString.fullName("Faruq", "Molla")); 
	     /*
	      * another way to print value, but jvm is not holding this value. it is only good for printing the value.
	      * it is not preferable way.
	      */
	     
	     ReturnString rs = new ReturnString();
	   String daughter=  rs.fullName("Fabiha", "Anjum", "Fima");
	   System.out.println(daughter);
	   /*Instance method, so access by creating reference.
		  *  // creating reference "daughter" object to hold the value
		  */
	   }
	   
	   
	   
	   public static String fullName(String first, String last)
	   {
	      String name;
	      
	      name = first + " " + last;
	      return name;
	   }
	   
	   public  String fullName(String first, String middle, String last) // method overloading
	   {
	      String name;
	      
	      name = first + " " + last+ " " + middle;
	      return name;
	   }
}
