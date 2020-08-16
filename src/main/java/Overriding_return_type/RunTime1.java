package Overriding_return_type;



public class RunTime1 {
	
	
	RunTime1 wealth(double cash,double land){ //method signature
		double total = (cash+land)/3;
		System.out.println("3 kids inherit from father"+total);
		return this;
	}

/*
 * 1.	The arguments list or method name or 
 * method signature has to be the same in both 
 * parent and child classes. That means overriding 
 * and   overridden method signature must be the same. 
 * But remember in over loading method signature must be different.
 */
	
}
