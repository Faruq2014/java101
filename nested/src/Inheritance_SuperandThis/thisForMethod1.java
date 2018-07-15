package Inheritance_SuperandThis;

public class thisForMethod1 {
int age;
String name;
	thisForMethod1(){
		this(36);
		System.out.println("cons 0 arg");
	}
	thisForMethod1(int age){
		this("Faruq");
		this.age= age;
		System.out.println("cons int arg"+" "+age);
	}
	thisForMethod1(String name){
		this.name=name;
		System.out.println("cons String arg"+" "+name);
	}
	int age(int age){
		if (age>=18)
			System.out.println("you are an adult");
			
		return age;
	}
	String name(String cig){
		name=cig;
		System.out.println(cig);
		return name;
	}
	thisForMethod1 display(){
		int a=new thisForMethod1().age(44);
		String b=new thisForMethod1().name("malbroo");
		System.out.println(a+" "+ "can buy "+" "+b);
		return null;
	}
	void show(){}
	
	public static void main(String[] args) {
		
new thisForMethod1();
//new thisForMethod1().name("malbroo");
//new thisForMethod1().display();
	}
   
}
