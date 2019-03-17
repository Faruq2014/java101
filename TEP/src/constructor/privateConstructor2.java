package constructor;

public class privateConstructor2 {

	public static void main(String[] args) {
		PrivateConstructor1.employee(); 
		// static method calling
        // it doesn't matter for static method that constructor is private or not.
		//static method doesn't need constructor because constructor 
		//inistitiate instance variable and method. 
		System.out.println(); // empty print statement for space
		/*
		 * we are calling PrivateConstructor1 class, which has private constructor.SO
		 *  #1 it is not possible to access from other class.
		 * #2 we can not use new key word to create constructor. SO
		 * thats why we create static factory method to create constructor
		 * with the help of constructor we can create as many object as we want.
		 */
		
		PrivateConstructor1 pc	=  PrivateConstructor1.getObjectForPrivateConstructor1();
		                    
		                    pc.tutionFee("faruq",111,5000.000);
		                    System.out.println();
		                    
	  PrivateConstructor1 pc1= PrivateConstructor1.getObjectForPrivateConstructor1();
	                      pc1.tutionFee("khaleed",222,9999.999);
                           System.out.println();
                           
	  PrivateConstructor1 pc2= PrivateConstructor1.getObjectForPrivateConstructor1();
	                      pc2.tutionFee("selim",333,6666.66);
	                      
	 
	}                    

}
