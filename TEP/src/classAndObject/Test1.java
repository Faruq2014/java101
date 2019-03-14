package classAndObject;

public class Test1 {
	
	String name1;  // instance method
	
	static String name2;  // static method
	
	
	Test1(){
		
	}
	
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.m1();
		
		Test1.m2();

	

	}
	
	public void m1() {
	String name="omar"; // local variable	
		
		System.out.println(name);
		System.out.println(name1);
		Test1 t = new Test1();
		t.m1();
		
	}
	public static void m2() {
		
	}
	public void m3() {
		Test1 t = new Test1();
		t.m1();
		
		String name="omar";	
			name1="farid";
			System.out.println(name);
			System.out.println(name1);
		
			
		}
	static {
		
	}
	
	

}
