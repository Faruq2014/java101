package constructor;

public class Disadvantage {

	int id; // default value is 0
	String name; // default value is null
	double fee; // default value is 0.0
	
	void disp(){
		System.out.println("student id" +" "+ id);
		System.out.println("student name"+" " + name);
		System.out.println("student id"+" " + fee);
	}
		public static void main(String[] args) {
			Disadvantage student = new Disadvantage();// default constructor
			student.disp();

		}
		/*advantage of default constructor is at least it can pass default value.
		 * problem with default constructor is, it can not pass any value through 
		 * parameter, so check the next class for advantage of user define constructor.
		 */
	
}
