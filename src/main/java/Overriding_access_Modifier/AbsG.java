package Overriding_access_Modifier;

public class AbsG extends Absc{
	
public void m1(){
	for(int i=100; i>=10;i--){
		if(i==90)break;
		System.out.println(i);
		
	}
	/*in class Absc m1 method is abstract, so class AbsG 
	 * must define his own implementation.
	 * so #1. abstract to non abstract
	 *        non abstract to abstract
	 *    #2 synchronized to non synchronize
	 *    non synchronized to synchronized
	 *    #3 native to non native
	 *    non native to native
	 *    you can change from parent method to child method
	 *     
	 *    #4 non final method you can change to final method 
	 *    in the child class.
	 *    #5 but final method in parent class can not change to non
	 *    final or final. 
	 * 
	 */
}
public static void main(String[]args){
	AbsG t = new AbsG();
	t.m1();
}
}
