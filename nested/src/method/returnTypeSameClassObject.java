package method;

public class returnTypeSameClassObject {
	returnTypeSameClassObject m1(){
		System.out.println("method m1");
		returnTypeSameClassObject rtsco = new returnTypeSameClassObject();
		return rtsco;
	}
	returnTypeSameClassObject m2(){
		String name = "Faruq";
		System.out.println("method m2"+" "+name);
		
		return this; // most recommended 
	}
	 returnTypeSameClassObject m3(){
		System.out.println("method3");
		return new returnTypeSameClassObject();
	}
	static returnTypeSameClassObject m4(){
System.out.println("method m4");
  return new returnTypeSameClassObject();
		//return this;    // static method this key word can not use.
	}
	public static void main(String[] args) {
		returnTypeSameClassObject rtsco = new returnTypeSameClassObject();
		rtsco.m1();rtsco.m2();rtsco.m3(); // holding or storing the value is optional.
	  returnTypeSameClassObject.m4();
	  
	  // but if you need to transfer this object to another class, you have to make an 
	  // Referential object of it.if you make referential object, you can use them 
	  //as a variable.
	  System.out.println();
	  returnTypeSameClassObject t1=	 rtsco.m1();
	  System.out.println(t1.equals(t1));
	  System.out.println();
	  returnTypeSameClassObject t2 = rtsco.m2();
	  System.out.println(t2.m1());
	  System.out.println();
	  
	  returnTypeSameClassObject t3 =rtsco.m3();
	  System.out.println(t3.equals(t1));
	  System.out.println(t3.m2());
	  System.out.println();
	  returnTypeSameClassObject t4 = returnTypeSameClassObject.m4();
	  System.out.println(t4.equals(t4));

	}

}
