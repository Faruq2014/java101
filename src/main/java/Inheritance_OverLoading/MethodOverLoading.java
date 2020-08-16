	package Inheritance_OverLoading;
	
	public class MethodOverLoading {
	int eyes;
	int legs;
	double height;	
	 MethodOverLoading(int eyes, int legs,double height){
		this.eyes=eyes;
		this.legs=legs;
		this.height=height;
	}
	
	public static void main(String[] args) {
			
		MethodOverLoading  ms = new MethodOverLoading(2, 2, 5.4);
			ms.m1(null, "Faruq");
			ms.m1(4, 5);
		    ms.m1('D', 'N');
		    ms.m1(2, 2, 5.6);
		    ms.m1(2, 2, 5.5, "Sayem");
		}
	public void m1(String st, String st1 ){ 
		System.out.println(st+"  "+ st1);
		System.out.println("\"same mathod name but different method signature is called overloading\"");
	}
	public void m1(int a,int b){
		System.out.println(+(a+b));
	}
	public void m1 (char ch,char ch1){
		System.out.println(ch+"  "+ch1); // to print two character, always put space between them.
	}
	public void m1 (int eyes,int legs, double hight){
		System.out.println(eyes+"  "+legs+hight); // .
	}
	
	public void m1 (int eyes,int legs, double hight,String name){
		System.out.println(eyes+"  "+legs+hight); // .
	}
	
	}
	
	
	
	
