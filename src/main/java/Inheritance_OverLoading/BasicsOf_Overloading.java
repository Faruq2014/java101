package Inheritance_OverLoading;

public class BasicsOf_Overloading {

	public static void main(String[] args) {
		/* What is method overloading?
		 * Method Overloading is a feature that allows a class to have more than one
		 * method having the same name, if their argument lists are different. It is
		 * similar to constructor overloading in Java, that allows a class to have more
		 * than one constructor having different argument lists.
		 * 
		 */
// How many ways can we do method overloading?
		/*
		 * Three ways to overload a method
		 * 1. Number of parameters.
		 * add(int, int)
           add(int, int, int)
		 * 
		 * 2. Data type of parameters.
		 * add(int, int)
           add(int, float)
           3. Sequence of Data type of parameters.
           add(int, float)
           add(float, int)
		 */
		
		// same name but different data type?
		/*
		 * Invalid case of method overloading: When I say argument list, I am not
		 * talking about return type of the method, for example if two methods have same
		 * name, same parameters and have different return type, then this is not a
		 * valid method overloading example. This will throw compilation error.
		 * int add(int, int)
           float add(int, int)
		 */
		// what type of plymorphism is method overloading?
		/*
		 * Method overloading is an example of Static Polymorphism.
		 * 
		 * Points to Note: 1. Static Polymorphism is also known as compile time binding
		 * or early binding.
		 *  2. Static binding happens at compile time. Method
		 * overloading is an example of static binding where binding of method call to
		 * its definition happens at Compile time.
		 */
		
		   BasicsOf_Overloading obj = new BasicsOf_Overloading();
			/* I am passing float value as a second argument but
			 * it got promoted to the type double, because there
			 * wasn't any method having arg list as (int, float)
			 */
			obj.disp(100, 20.67f);
	
	}
	void disp(int a, double b){
		System.out.println("Method A");
	   }
	   void disp(int a, double b, double c){
		System.out.println("Method B");
	   }
	 

}
