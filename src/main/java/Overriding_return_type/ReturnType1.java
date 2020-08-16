package Overriding_return_type;

public class ReturnType1 {
	
public Object m1(String fn,String ln){ //objuct is the data type 
	 fn = "faruq";
	 ln = "molla";
     
	Object fname= fn+" "+ln;
	System.out.println("full name"+" "+fname);
	return null;
}
/*
 * in overriding return type must be same,but this rule is applicable
 * until 1.4 version, 1.5 version and onwards we can take coverrient 
 * return type also.according to this child class need not be same as parent 
 * method return type. return type child class also allowed.
 * object is parent class and its child class are object,string, string buffer.
 * number is parent class and its child classes are int, double,float,long
 * coverint concept only applicable for object type not for primitive type.
 */



}
