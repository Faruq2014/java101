package method;

public class operator_overloading {//only one overloading sign is +.

	public static void main(String[] args) {
		System.out.println("faruq"+"khaleed"+"selim");//Concatenation in Java is the operation of
		//joining two strings together. You can join strings
		//using either the addition (+) operator or the String’s concat() method.
		
		//BUT
		System.out.println(100+200+300); // here we are using + sign for math operator'
		
		System.out.println(100+200+300+"faruq"+"khaleed"+"selim"+100);
   //  here we using + operator to do both, adding and concatenation.
	//no other operator in java does to operations, because operator overloading is not
		// allowed in java. only "+" sign does this. be careful using this + sign.
		
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println(a);
		System.out.println("-------"+b);
		System.out.println("-----"+c);
		System.out.println(a+"--"+"----"+b+"---"+c);
		System.out.println(a+b+c);
		
		
	}

}
