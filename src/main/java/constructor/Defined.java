		package constructor;
		
		public class Defined {
			
			
		
			private Defined(    )
			{System.out.println("zero argument cons");}
			
			 Defined(int a){
				System.out.println("one argument cons  "+a);
			}
			protected Defined(int b,int c){
				super(); // constructor code, if you do not write it, compiler will write for you.
				System.out.println("two argument cons"+b+" , "+c);
			}
			
			
			
			/*Defined(int e,int f){ // int b&c, int e&f  both are two arguments constructor. java doesn't
				System.out.println("two argument cons"); // allow duplication.
			}*/
			public Defined(String name,int age){
				super();
				System.out.println("mix argument cons"+name +" is "+age);
			}
			
			public static void main(String[] args) {
				
				Defined d1 = new Defined( );// constructor for zero arguments user define constructor.
				
				Defined d2 = new Defined(100);//// constructor for one arguments user define constructor.
				
				Defined d3 = new Defined(50,33); // two arguments
				
				Defined d4 = new Defined("Faruq", 99); // mix arguments
				
				
				// you can have as many constructor you need. 
				//also mix parameter any way you want.
				//how does object (d1,d2,d3,d4) understand which one is which constructor?
				// they understand by parameter argument. 
				//every parameter has different type argument.
				
				d1.m1();
				d2.m1();
				d3.m1();
				d4.m1();
				//d1 or d2 (or any object) can call the method.
			}
		void m1(){
			System.out.println("method 1");
		}
		}
