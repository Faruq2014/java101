package variable;

public class local {

	public static void main(String[] args) {
	local v = new local();
	 v.m1();
	//non static method or variable access through referential object
		
		local.m2();  // non static method or variable access directly
	
	}
   public void m1(){
	int age=20;
  System.out.println("non static method age" +"  "+ age);
  }
	
   static void m2(){	
	final int age=10;
    System.out.println("this is static method age" +"  "+ age);

}
}
