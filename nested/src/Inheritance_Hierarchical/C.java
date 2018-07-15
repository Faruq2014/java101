package Inheritance_Hierarchical;

public class C extends A {
	int salary(int salary){
		int total= salary*12;
		System.out.println("yearly income"+total);
		return salary;
	}
	public static void main(String[]args){
		C c = new C();
		c.wealth(5000, 7000);
		c.salary(1000);
	}

}
