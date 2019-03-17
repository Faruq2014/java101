package accessModifier;

public class Private_access_modifier {
	
	// private method and variable can access inside the same class 
		//but are not allowed to 
		// access different class. private modifier are most restricted.
		private int age;
		private static  String name ="Faruq";

		public static void main(String[] args) {
			
			Private_access_modifier pcm = new Private_access_modifier();
			pcm.bloodPressure();
			Private_access_modifier.bloodPressure1();
			// from different class
			Public pub = new Public();         //different class but public
			pub.mOne(36, 20);                 //// method, so you can access it;
			
			//pub.mTwo(); different class and private method, so no access.
			
		}
	private void bloodPressure(){
		int pressure =140; // static modifier direct access even at instance method.
		if ( age <25 || pressure>120){System.out.println(name+" "+"see dr.");}
		else{System.out.println(name +"u r fine");}
	}
	public static void  bloodPressure1(){
		int pressure =140;
		Private_access_modifier pm = new Private_access_modifier();
		pm.age=36; // static method but instance variable.
		System.out.println(name+"---"+pm.age+"---" +pressure);
	}

}
