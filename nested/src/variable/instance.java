package variable;

public class instance {
     String firstname = "faruq" ;
     
    
	public static void main(String[] args) {
		
instance ins = new instance();
ins.m1();
ins.m2();

instance.m4();
	}
	
public void m1(){
	instance ins = new instance(); // access via create an object non prefer method
	ins. firstname = "faruq";
	System.out.println(firstname);
	
}
void m2(){
	firstname ="mannan";  // direct access prefer method
	System.out.println(firstname);
	}
public void M3(){
	// instance.firstname= "faruq";	  // access through classname.variablename
	System.out.println(firstname);
}

public static void m4(){    // static method area, so only access through create a new object.
	instance ins = new instance();
	ins.firstname ="fabiha";
	System.out.println(ins.firstname)  ;// because static variable and method is belongs to class.
	
	//static normally use for instituate a class not  an object.
}
}
