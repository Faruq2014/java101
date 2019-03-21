package returnType;
class emp{}  // inner class. one of the feature is inner class.
class stu{}
public class ReturnTypeObject {

	emp m1(){ //emp is a inner class. you must write inner class name before method
		// to indicate, which class method it is.
		int salary = 5000;
		System.out.println("method m1" +" "+salary);
		//emp e = new emp();
		//return e;
		return new emp();  // most recommended way.
	}
	stu m2(){   //stu is a inner class. you must write inner class name before method
		// to indicate, which class method it is.
		stu s = new stu();
		System.out.println("method m2");
		return s;
	}
	static String m3(){ // m3 is regular class, so you don't have to write class name.
		String st = "i love java";
		System.out.println("method m3"+" "+st);
		//return "i love java";
		return st;
	}
		public static void main(String[] args) {
			ReturnTypeObject rto = new ReturnTypeObject();
		emp faruq =	rto.m1();  // m1 is a instance method.emp is data type of class.rto is 
		// object name. faruq is variable name
		System.out.println( faruq.equals(faruq));
		System.out.println();
		// m2 is a instance method.stu is data type of class.rto is 
			// object name. khaleed is variable name

		stu khaleed =rto.m2();
		System.out.println(khaleed.getClass());
		System.out.println();
		
		String str =ReturnTypeObject.m3(); // m3 is regular class static method. 
	    System.out.println(str.codePointAt(0));    //string is data type and str is variable name.

		}

}
