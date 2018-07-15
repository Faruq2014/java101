
package method;

public class inner_method_calling {
public void molla(){
	System.out.println("number 1"); // one method calling another
	chowdhory();  
	sha();  // one method can call multiple method
	inner_method_calling.khan();
}
public void chowdhory(){
	System.out.println("number 2");
	sha();
}
public void sha(){
	System.out.println("number 3");
	inner_method_calling.khan();
	 
}
public static void khan(){
	System.out.println("number 4");
	inner_method_calling imc = new inner_method_calling();
	imc.m5();
}
public void m5(){
	System.out.println(" calling all the methods");
	
	
}

	public static void main(String[] args) {
		
		inner_method_calling imc = new inner_method_calling();
	imc.molla();	
	}

}
