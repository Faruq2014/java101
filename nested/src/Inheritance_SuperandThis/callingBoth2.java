package Inheritance_SuperandThis;

public class callingBoth2 extends callingBoth1 {
	callingBoth2(){}
	callingBoth2(int age,String name){
		super();
		}
	callingBoth2 display(){
       String n =new callingBoth2().name("Faruq");
		int a=new callingBoth2().age(36);
		System.out.println(n +" "+"age is"+" "+a);
		return null;
	}
	void show(){
		this.display();
		super.display();
		
	}
	
	
	
	public static void main(String[] args) {
		new callingBoth2().show();

	}

}
