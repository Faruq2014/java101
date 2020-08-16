	package Inheritance_SuperandThis;
	
	public class callingBoth1 {
		int age;
		String name;

		
		  callingBoth1(){ //System.out.println("parent class 0 arg cons");
			  } 
		
		  // 0 arg constructor, it is always a good idea to create 0 arg cons.
		  // parent class must have explicitly a 0 arg constructor.
		callingBoth1(int age,String name){  // defined constructor
			this.age=age;
			this.name=name;
			System.out.println(name+ " is "+ age+" from child parent 2 arg cons");
		}
		
	String name(String name){
	return name;	
	}
	int age(int age){ 
		return age;	
	}
	callingBoth1 display(){
		String n =new callingBoth1().name("Mannan");
		int a=new callingBoth1().age(66);
		System.out.println(n +" "+"age is"+" "+a);
		return null;
	}
	public static void main(String[]args){
		
		new callingBoth1().display();
		
	}
	}
