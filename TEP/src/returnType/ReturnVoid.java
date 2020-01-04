package returnType;

public class ReturnVoid {

	 void M1(int a, int b) 
	    { 
	        int sum = 0; 
	        sum = (a + b) / 10; 
	        System.out.println("the total value of m1 "+" " +sum); 
	        // no return statement in this method 
	        
	    }
	 public int m2(int a, int b) {
		 int sum = (a+b)/1;
		// System.out.println("the total value of m2 "+" " +sum); 
	return sum;	 
	 }
	  
	    public static void main(String[] args) 
	    {    new ReturnVoid().M1(5, 5); 
	       //int total= new ReturnVoid().M1(5, 5);
	    /* since M1 method is void method, it is not have any return type.
	     * so it is not allowing to hold the value on int total. so we can not do any 
	     * other operation here with this method. what ever we done inside the method that
	     * is it.
	     */
	       int total = new ReturnVoid().m2(5, 5); 
	       System.out.println("the total value of m2 "+" " +total);
	       /*
	        * since m2 method is a return type method we can hold the value and do 
	        * further action.
	        */
	       
	    } 
}
