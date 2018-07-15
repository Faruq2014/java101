package variable;

public class Static1 {
	static String name = "faruq"; // static variable
	
	// static variable loaded during .class file loading time
	
	String name1 = "khaleed";// instance variable
	// instance variable create during objection creation time.
	
public static void main(String []s){
	System.out.println(name);
	// since name is a static variable and already loaded during class loaded time it has 
	//direct access. 
	
	//System.out.println(name1);
	//since name1 is instance variable you can not access it without create object.
	// Until you create an object jvm will not assign any value on it.
	Static1 t = new Static1(); // creating object name t  
	        System.out.println(t.name1);
	        
}
}
