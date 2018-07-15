package variable;

public class emp {
	
int id;        // instance variable
String name;  //  instance variable

	public static void main(String[] args) {
		emp e = new emp(111, "faruq");
		e.disp();
		System.out.println();// empty print statement for space
		emp e2 = new emp(222,"khaleed");
		e2.disp();
		System.out.println();// empty print statement for space
		emp e3 = new emp(333,"selim");
		e3.disp();
	}
emp(int id, String name ){  // local variable inside parameter but has same name as instance variable
	this.id=id;   // since both has same name, 
	this.name=name;
	/*
	 * since both has same name, then use this key word to initialize instance value
	 * to local value. this is called conversion. it is only possible inside the instance
	 * method. can not use this key word inside any static method.
	 */
}
void disp(){
	System.out.println("employee id is "+id);
	System.out.println("emploee name is "+name);
}
}
