package Overriding_return_type;



public class RunTimeTest {

	public static void main(String[] args) {
		RunTime1 a1= new RunTime1();//parent class but parent object
		a1.wealth(5000, 7000);
		System.out.println();
		
		RunTime2 a2 =new RunTime2();//child class but child object
		a2.wealth(5000, 7000);
		
		System.out.println();
		
		
		RunTime1 a3= new RunTime2(); //parent class but child object
		a3.wealth(5000, 7000);
		
		
	/*Overriding is known as run time, or late binding or 
	 * dynamic polymorphyism.
	 *  class runtime1 extends runtime2.so we make object 
	 *  runtime1 a3 = new runtime2(); 
	 *   we have overriding wealth method.
	 *  It will print class runtime2’s overriding method by default.
	 * 
	 * 
	 */
		

	}

}
