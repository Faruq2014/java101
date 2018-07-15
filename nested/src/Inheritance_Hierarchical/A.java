package Inheritance_Hierarchical;

public class A {
	A(){}
	static String ln="Molla";
	String fn;
	String kn1;
	String kn2;
	String kn3;
	String cn;
	A(String kn1,String kn2,String kn3 ){
		
		this.kn1=kn1;
		this.kn2=kn2;
		this.kn3=kn3;
		
	}
	A(String fn,String cn){
		this.fn=fn;
		this.cn=cn;
	}
	
	String name(String Name){
		
		return Name;
	}
	String country(String cn){
		cn = "Bangladesh";
	    return cn;
	}
	A kidsName(String kn1,String kn2,String kn3){
		String son="is the son of";
		String dtr="is the daugter of";
		A a=new A();
	
		String p1=a.name("Mannan");
		String t1=a.name(kn1);
		System.out.println(t1+" "+ son+" "+p1);
		String t2=a.name(kn2);
		System.out.println(t2+" "+ son+" "+p1);
		String t3=a.name(kn3);
		System.out.println(t3+" "+ dtr+" "+p1);
	    return this;
	}
	A wealth(double cash,double land){
		double total = (cash+land)/3;
		System.out.println(" inherit from father"+total);
		return this ;
	}
	public static void main(String []args){
		A a= new  A();
		String s=a.name("Mannan")+" "+ln;
		System.out.println(s);
		a.kidsName("faruq", "shafik", "minu");
	   System.out.println("-------------------------------");
	 String d1 =a.country("Bangladesh");
	 System.out.println("They are from"+" "+d1);
	 
	}

	
}
