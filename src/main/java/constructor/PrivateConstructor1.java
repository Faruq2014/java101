	package constructor;
	
	public class PrivateConstructor1 {
		
	
		static String name = "university of java";  //static variable
		  
		private PrivateConstructor1(){     // private constructor
			
		}
		
		
		public static PrivateConstructor1 getObjectForPrivateConstructor1(){
			return new PrivateConstructor1();
		} // static factory method to create constructor object
		
	public static  void employee(){ // static method
		System.out.println(name);
	}
	void tutionFee(String name, int id,double fee){ //instance method with parameter
		
		System.out.println(name+" "+id+" "+fee);
	}
	}
