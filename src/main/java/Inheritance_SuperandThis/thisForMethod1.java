		package Inheritance_SuperandThis;
		
		public class thisForMethod1 {
		int age;
		String name;
			thisForMethod1(){
				this(36);        // calling int age constructor, this must be the first line int the constructor.
				System.out.println("cons 0 arg"); //print out statemnt for 0 arg consttructor.
			}
			thisForMethod1(int age){
				this("Faruq");   // // calling String  name constructor,
				this.age= age;      // this is using here for method 
				System.out.println("cons int arg"+" "+age);  // print out statement for constructor and method.
			}
			thisForMethod1(String name){
				this.name=name;   // this is using here for method calling 
				System.out.println("cons String arg"+" "+name);// print out statement for constructor and method.
			}
			int age(int age){
				if (age>=18)
					System.out.println("you are an adult");
					
				return age;
			}
			String name(String cig){
				name=cig;
				System.out.println(cig);
				return name;
			}
			thisForMethod1 display(){
				int a=new thisForMethod1().age(44);
				String b=new thisForMethod1().name("malbroo");
				System.out.println(a+" "+ "can buy "+" "+b);
				return null;
			}
			void show(){}
			
			public static void main(String[] args) {
		// you can call any constructor to create object or to call methods.		
		new thisForMethod1();
		System.out.println(); // for empty space.
		new thisForMethod1(36);
		System.out.println(); // for empty space.
		new thisForMethod1("Faruq");
		// if you use all them together, then method chaining mechanism will apply. 
		
		//new thisForMethod1().name("malbroo");
		//new thisForMethod1().display();
			}
		   
		}
