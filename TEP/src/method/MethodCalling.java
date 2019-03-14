package method;

public class MethodCalling {
	
	void mOne (){
		String emp = "libi";
		int hour = 35; int wage = 9;
		int total = hour* wage;
		System.out.println(emp+" "+ hour+" "+wage+" "+total);
		}
	
	    static void mTwo (){    // this is an static method
		String emp = "mohammed";
		int hour = 40; int wage = 12;
		int total = hour* wage;
		System.out.println(emp+" "+ hour+" "+wage+" "+total);	
		}
	   
		public static void main(String[] args) { // main method always static
			System.out.println("emplname+ hour+ wage+total");   // nothing
			
			MethodCalling mc = new MethodCalling();
	           mc.mOne();  //instance method is calling from a static method.
	                       // by making reference 
	           
	           MethodCalling.mTwo(); 
	         //static method is calling from a static method.
	           // by using class name. 
	           
	           

	           
		}


}
