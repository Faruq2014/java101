package accessModifier;
import variable.*;
public class Public {
	
public static void main(String[] args) {
	Private_access_modifier pac = new Private_access_modifier();
	
	Complete com = new Complete();
		com.mollaFamilyArlington(); //public instance method calling by object from other package.
		                       // since method is public any body can access.
		//com.MollaFamilly(); // since mollaFamilly method is a default method
		                      // it is not accessible from other package at all.
		
		
		//complete.ShaFamilly(); // protected static method, calling by class name.
	                           // protected method can not access directly from other package. 
	                          // it could be access by inheritance by class.
	
		Public pam= new Public();
		pam.mOne(33, 11);
		System.out.println();
		Public.mTwo("Faruq", "Molla");
		
		pam.mThree(7, 2);
		
	} 
	public void mOne(int age, int hour)  {
		int total= age*hour;
		System.out.println(total);
	
	} 
	private static void mTwo(String fn, String ln){
		String fullname = fn+ln;
		System.out.println(fullname);
	}
	//nothing, experiment
	int mThree(int speed, int hr){
		int total= speed *  hr;
		System.out.println("total run"+total+" " +"mile");
		return hr;
	}

}
