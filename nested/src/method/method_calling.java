package method;

public class method_calling  { // this is an instance method
	 void mOne (){
	String en = "libi";
	int hour = 35; int wage = 9;
	int total = hour* wage;
	System.out.println(en+" "+ hour+" "+wage+" "+total);
	}
    static void mTwo (){    // this is an static method
	String en = "mohammed";
	int hour = 40; int wage = 12;
	int total = hour* wage;
	System.out.println(en+" "+ hour+" "+wage+" "+total);	
	}
   
	public static void main(String[] args) { // main method always static
		System.out.println("emplname+ hour+ wage+total");   // nothing
		
		method_calling mc = new method_calling();
           mc.mOne();  //instance method is calling from a static method.
                       // by making reference 
           
           method_calling.mTwo(); 
         //static method is calling from a static method.
           // by using class name. 
           
           

           
	}

}
