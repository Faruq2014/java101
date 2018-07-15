package Inheritance_SuperandThis;

public class callingBoth1 {
	int age;
	String name;
	callingBoth1(){}
	callingBoth1(int age,String name){
		this.age=age;
		this.name=name;
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
