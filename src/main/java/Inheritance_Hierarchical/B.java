package Inheritance_Hierarchical;

public class B extends A {
	String gkn1;
	String gkn2;
	String gkn3;
	B(){}
	B(String gkn1,String gkn2,String fn,String cn){
		super(fn,cn);
		this.gkn1=gkn1;
		this.gkn2=gkn2;
	}
	
		
	
	B grandKids(String gkn1,String gkn2){
		String dtr="is the daugter of";
		A a = new A();
		String p1=a.name("Faruq")+" "+ln;
		System.out.println(p1);
		String t1=a.name(gkn1);
		System.out.println(t1+" "+ dtr+" "+p1);
		String t2=a.name(gkn2);
		System.out.println(t2+" "+ dtr+" "+p1);
		return this;
	}
	B value(int cash, double house ){
		 cash=10000;
		 house = 20000;
		
		 double total = cash+house;
		System.out.println("own property "+total);
	
		return this ;
	}
	public static void main(String []args){
		B b= new  B();
		b.grandKids("Fima", "Nisa");
		System.out.println();
		String l1=b.country("USA");
		String k1=b.name("FIMA");
		System.out.println(k1+" " +"is from"+" "+l1);
		System.out.println();
		String k2=b.name("NISA");
		System.out.println(k2+" " +"is from"+" "+l1);
		System.out.println();
		b.wealth(5000, 7000);
		b.value(10000, 20000);
		System.out.println();
		
		
		
	}

}
