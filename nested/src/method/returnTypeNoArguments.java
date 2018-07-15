package method;

public class returnTypeNoArguments {

	public static void main(String[] args) {
		returnTypeNoArguments rtna = new returnTypeNoArguments();
		int x =rtna.m1(12);
		System.out.println("value of m1"+" "+x);
		System.out.println();
		
	     float y=rtna.m2();
		System.out.println("value of m2"+y);
		System.out.println();
		
		double z= rtna.m3();
		System.out.println("value of m3"+z);
		System.out.println();
		
		char a =returnTypeNoArguments.m4();
		System.out.println("value of m4"+"---"+a);
		

	}
protected int m1(int a){
	System.out.println("m1 method");
	
	return a;
}
private float m2(){
	System.out.println("m2 method");
	return 5.5f;
}
 double m3(){
	System.out.println("m3 method");
	return 6.5d;
}
public static char m4(){ 
	System.out.println("m4 method");
	return 'f';
}

}
