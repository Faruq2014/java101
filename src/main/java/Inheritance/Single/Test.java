package Inheritance.Single;

public class Test {

	public static void main(String []args){
		p p = new p();
		p.m1("white", 777);
		p.m1("navy blue", 4444, 5555.55);
// calling by parent class reference, only can call parent class method
System.out.println("----------------------------------------");
		c c =new c();
	      c.m1("blue",10000);
		System.out.println();
		  c.m2(5000,"blue");
// calling by child class reference, can call both class method
		 System.out.println("----------------------------------------------"); 
		  p obj = new c();
		    obj.m1("lemon", 1111);
		    obj.m1("brown", 2222, 3333.33);
		
	/*
	 * p is parent class reference. c() is child class run time object
	 * this is specially for overriding method. obj is first going to check
	 * is there any method in parent class, then it will check in child
	 * class is it overriding.     
	 * this is one of the polymorphyism concept.
	 * which reference you will use: it is all depends on your business
	 * Requirements,  but better is use child reference like c c = new c();
	 */
		
	}

	}


