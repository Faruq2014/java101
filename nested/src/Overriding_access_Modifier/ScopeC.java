package Overriding_access_Modifier;

import java.util.ArrayList;

public class ScopeC extends ScopeP {
	//void m1(){}
	/*can not reduce the scope of access level
	in parent class m1 method is public, so public is the
	 highest access level, so no change at all for public modifier.
	 remember for private method there is no access 
	 from other class so no inheritance so no overriding.
	
	*/
	protected void m2(){
		
		ArrayList<Integer> arrlist= new ArrayList<Integer>();
	arrlist.add(10);
	arrlist.add(15);
	arrlist.add(19);
	arrlist.add(18);
	arrlist.add(80);
	arrlist.add(17);
	arrlist.add(30);
	arrlist.add(9999);
	System.out.println("for loop");
	for (int  i=0; i<arrlist.size(); i ++){
	System.out.println(arrlist.get(i));
	}/* in parent class m2 is default method, in child class we increase 
	//the scope of access modifier.so for you can change the scope of 
	//default and protected method access modifier.
	public->public
	protected--> protected or public
	default---> default or protected or public
	private----->  overriding concept not applicable at all.
	*/
	}
	public static void main(String[] args) {

		ScopeP t = new ScopeC();
		 t.m1(); t.m2();
	}

}
