package Inheritance.Single;

public class p {
	int cash=5;              // instance variable
	String car="sky blue";
	p(){}
	p(String car,int cash){ // Initializing by constructor
		this.cash=cash;
		this.car=car;
	}

	
	public void m1(String car, int cash){ // local method
		
		
	System.out.println("local"+" "+cash+"cash"+" "+car);
		
	}
	public void m1(String car, int cash, double land){ // method overloading
		 land=666; // local variable
		
		System.out.println(cash+"cash"+" "+car+" "+land);
			
		}

}
