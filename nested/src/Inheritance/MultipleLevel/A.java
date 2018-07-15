package Inheritance.MultipleLevel;
/*
 * write an application for Molla family to describe their family tree
 * and wealth.
 * Mannan molla has three kids and two grand daughters.
 */
public class A {
	int cash;             // instance variables
	double gold;
	float house;
	String Name;
	String WifeName;
	String country;
	static String FamilyName="Molla";   // static variable
	
	
	A(){}  // 0 arg constructor or default 
	A(int cash,double gold,float house ){ // initializing
		this.cash = cash;
		this.gold= gold;
		this.house=house;
		
	}
	A(String country){this.country= country;}// has overriding method for country
	A(String Name,String WifeName,String country){
		this.Name=Name;
		this.WifeName=WifeName;
		
	}
	A value( int cash,double gold,float house){ // regular method
		/*cash=55; // hard coding
		gold=66.55;
		house=77.99f;*/
		double total = cash+gold+house;
//System.out.println("total value"+" "+"cash"+cash+"gold"+gold+"house"+house);
		System.out.println("total value of Mannan Molla"+" "+total);
		return this;//return object
	}
	 String name( String Name){ // overridden method
		
		System.out.println(Name+" "+FamilyName);
		return Name;// return variable
	}
	 String wifeName( String WifeName){ // overridden method
			
			System.out.println(WifeName+" "+FamilyName);
			return WifeName;
		}
	 String country(String country){ // overridden method
		country = "Bangladesh";
		//System.out.println(country);
		return country;
	}
	

}
