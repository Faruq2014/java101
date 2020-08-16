package Overriding_return_type;

public class ReturnType2 extends ReturnType1 {
	public String m1(){  // we made it String type from object type
		
		String fn = "faruq";
		String ln = "molla";
		String fname = fn+" "+ln;
		
		String address =" 8103 pinelake ct";
		
		System.out.println(fname+"address"+" "+address);
		return null;
	}
}
