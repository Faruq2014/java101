package constructor;

public class FormatOfObjectCreation {

	FormatOfObjectCreation() {
		this(111); // constructor calling
		System.out.println("o argu");
	}

	FormatOfObjectCreation(int a) {
		System.out.println("1 argu");
	}

	public static void main(String[] args) {
		/*
		 * * Formats of objection creation; Approach: two type of approach Named object
		 * approach Test t = new test (); t is the name of the object, Nameless Approach
		 * // most recommended new test();
		 */
		FormatOfObjectCreation foc = new FormatOfObjectCreation(); // named approach for constructor
		foc.m1(); // named approach for method
		System.out.println(); // empty println for space
		
		
		

		new FormatOfObjectCreation();// nameless approach for constructor
		System.out.println();

		new FormatOfObjectCreation().m1(); // nameless approach for method
		
		
	}

	
	
	void m1() {
		System.out.println("method1");
	}

}
