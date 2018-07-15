package constructor;

public class Super2 extends Super1{
	
	Super2(int age){
		super();
		System.out.println("child class constructor");
	}
	Super2(){}

	public static void main(String[] args) {
	new Super2(6);
	

	}
	void m2(){
	System.out.println("child class m1");	
	}

}
