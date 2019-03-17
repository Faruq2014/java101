package constructor;

public class Advantage3 {

	int id ;  // instance variable
	String name;
	float fee;
	Advantage3(int id, String name, float fee){ // parameter constructor always local variable
		super();
		this.id=id;   // this is called conversion
		this.name=name; // when instance variable and local variable has same name,in the same class 
		this.fee=fee;   //then use this key word to convert instance value to local value
	} // after use this key word priority goes to local variable.
	
	void disp(){
		System.out.println("student id is"+" "+id);
		System.out.println("student name is"+" "+name);
		System.out.println("student fee is"+" "+fee);
	}

	public static void main(String[] args) {
		Advantage3 student = new Advantage3(100,"Faruq",230.66f);
		student.disp();
		System.out.println();
		Advantage3 student1 = new Advantage3(200,"Selim",325.99f);
		student1.disp();
		System.out.println();
		Advantage3 student2 = new Advantage3(300,"Khaleed",599.33f);
		student2.disp();

	}

}
