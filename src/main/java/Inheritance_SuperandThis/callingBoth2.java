package Inheritance_SuperandThis;

public class callingBoth2 extends callingBoth1 {
	callingBoth2(){
	//	System.out.println("child class 0 arg cons");
	}// 0 arg constructor, it is always a good idea to create 0 arg cons.
	
	callingBoth2(int age,String name){
		super(); // calling parent class constructor.
		System.out.println(name+ " is "+ age+" from child class 2 arg cons");
		}
	callingBoth2 display(){
		//using 0 arg constructor to call all the method.
       String n =new callingBoth2().name("Faruq");
		int a=new callingBoth2().age(36);
		System.out.println(n +" "+"age is"+" "+a);
		return null;
	}
	void show(){
		// calling methods in side another method.since they are all instance method, access is no issue.
		// both class has same name method,so this refer current class property and super 
		// refer parent class property.
		this.display();
		super.display();
		
	}
	
	
	
	public static void main(String[] args) {
		new callingBoth2(36,"Robi").show();

	}

}
