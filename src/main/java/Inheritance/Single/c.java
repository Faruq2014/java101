package Inheritance.Single;

public class c extends p{
	int gold;
	String house;
	c(){}
	c(String car, int cash,int gold,String house){
		super(car,cash); // calling parent constructor
		this.gold=gold;  // initializing instance variable
		this.house=house;
	}
	
public void m1(String car, int cash){ // overriding m1 method
		super.m1("yellow", 2000);   // calling parent method
		
		System.out.println("super variable"+" "+super.cash+"cash"+" "+super.car);
		// calling parent class variable
		System.out.println("method calling"+" "+cash+"cash"+" "+car);
		System.out.println();
		super.m1("black", 999, 666.5);// over loading method from parent 
	}

public void m2( int gold, String house){ // child class local method
	
	System.out.println("instance var"+" "+this.gold+" "+this.house+"house");
	// this always refer instance variable
	System.out.println("m2 method"+" "+gold+" "+house+"house");
	

	
}

}
