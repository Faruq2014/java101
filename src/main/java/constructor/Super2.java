package constructor;

public class Super2 extends Super1{

	Super2(int age){
		super();
		System.out.println("child class constructor");
	}
	 Super2(){}

	public static void main(String[] args) {
	new Super2(6);
	/*
	Super2 s2= new Super2();
	s2.m1();
	s2.m2();
	*/

	}
	void m2(){
	System.out.println("child class m1");	
	}

}


 