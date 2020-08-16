	package constructor;
	
	public class Advantage2 {
	
		int id;          //null value 0 //instance variable
		String name;     // null value is null
		float fee;       // null value is 0.0
		
		Advantage2(int id, String name, float fee){ // parameter variable is always local
			// super();  //constructor code, if you do not write it compiler will write it.
			             // this line have to be first line inside the constructor block
		}
		void disp(){
			System.out.println("student id is"+" "+id);
			System.out.println("student name is"+" "+name);
			System.out.println("student fee is"+" "+fee);
		}
		
		public static void main(String[] args) {
			Advantage2 student = new Advantage2(100,"Faruq",230.66f);
			student.disp();
			System.out.println();
			Advantage2 student1 = new Advantage2(200,"khaleed",400.99f);
			student1.disp();
			System.out.println();
			Advantage2 student2 = new Advantage2(300,"selim",99.99f);
			student2.disp();
			// even though constructor parameter is still taking the value of local variable
	        // but it will pass instance value in the console. why?
			// because, #1 they have same name, #2.local has no access outside of their scope,
			// #3 instance variable has easy access to main method,but local doesn't .
		    // to overcome this problem, check the next example.
		}   


}
