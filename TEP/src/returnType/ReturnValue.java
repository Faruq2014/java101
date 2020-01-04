package returnType;

public class ReturnValue {

	 // Since return type of RR method is double 
    // so this method should return double value 
    double M1(double a, double b) 
    { 
        double sum = 0; 
        sum = (a + b) / 2.0; 
        // return statement below: 
        return sum; 
        
    } 
    public static void main(String[] args) 
    { 
        System.out.println(new ReturnValue().M1(6.0, 6.0)); 
    } 
}
