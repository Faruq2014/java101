package returnType;

public class ReturnVoid {

	 void M1(int a, int b) 
	    { 
	        int sum = 0; 
	        sum = (a + b) / 10; 
	        System.out.println(sum); 
	        // no return statement in this method 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        new ReturnVoid().M1(5, 5); 
	    } 
}
