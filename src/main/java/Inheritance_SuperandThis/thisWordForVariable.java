package Inheritance_SuperandThis;



public class thisWordForVariable {
	int a=5; // instance variable
	  int b=6;
	  String st ;
	  public void m1(int a, int b )// local variable
	 // if instance and local variable has same name: then priority goes to  
	 // local variable. to print instance must use this key word. 
	  {
		  // block one print statement at a time to see how priority shift.
		  System.out.println(" local variable"+" "+a+" "+b);
		  System.out.println("instance variable"+" "+this.a+" "+this.b);
	  }
	  public  void m2( String st){
		  System.out.println("local variable"+" "+st);
		  System.out.println("instance variable"+" "+this.st);
	  }
	 /* public static void m3( String st){ //inside any static method this  key word is not allowed.
		  System.out.println("local variable"+st);//
		  System.out.println("instance variable"+this.st);
	  }*/
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			thisWordForVariable snv = new thisWordForVariable();
			snv.m1(100, 200);
			snv.m2("faruq");
		}

}
