package variable;

public class Static {
	
	 static String famillyname;
	
    
	public static void main(String[] args) {
		
		Static st = new Static();  //static area, non static method calling
		st.m1();
		
		Static.m2();  // static area , static method calling, so direct calling by class name
		Static.m3();
		Static.m4();
		
	 
	}
	public void m1(){    // static variable but non-static method, so no problem. still give 
		Static a = new Static(); // return, but create an object to access it.
		a.famillyname="sha";
		System.out.println(famillyname);
	}
public static void m2(){
	famillyname="chowdohrey";  // static block direct access for static variable.
	System.out.println(famillyname);
	}
public static void m3(){
	Static.famillyname="molla"; // static block direct access by classname.variablename.
	System.out.println(famillyname);
}
public  static void m4 (){
String Firstname = "faruq";
System.out.println(Firstname +"  " +famillyname); //local + static variable
}
	}

