package returnType;

public class ReturnTypeSameClassObject {

	ReturnTypeSameClassObject m1(){
		System.out.println("method m1");
		ReturnTypeSameClassObject rtsco = new ReturnTypeSameClassObject();//creating reference
		return rtsco;
	}
	ReturnTypeSameClassObject m2(){
		String name = "Faruq";
		System.out.println("method m2"+" "+name);
		
		return this; // most recommended 
	}
	 ReturnTypeSameClassObject m3(){
		System.out.println("method3");
		return new ReturnTypeSameClassObject(); // with new key word, creating reference. 
	}
	static ReturnTypeSameClassObject m4(){
System.out.println("method m4");
  return new ReturnTypeSameClassObject();
		//return this;    // static method this key word can not use.
	                     // have to use new key word to make reference and return object.
	}
	public static void main(String[] args) {
		ReturnTypeSameClassObject rtsco = new ReturnTypeSameClassObject();
		rtsco.m1();rtsco.m2();rtsco.m3(); // holding or storing the value is optional.
		ReturnTypeSameClassObject.m4();
	  
	  // but if you need to transfer this object to another class, you have to make an 
	  // Referential object of it.if you make referential object, you can use them 
	  //as a variable.
	  System.out.println();
	  ReturnTypeSameClassObject t1=	 rtsco.m1();
	  System.out.println(t1.equals(t1));
	  //System.out.println(t1);
	  System.out.println();
	  ReturnTypeSameClassObject t2 = rtsco.m2();
	  System.out.println(t2.m1());
	  System.out.println();
	  
	  ReturnTypeSameClassObject t3 =rtsco.m3();
	  System.out.println(t3.equals(t1));
	  System.out.println(t3.m2());
	  System.out.println();
	  ReturnTypeSameClassObject t4 = ReturnTypeSameClassObject.m4();
	  System.out.println(t4.equals(t4));

	}

}

