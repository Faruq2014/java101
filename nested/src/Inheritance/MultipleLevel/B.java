package Inheritance.MultipleLevel;

public class B extends A{
 static	String wifename;
 String kidsname1="Faruq";
 String kidsname2;
 String kidsname3;
 double car1;
 double car2;
 B(){}
 B(String kidsname1,String kidsname2,String kidsname3){
	this.kidsname1= kidsname1;
	this.kidsname2= kidsname2; 
	this.kidsname3= kidsname3;
 }
 B(double car1,double car2){
	 this.car1= car1;
	 this.car2= car2;
 }
 
 B  children(String kidsname1,String kidsname2,String kidsname3){
	/* System.out.println(kidsname1+" "+FamilyName);
	 //System.out.println(kidsname2+" "+FamilyName);
	 //System.out.println(kidsname3+" "+FamilyName);
	  * using variable to declare kids name
	*/
	 
	 String s = "is the son of"; // local variables
	 String dtr = "is the daughter of";
	 String from = "is from";
	 String wife = "is the wife of";
	 A a= new A();  // calling inherited method to declare kids name
	 String d=a.country("Bangladesh");
	// a.name(kidsname1);
	String f1=a.name(kidsname1);
	System.out.println(f1+" "+ s +" "+FamilyName);
	System.out.println(f1+" "+ from+" "+d);
	System.out.println();
	 //a.name(kidsname2);
	 String  f2=a.name(kidsname2);
		System.out.println(f2+" "+ s +" "+FamilyName);
		System.out.println(f2+" "+ from+" "+d);
		System.out.println();
	// a.name(kidsname3);
	 String  f3=a.name(kidsname3);
		System.out.println(f3+" "+ dtr +" "+FamilyName);
		System.out.println(f3+" "+from+" "+d);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		String f4=a.wifeName("Libi"); // calling wife method
		System.out.println(f4+" "+ wife+" "+f1 );
		System.out.println(f4+" "+from+" "+d);
	 return this;
	 
 }
 double vechicle(double car1,double car2){
	String fw = "faruq wealth is";
	 double total = car1+car2;
	 System.out.println(fw+" "+total);
	//System.out.println("value of camry"+ car1+" "+"value of van"+car2);
	 return car1;
 }
  
    
 

}
