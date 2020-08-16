package Overriding_return_type;

public class ReturnTypeTest {

	public static void main(String[] args) {
		
		
		ReturnType1 t2 = new ReturnType1();
	     t2.m1("faruq","molla");
	     System.out.println();
	     ReturnType2 t1 = new ReturnType2();
			t1.m1();
		System.out.println();
		ReturnType1 t3 = new ReturnType2();
		t3.m1("faruq","molla");
	


	}

}
