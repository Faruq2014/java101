package constructor;

public class Advantage1 {

	int id;  // instance variable
	String name;
	double fee;
	
	Advantage1(){ // user define o arguments constructor.
		super();
		id=001;  // console will print only 1, most likely doesn't count 0 on the left side
		name = "Faruq";
		fee = 688.99;
	}
	/*
	 * purpose of the constructor is initialize the value of
	 * instance variable.
	 */
	
	
	
	void display(){
		System.out.println("student id is"+" "+id);
		System.out.println("student name is"+" "+name);
		System.out.println("student fee is"+" "+fee);
	}
		public static void main(String[] args) {
			
			Advantage1 student = new Advantage1();
			// calling constructor during object creation time.
			// without creating object can not call constructor
			
			student.display();//  till here is good.
			/*
			 * but if i have multiple student i need parameter
			 * constructor. if i make another object it will 
			 * give me same result
			 */
			System.out.println();// empty println to create space between to object
			Advantage1 student1 = new Advantage1();
			student1.display();
	}
		
}
