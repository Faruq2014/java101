package method;

public class parameter_list {

	public static void main(String[] args) {
		parameter_list pl = new parameter_list();	
       pl.mOne(35, 9, "libi"); // passing parameter value (method signature value),
      // parameter order is very important. 
       // has to be exact order. mOne (35,9 "libi")this called method signature
      
       parameter_list.mTwo(" mageda", 's'); 
       
	}
 protected void mOne(int hour, int wage, String ename){ // parameter always local variable.
	System.out.println(hour);
	System.out.println(wage);
	System.out.println(ename);
	System.out.println();
	System.out.println(hour+"  "+wage+" "+ename); //  possible to put integer value together.
	
	System.out.println();
}
public static void mTwo(String mgr, char ch){
	System.out.println(mgr);
	System.out.println(ch);
	System.out.println();
	System.out.println(ch + mgr);// possible
}
}
