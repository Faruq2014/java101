package variable;

public class Test {
	
	int age;
	static String name;
	
	Test(){
		
	//String	name ;
	//this.age=age;
	}
	
	public static void main(String[] args) {
		
Test t = new Test();
t.m1();
System.out.println();
Test.m2();
	}
	
	
	
public void m1(){
	 //Test  t= new Test();
	age=60;
	name="salim";
	double salary=2500.55d;
	System.out.println(age+name+salary);
}

public static void m2(){
	 Test  t= new Test();
	t.age = 50;
	name = "saleha";
	 String occup = "hw";
	 System.out.println(t.age+name+occup);
	 
}

}
