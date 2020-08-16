package Inheritance_SuperandThis;

public class C extends P {
    int i;
	C(int a,int b,int i) {
		super(a, b);
		this.i=i;
		
	}
	int multi(){
		System.out.println(a*b*i);return a*b*i;}
	
	void hello(){System.out.println("hello in child method");}
	void display(){
		hello();
		super.hello();
		}
	int m =200;
	void showVariable(){
		System.out.println(m);
		System.out.println(super.m);
	}

}
