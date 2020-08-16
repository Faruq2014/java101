package constructor;

public class Basics {

	public static void main(String[] args) {
	/*
	 * Every class has a constructor whether it’s a normal class or a abstract class.
	Constructors are not methods and they don’t have any return type.
	Constructor name should match with class name .
	Constructor can use any access specifier, they can be declared as private also. 
	Private constructors are possible in java but there scope is within the class only.
	Like constructors method can also have name same as class name, but still they have return type, 
	though which we can identify them that they are methods not constructors.
	If you don’t implement any constructor within the class, compiler will do it for.
	this() and super() should be the first statement in the constructor code.
	 If you don’t mention them, compiler does it for you accordingly.
	Constructor overloading is possible but overriding is not possible. 
	Which means we can have overloaded constructor in our class but we can’t override a constructor.
	Constructors can not be inherited.
	If Super class doesn’t have a no-arg(default) constructor then compiler would not insert a default 
	constructor in child class as it does in normal scenario.
	Interfaces do not have constructors.
	Abstract class can have constructor and it gets invoked when a class, 
	which implements interface, is instantiated. (i.e. object creation of concrete class).
	A constructor can also invoke another constructor of the same class – By using this(). 
	If you want to invoke a parameterized constructor then do it like this: this(parameter list).
		 */

	/*
	 * Why java doesn’t support static constructor? 
	 * It’s actually pretty simple to
	 * understand – Everything that is marked static belongs to the class only, for
	 * example static method cannot be inherited in the sub class because they
	 * belong to the class in which they have been declared. Refer static keyword.
	 * 
	 */
		
		/*
	 * Constructor VS method 
	 * The purpose of constructor is to initialize the object
	 * of a class while the purpose of a method is to perform a task by executing
	 * java code. Constructors cannot be abstract, final, static and synchronised
	 * while methods can be. Constructors do not have return types while methods do.
	 */
		
	}

}



