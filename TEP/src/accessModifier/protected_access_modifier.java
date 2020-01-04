package accessModifier;

import variable.Complete;


public class protected_access_modifier extends Complete{
   
	public static void main(String[] args) {
		Complete m = new Complete();
		m.mollaFamilyArlington();
		//public instance method calling by object from other package.
        // since method is public any body can access.
		System.out.println("--------------------------------------------------");
		Complete.mollaFamillyFallsChurch();
		/* protected static method, calling by class name.
	       protected method can not access directly from other package. 
           it could be access by, import package then inheritance by class.
          first, we import variable package with complete class ( variable. complete) 
          second, protected_access_modifier class extends complete class.
          third,  ShaFamilly is a protected static void class, so complete.ShaFamilly();
           by the way you can import whole package by this syntax "package.*;"
           like variable.*;
		
	*/	
		System.out.println("--------------------------------------------------");
		Parameter_list pl = new Parameter_list ();
		pl.mOne(40, 20, "libi");
		//parameter_list class is in same package(method package). protected method can direct
		//access it.
	}

}
