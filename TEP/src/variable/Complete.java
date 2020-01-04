package variable;

public class Complete {
	
	 static String FamillyName = "Molla";  //static variable
	 
	 // instance variable
	  String FirstName;
	  String Address;
	
	  public static void main(String[] args) {
		  Complete c = new Complete();//static area but non static method. so we have to create
		c.MollaFamillyAlexandria();      // an object to call non static method. this is called method calling.
       c.mollaFamilyArlington();       
       Complete.mollaFamillyFallsChurch();   // static area, static method,so direct calling by class name. method name
	}

	 void MollaFamillyAlexandria(){
		
		//FamillyName= "Molla,";   //FamillyName static so only write one time.
	   Address = "8103 pinelake ct, alexandria va 22309";
	  
	  FirstName= "Faruq"; // but FistName is instance variable, so i have to change with every object
  System.out.println( FirstName+ " "+FamillyName+" "+Address );
	 
  FirstName= "Mannan";
	 System.out.println( FirstName+ " "+ FamillyName +" "+ Address );
	 
	 FirstName= "Fabiha";
	 System.out.println( FirstName+ " "+ FamillyName +" "+ Address );
	}
	public void mollaFamilyArlington(){
		
		 
		Address = "4535,12 rd, arlington, va 22209";
		  
		FirstName= "Khaleed"; //firstname is an instance variable, so only change value every time.
		
		int age=38;  //but age is a local variable, so have to change variable name ( age1,age2) 
		             // and also value of the variable (38,5).
	System.out.println( FirstName+ " "+ FamillyName +" "+"age,"+age+" "+ Address );
	 
	FirstName= "Elan";
	 int age1=5;
	 System.out.println(FirstName+ " "+ FamillyName +" "+"age"+age1+" "+ Address );
	 
	 FirstName= "Ruba";
	 int age2=28;
	 System.out.println( FirstName+ " "+ FamillyName +" "+"age"+age2+" "+ Address );
	 
	}
	protected static void mollaFamillyFallsChurch(){
		int age =55;                         //Local variable
		
		Complete c = new Complete(); 
		 c.Address = "6789 Rio Dr, Falla Church va 22402";
		   c.FirstName= "Selim";
		 // instance variable but static area. we have to create reference   
		    
	   System.out.println( c.FirstName+ " "+FamillyName+" "+ c.Address );
		   // static area but non static variable, so no return.
		     System.out.println( FamillyName+" "+age ); 
		// only static and local variable is returning value.
	}

}
