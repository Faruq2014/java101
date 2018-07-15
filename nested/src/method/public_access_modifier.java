package method;
import variable.*;           // import all the class from variable package.

public class public_access_modifier {

	public static void main(String[] args) {
		
		complete com = new complete();
		com.chowdhoryFamily(); //public instance method calling by object from other package.
		                       // since method is public any body can access.
		//com.MollaFamilly(); // since mollaFamilly method is a default method
		                      // it is not accessible from other package at all.
		
		
		//complete.ShaFamilly(); // protected static method, calling by class name.
	                           // protected method can not access directly from other package. 
	                          // it could be access by inheritance by class.
		public_access_modifier pam= new public_access_modifier();
		pam.mOne(33, 11);
		System.out.println();
		public_access_modifier.mTwo("Faruq", "Molla");
		
		pam.mThree(7, 2);
		
	} 
	void mOne(int age, int hour)  {
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
