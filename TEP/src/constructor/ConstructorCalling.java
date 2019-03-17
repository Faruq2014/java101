package constructor;

public class ConstructorCalling {
	int a;
	int b;
	/*
	 * one constructor can call another. one constructor only can call one constructor(but one 
	 * method can call multiple methods). this key word will call another constructor.make sure this
	 *  Syntax always be the first statement inside the constructor brace.
	 *  
	 */
	ConstructorCalling(){
		this(10,50); // 0 argument constructor is calling 2 arguments constructor.
		System.out.println("0 argu cons");
		
	}
	
	ConstructorCalling(int a,int b){
		// 2 arguments constructor is calling sring arguments constructor.
		this("Faruq");  // this(); syntax is for calling constructor.
		this.a=a;       // this is a regular key word
		this.b=b;
		System.out.println("2 argu cons"+a+b);
		System.out.println();
	}
	
	ConstructorCalling(String name){
		System.out.println("string argu cons");
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		//ConstructorCalling cc = new ConstructorCalling();
// you don't have to call any method to call constructor inside the main method
// but have to call a constructor to call instance method inside the main method.
		new ConstructorCalling();
		// we only call 0 arguments constructor in the main method. but o arguments
		// will call 2 and 2 will call string and they all will follow flow of control rule.
		
		/*
		 * Formats of objection creation;
Approach: two type of approach
Named object approach
Test t = new test (); 
t is the name of the object
Nameless Approach
new test();
		 */
	}
}
