package constructor;

public class Super1 {
	/*
	 * Call to super() must be first statement in Derived(child) Class
	 * constructor. If a constructor does not explicitly invoke a superclass
	 * constructor, the Java compiler automatically inserts a call to the
	 * no-argument constructor of the superclass. If the superclass does not have a
	 * no-argument constructor, you will get a compile-time error. Object does have
	 * such a constructor, so if Object is the only superclass, there is no problem.
	 * If a subclass constructor invokes a constructor of its superclass, either
	 * explicitly or implicitly, you might think that a whole chain of constructors
	 * called, all the way back to the constructor of Object. This, in fact, is the
	 * case. It is called constructor chaining
	 */
	
	  Super1(){super(); System.out.println("parent class constructor");  }
	 
		
		  Super1(int a){ 
			  super(); System.out.println("parent class constructor"); 
			  }
		 
	public static void main(String[] args) {
		
              new Super1().m1();
	}
	void m1(){
		System.out.println(" parent class m1 method");
	}

}
