package constructor;

public class Initialization {

	/*
	 * the main purpose of constructor is to initialize an object.
	 *  as soon as you create an object, it is 
	 * recommended to initialize it. without initialization, 
	 * object is an empty place holder and meaningless.
	 * so how many way can we initialize an object.
	 * constructor is the most recommended way. but here are few other
	 * ways---->
	 */
		/*String name="Faruq";
		 * int id = 111;
		 *  initializing instance variable. problem with this is if you have 100
		 * student, every  name will be 'faruq' ane id will be '111'
		instance block: { String name = "faruq"; int id=111;}
		same problem, every object you create, the name and id will be the same. 
		can not maintain different
		values for different object.
		Objection creation:
		student s1 = new student();
		        s1.name="faruq";
		        s1.id=111;
		        
		        student s2 = new student();
		        s2.name="khaleed";
		        s2.id=222;
		        able to maintain different values but length of application
		         will be very long. you will need
		        300 lines of code just to initialize the object.
		
		*/
		String name;
		int id;
		 static int count=0;
		 
		 /*now we are creating static block, static block is belongs to the
		  * class level, so it will print only one time. 
		  * 
		  */
		 
		 static{ System.out.println("Dhaka university");
		 System.out.println();}
		
		Initialization(String name, int id){ // parameterized constructor.
			//super();            // constructor code
			this.name=name;   // conversion code             
			this.id=id;
			 // with this code you can create as many object you want, 
			//and also can maintain  different values.
			
			System.out.println("Student name is"+" "+name+",Student id is"+"  "+id);
			
		}
		// instance block: if you want to do anything other than initialization 
		//with your object using instance block is recommended.
		//in this instance block, we are giving common info about object. 
		//it will print with every object.
			{System.out.println("department of inforamation technology");
			
			System.out.println("Batch 2017");
			}
		 {count++; //in this block we are counting how many object are created.
		 }
		 
		
		public static void main(String[] args) {
			Initialization i1 = new Initialization("faruq",111);
			System.out.println();
			Initialization i2 = new Initialization("khaleed",222);
			System.out.println();
			Initialization i3 = new Initialization("selim",333);
			System.out.println();
			System.out.println("number of created object is"+" "+count);
			

		}
}
