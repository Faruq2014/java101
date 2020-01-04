package returnType;

public class ReturnTypeVariable {

	int a;          //instance variable
	
	   int m1( int a){          //local variable
			System.out.println("method m1 soccer ball cost 5");
			return a;     // both variable has same name then priority goes to local
		}
		int m2(){ //has no local variable, method is calling instance variable
			System.out.println("method m2");
			return a;	
		}
		int m3(int a){ //local variable
			System.out.println("method m3");
			return this.a; // even it has local variable but for this key word priority goes to 
		}                   // instance variable  

		public static void main(String[] args) {
			ReturnTypeVariable rtv = new ReturnTypeVariable();
		int x1=	rtv.m1(22);
		System.out.println(x1);
		
			int x2=  rtv.m2();
	   System.out.println(x2);
	   
	  int x3= rtv.m3(10); // a=10 but still printing null value.
	   System.out.println(x3);
	   
	          
	   
		}
}
