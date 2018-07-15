package Inheritance.MultipleLevel;

public class C extends B{
 String gkds1;
 String gkds2;
 C(){}
 C(String gkds1,String gkds2){
	 this.gkds1= gkds1;
	 this.gkds2= gkds2;
 }
 String country(){ //overriding country method
		country= "USA";
		//System.out.println(country);
		return country;
	}
 String grandkids(String gkds1,String gkds2){
	 String dtr = "is the daughter of";
	 String from = "is from";
	 A a = new A();
	 C c = new C();
	String b =c.country();
	String g1= a.name(gkds1);
	System.out.println(g1+" "+dtr+" "+ super.kidsname1);
	System.out.println(g1+" "+ from+" "+b);
	String g2= a.name(gkds2);
	System.out.println(g2+" "+dtr+" "+ super.kidsname1);
	System.out.println(g2+" "+ from+" "+b);
	 return toString();//return object
 }

}
