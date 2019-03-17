package constructor;

public class Super1 {

	Super1(){
		super();
		System.out.println("parent class constructor");
	}

	public static void main(String[] args) {
		
              new Super1().m1();
	}
	void m1(){
		System.out.println(" parent class m1 method");
	}

}
