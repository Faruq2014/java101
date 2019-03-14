package variable;

public class Instance {

	 String firstname = "faruq" ;
     
	    
		public static void main(String[] args) {
			
			Instance ins = new Instance();
	ins.m1();
	ins.m2();

	Instance.m4();
		}
		
	public void m1(){
		Instance ins = new Instance(); // access via create an object non prefer method
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
		Instance ins = new Instance();
		ins.firstname ="fabiha";
		System.out.println(ins.firstname)  ;// because static variable and method is belongs to class.
		
		//static normally use for instituate a class not  an object.
	}
	
}
