package accessModifier;

public class Default_access_modifier {
	
	public static void main(String[] args) {

		method_calling mc = new method_calling ();
		mc.mOne();
		method_calling.mTwo();
	
		/*in method_calling class, both are default method. in same
		 package any class can access it. different package can not access
		 it. 
*/
	}

}
